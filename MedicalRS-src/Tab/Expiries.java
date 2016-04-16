/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;
import Functions.Table;
import Functions.Sql;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Functions.Get;

/**
 *
 * @author Admin
 */
public class Expiries extends JPanel {

    /**
     *
     */
    public  Expiries() {
        final Sql db=new Sql();
        final Get g=new Get();
        final Table T=new Table();
        setLayout(new BorderLayout());
        JPanel Expiriesp1 = new JPanel();
        Expiriesp1.setBackground(Get.Color);
        final JPanel Expiriesp2 = new JPanel();
        Expiriesp1.setLayout(new FlowLayout());
        Expiriesp2.setLayout(new GridLayout());
        add(Expiriesp1, BorderLayout.NORTH);
        add(Expiriesp2, BorderLayout.CENTER);
        Expiriesp1.add(Get.del);
       try 
       {
            Get.expt= T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE<"+"'"+g.Date()+"' or p2.Quantity<=0");
       } catch (Exception ex1) 
       {
            showMessageDialog(null,ex1.getMessage());
       }
        Get.expt.setForeground(Get.Color);
       Get.ex = new JScrollPane(Get.expt);
       Expiriesp2.add(Get.ex);
       Get.expt.setEnabled(false);
       Get.del.addActionListener(new ActionListener() 
        {
       @Override
       public void actionPerformed(ActionEvent arg0) 
        {
    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
    } else if (response == JOptionPane.YES_OPTION)
    {
        db.sql(0,"delete from Prod2 where DOE<"+"'"+g.Date()+"' or Quantity<=0","Expiries are successfully deleted");
        Expiriesp2.removeAll();
       try 
       {
            Get.expt= T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE<"+"'"+g.Date()+"' or p2.Quantity<=0");
       } catch (Exception ex1) 
       {
            showMessageDialog(null,ex1.getMessage());
       }   
       Get.expt.setForeground(Get.Color);
       Get.ex = new JScrollPane(Get.expt);
       Expiriesp2.add(Get.ex);
       Get.expt.setEnabled(false);
    }
        }
        });
       class Refresh
       {
           Refresh()
           {
       Expiriesp2.removeAll();
       try 
       {
            Get.expt= T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE<"+"'"+g.Date()+"' or p2.Quantity<=0");
       } catch (Exception ex1) 
       {
            showMessageDialog(null,ex1.getMessage());
       }   
       Get.expt.setForeground(Get.Color);
       Get.ex = new JScrollPane(Get.expt);
       Expiriesp2.add(Get.ex);
       Get.expt.setEnabled(false);
           }
       }
       Get.b1$4.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
       Get.sa.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
       Get.del.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
   }
    
}
