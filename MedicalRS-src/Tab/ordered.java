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
public class ordered  extends JPanel  {

    /**
     *
     */
    public  ordered() {
         final Table T=new Table();
        try 
        {
            Get.oxx= T.getTable("select * from Orders");
        } catch (Exception ex1) 
        {
             showMessageDialog(null,ex1.getMessage());
        }  
        Get.oxx.setForeground(Get.Color);
        setLayout(new GridLayout(1, 1));
        Get.lxx = new JScrollPane(Get.oxx);
        add(Get.lxx);
        Get.oxx.setEnabled(false);
        Get.b$4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0)
          {
         removeAll();
        try 
        {
            Get.oxx= T.getTable("select * from Orders");
        } catch (Exception ex1) 
        {
             showMessageDialog(null,ex1.getMessage());
        }  
        Get.oxx.setForeground(Get.Color);
        setLayout(new GridLayout(1, 1));
        Get.lxx = new JScrollPane(Get.oxx);
        add(Get.lxx); 
        Get.oxx.setEnabled(false); 
            }
        });
    }

}
