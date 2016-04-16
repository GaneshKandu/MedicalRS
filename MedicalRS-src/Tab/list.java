/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;
import Functions.Get;
import Functions.Table;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Admin
 */
public class list  extends JPanel {

    /**
     *
     */
    public  list() {
        final Table T=new Table();
        try 
        {
            Get.xxx= T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product");
        } catch (Exception ex1) 
        {
             showMessageDialog(null,ex1.getMessage());
        }
        Get.xxx.setForeground(Get.Color);
        Get.lx = new JScrollPane(Get.xxx);
        add(Get.lx);
        Get.xxx.setEnabled(false);
        setLayout(new GridLayout(1, 1));
        class Refresh
        {
        Refresh()
        { 
                removeAll();
                try 
        {
            Get.xxx= T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product");
        } catch (Exception ex1) 
        {
             showMessageDialog(null,ex1.getMessage());
        }
        Get.xxx.setForeground(Get.Color);
        Get.lx = new JScrollPane(Get.xxx);
        add(Get.lx);
        Get.xxx.setEnabled(false);
        }
        }
   Get.b1$4.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
   Get.sa.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
   Get.del.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0){Refresh r=new Refresh();}});
    }
}
