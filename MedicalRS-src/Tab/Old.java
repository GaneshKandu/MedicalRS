/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;

import Functions.Get;
import Functions.PrintBillFile;
import Functions.ReadBill;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.print.PrintException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Admin
 */
public class Old  extends JPanel  {

    /**
     *
     */
    public  Old() {
        final PrintBillFile pb=new PrintBillFile();
        final String mb = "Select File. . . . . ";
        setLayout(new BorderLayout());
        JLabel old1 = null;
        try {
            old1 = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/bill.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Old.class.getName()).log(Level.SEVERE, null, ex);
        }
        JPanel old2 = new JPanel();
        add(old1,BorderLayout.WEST);
        add(old2,BorderLayout.CENTER);
        old2.setLayout(new GridLayout(1,1));
        final JTextArea bill = new JTextArea(mb);
        bill.setFont(new Font("Serif", Font.BOLD,50));
        JScrollPane sp2 = new JScrollPane(bill);
        old2.add(sp2);
        final ReadBill rrr=new ReadBill();
        old1.setLayout(new FlowLayout(3));final JComboBox tt=new JComboBox(Get.TT);
        final JComboBox dd=new JComboBox(Get.DD);
        final JComboBox mm=new JComboBox(Get.MM);
        final TextField yy=new TextField("2014",20);
        final JComboBox ff=new JComboBox();
        JButton fnd = null;
        try {
            fnd = new JButton("find",new ImageIcon(ImageIO.read(getClass().getResource("/Image/search_1.png"))));
        } catch (IOException ex) {
            Logger.getLogger(Old.class.getName()).log(Level.SEVERE, null, ex);
        }
        final JButton shw=new JButton("Show Bill");
        final JButton pp$=new JButton("Print");
        Calendar cal1 = new GregorianCalendar();
        dd.setSelectedIndex(cal1.get(Calendar.DATE)-1);
        mm.setSelectedIndex(cal1.get(Calendar.MONTH));
        yy.setText(valueOf(cal1.get(Calendar.YEAR)));
        tt.setSelectedIndex(cal1.get(Calendar.HOUR)-1+cal1.get(Calendar.AM_PM)*12);
        old1.setLayout(new GridBagLayout());
        GridBagConstraints old=new GridBagConstraints();
        old.gridx=0;
        old.gridy=0;
        old.weightx = 3.0;
        old.weighty = 1.0;
        old.gridheight=1;
        old.gridwidth=3;
        old1.add(new JLabel("Date DD/MM/YY"),old);
        old.gridx=0;
        old.gridy=1;
        old.weightx = 1.0;
        old.weighty = 1.0;
        old.gridheight=1;
        old.gridwidth=1;
        old1.add(dd,old);
        old.gridx=1;
        old.gridy=1;
        old.weightx = 1.0;
        old.weighty = 1.0;
        old1.add(mm,old);
        old.gridx=2;
        old.gridy=1;
        old.weightx = 1.5;
        old.weighty = 1.0;
        old1.add(yy,old);
        old.gridx=0;
        old.gridy=3;
        old.weightx = 1.5;
        old.weighty = 1.0;
        old.gridheight=1;
        old.gridwidth=1;
        old1.add(new JLabel("Hour"),old);
        old.gridx=1;
        old.gridy=3;
        old.weightx = 1.5;
        old.weighty = 1.0;
        old.gridheight=1;
        old.gridwidth=1;
        old1.add(tt,old);
        old.gridx=0;
        old.gridy=4;
        old.weightx = 3.0;
        old.weighty = 1.0;
        old.gridheight=1;
        old.gridwidth=3;
        old1.add(fnd,old);
        old.gridx=0;
        old.gridy=5;
        old.gridheight=1;
        old.gridwidth=3;
        old.weightx = 3.0;
        old.weighty = 1.0;
        old1.add(ff,old);
        old.gridx=0;
        old.gridy=6;
        old.gridheight=1;
        old.gridwidth=3;
        old.weightx = 3.0;
        old.weighty = 1.0;
        old1.add(shw,old);
        old.gridx=0;
        old.gridy=7;
        old.gridheight=1;
        old.gridwidth=3;
        old.weightx = 3.0;
        old.weighty = 1.0;
        old1.add(pp$,old);
        
        final Label x1=new Label();
        fnd.addActionListener(new ActionListener() 
        {
            @Override
       public void actionPerformed(ActionEvent arg0) 
        { 
            try {
Integer.parseInt(yy.getText());   
      String text= null;
      File f=new File("Bills\\"+yy.getText()+"\\"+(mm.getSelectedIndex()+1)+"\\"+dd.getSelectedItem()+"\\"+(tt.getSelectedIndex()+1)+"\\");
      String fa="Bills\\"+yy.getText()+"\\"+(mm.getSelectedIndex()+1)+"\\"+dd.getSelectedItem()+"\\"+(tt.getSelectedIndex()+1)+"\\";
      x1.setText(fa);
      File[] lf=f.listFiles();
      if(f.listFiles()==null)
      {
          ff.removeAllItems();
                    showMessageDialog(null,"File Not Found");
      }
      else
      {             for (File lf1 : lf) {
                        if (lf1.isFile()) {
                            text = lf1.getName();
                            ff.removeItem(text);
                            ff.addItem(text);
                        }
                    }
      }
        }
catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Enter Valid Year");}
        }
      });
      shw.addActionListener(new ActionListener() 
        {
       @Override
       public void actionPerformed(ActionEvent arg0) 
        {
          try 
        { 
        String x=x1.getText();
        String ggg = rrr.RB(x+ff.getSelectedItem());
        bill.setText(ggg);
        bill.setEditable(false); 
        bill.setFont(new Font("Monospaced", Font.PLAIN,13));
        }
        catch (IOException ex1)
        {
                    showMessageDialog(null,"File Not Selected");
        }  
        }
        });
      pp$.addActionListener(new ActionListener() 
        {
       @Override
       public void actionPerformed(ActionEvent arg0) 
        {
           try {
               pb.print(x1.getText()+ff.getSelectedItem());
           } catch (PrintException ex) {
               showMessageDialog(null,ex);
           } catch (IOException ex) {
              showMessageDialog(null,ex);
           }
        }
        }); 
    }
    
}
