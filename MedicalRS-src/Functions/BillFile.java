/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Admin
 */
public class BillFile 
{
    /**
     *
     * @param fn
     * @throws IOException
     */
    public static void Bill(String[] fn)throws IOException 
    {
        int i = 0;
        File f1;
        
        Calendar fol = new GregorianCalendar();
        String $ss=("Bills\\"+valueOf(fol.get(Calendar.YEAR))
                    +"\\"+valueOf(fol.get(Calendar.MONTH) + 1)
                   +"\\"+valueOf(fol.get(Calendar.DATE))
                   +"\\"+valueOf(fol.get(Calendar.HOUR)+fol.get(Calendar.AM_PM)*12));
File di=new File($ss);
        di.mkdirs();
        while (true)
        {
                f1 = new File($ss+"\\"+"Bill_" + i + ".txt");
                if (!f1.exists()) {
                f1.createNewFile();
                Writer(i, fn,$ss);
                i++;
                break;
            }
            i++;
        }
    }

    /**
     *
     * @param j
     * @param f5
     * @param h$
     * @throws IOException
     */
    public static void Writer(int j, String[] f5,String h$) throws IOException 
    {
        File f3 = new File(h$+"\\"+"Bill_" + j + ".txt");
        FileWriter wrt = new FileWriter(f3);
        f5[27]="Bill Name: "+"Bill_"+j+".txt";
        for(int i=0;i<29;i++)
        {
        wrt.append(f5[i]+"\n");
        wrt.flush();
        }
        BillFile bf=new BillFile();
        if (f3.exists())
        {   showMessageDialog(null," Bill_" +j+ ".txt "+" Created Successfuly");}
        else
        {   showMessageDialog(null," Bill_" +j+ ".txt "+" Fail to Create");}
    }
    final File f3 =null;
}
