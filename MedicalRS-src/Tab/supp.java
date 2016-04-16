package Tab;

import Functions.Get;
import Functions.Table;
import Functions.Sql;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class supp  extends JPanel  {

     /**
     *
     */
    public  supp() {
         JPanel pp=new JPanel();
         pp.setLayout(new GridLayout());
         final JTextField year=new JTextField();
         final JComboBox mm=new JComboBox(Get.MM);
         final JComboBox dd=new JComboBox(Get.DD);
         pp.add(dd);
         pp.add(mm);
         pp.add(year);
         BufferedImage I = null;
        try {
            I=ImageIO.read(getClass().getResource("/Image/tab.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(supp.class.getName()).log(Level.SEVERE, null, ex);
        }
        final JLabel supp = new JLabel(new ImageIcon(I));
         final Table T=new Table();
         final Sql db=new Sql();
         add(supp);
        try 
        {
            Get.sxx= T.getTable("select * from Supp");
        } catch (Exception ex1) 
        {
             showMessageDialog(null,ex1.getMessage());
        }
         try {
             Get.sx1= T.getTable("select Product,DMF,DOE,Batch,Package,Quantity,Price,date from Prod2 where SID='Admin'");
         } catch (Exception ex) {
             Logger.getLogger(supp.class.getName()).log(Level.SEVERE, null, ex);
         }
        Get.sx1.setEnabled(false);
        Get.sx1.setForeground(Get.Color);
        Get.sl1 = new JScrollPane(Get.sx1);
        supp.add(Get.sl1);
        Get.sl1.setBounds(400,0,600,450);
        final JTable sxx1=Get.sxx;
        Get.sxx.setForeground(Get.Color);
        Get.sxx.setEnabled(false);
        Get.slx = new JScrollPane(Get.sxx);
        final JTextField spp=new JTextField("SID",40);
        supp.setLayout(null);
        JButton sbp=new JButton("Detail");
        JButton del1=new JButton("Delete Supplier Detail");
        final JTextField prod=new JTextField();
        supp.add(Get.slx);
        supp.add(spp);
        supp.add(sbp);
        supp.add(pp);
        supp.add(del1);
        supp.add(prod);
        Get.slx.setBounds(0,0,400,450);
        spp.setBounds(1000,0,300,30);
        sbp.setBounds(1000,150,300,50);
        prod.setBounds(1000,50,300,30);
        pp.setBounds(1000,100,300,30);
        del1.setBounds(1000,200,300,50);
        del1.addActionListener(new ActionListener() 
        {
       @Override
       public void actionPerformed(ActionEvent arg0) 
        {
    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
    } else if (response == JOptionPane.YES_OPTION)
    {db.sql(0,"truncate table Supp","Supplier Details are Deleted");
        try {
            Get.slx = new JScrollPane(T.getTable("select * from Supp"));
        } catch (Exception ex) {
            showMessageDialog(null,ex.getMessage());
        }
            Get.slx.setForeground(Get.Color);
            Get.slx.setEnabled(false);
            supp.add(Get.slx);
            Get.slx.setBounds(0,0,400,450);}
            }
        });
        sbp.addActionListener(new ActionListener() 
        {
            @Override
 public void actionPerformed(ActionEvent arg0) 
 {
   try 
        {
        supp.remove(Get.sl1);
          if(!"".equals(year.getText()))
            {
        Get.sx1= T.getTable("select Product,DMF,DOE,Batch,Package,Quantity,Price,date from Prod2 where SID='"+spp.getText()+"' "+"and date='"+mm.getSelectedItem().toString()+" "+ dd.getSelectedItem().toString()+","+year.getText()+"'");
            }
          if(!"".equals(prod.getText()))
            {
        Get.sx1= T.getTable("select Product,DMF,DOE,Batch,Package,Quantity,Price,date from Prod2 where SID='"+spp.getText()+"' "+"and Product='"+prod.getText()+"'");
            }
          if(!"".equals(prod.getText())&&!"".equals(year.getText()))
            {
        Get.sx1= T.getTable("select Product,DMF,DOE,Batch,Package,Quantity,Price,date from Prod2 where SID='"+spp.getText()+"' "+"and Product='"+prod.getText()+"' "+"and date='"+mm.getSelectedItem().toString()+" "+ dd.getSelectedItem().toString()+","+year.getText()+"'");
            }
        if("".equals(year.getText())&&"".equals(prod.getText()))
            {
          Get.sx1= T.getTable("select Product,DMF,DOE,Batch,Package,Quantity,Price,date from Prod2 where SID='"+spp.getText()+"'");
            }
        Get.sx1.setEnabled(false);
        Get.sx1.setForeground(Get.Color);
        Get.sl1 = new JScrollPane(Get.sx1);
        supp.add(Get.sl1);
        Get.sl1.setBounds(400,0,600,450);
          
        } catch (Exception ex1) 
        {
                    showMessageDialog(null,ex1.getMessage());
        }   
 }
 });
        Get.b1$4.addActionListener(new ActionListener() 
{
            public void actionPerformed(ActionEvent arg0)
            { 
                remove(Get.slx);
             try 
             {
            Get.slx = new JScrollPane(T.getTable("select * from Supp"));
            Get.slx.setForeground(Get.Color);
            Get.slx.setEnabled(false);
            supp.add(Get.slx);
            Get.slx.setBounds(0,0,400,450);
            }
             catch (Exception ex) 
             {
            showMessageDialog(null,ex.getMessage());
            }
            }
        });
    }
    
}
