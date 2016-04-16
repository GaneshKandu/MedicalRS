/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;
import Functions.Get;
import Functions.Table;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static java.lang.Class.forName;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author Admin
 */
public class Products extends JPanel
{
    /**
     *
     */
    public  Products() {
        final Get g=new Get();
        final Table T=new Table();
        setLayout(new BorderLayout());
        final JPanel pro1 = new JPanel();
        final JPanel pro2 = new JPanel();
        pro1.setLayout(new FlowLayout());
        pro2.setLayout(new GridLayout());
        add(pro1, BorderLayout.NORTH);
        add(pro2, BorderLayout.CENTER);
        try
        {
            Get.products =T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE>='"+g.Date()+"' and p2.Quantity>0");
        }catch (Exception ex) 
        {
            showMessageDialog(null,ex);
        }
        Get.products.setForeground(Get.Color);
        Get.spane = new JScrollPane(Get.products);
        pro2.add(Get.spane);
        Get.products.setEnabled(false);
        final JComboBox set=new JComboBox();
	set.setEditable(true);
        JButton seb = null;
        try {
            seb = new JButton(new ImageIcon((ImageIO.read(getClass().getResource("/Image/search.png")))));
        } catch (IOException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel search = null;
        try {
            search = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/search.GIF"))));
        } catch (IOException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        search.setLayout(new GridLayout());
        set.setFont(new Font("Monospaced", Font.PLAIN,20));
        pro1.add(search);
        search.add(set);
        pro1.add(seb); 
        seb.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
           Connection conn = null;
           Statement stmt = null;
           ResultSet rs=null;
            try {
                    forName("org.h2.Driver");
            conn =  getConnection("jdbc:h2:file:./db/MedicaRSl","ganesh","ganesh");
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select p1.Product from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE>='"+g.Date()+"' and p2.Quantity>0 and p2.Product like '"+set.getSelectedItem().toString()+"%'");
            set.removeAllItems();
            int i=0;
            while(rs.next())
            {
                i++;
            set.addItem(rs.getString("Product"));
            set.showPopup();
            set.setPopupVisible(true);
            }
            if(i==0)
            {
                        showMessageDialog(null,"No Data Found");
            }
            conn.close();
            stmt.close();
            rs.close();
            }
            catch (SQLException ex) 
            {
                   showMessageDialog(null,ex);
            } 
            catch (NullPointerException ex)
            {
                    showMessageDialog(null,"No Input Found");
            }   
            catch (ClassNotFoundException ex) 
            {
                    showMessageDialog(null,"Data Base Connection Fail");
            }
            }
        }); 
        
        class Refresh
        {
            Refresh()
            {      
                try 
         {
         pro2.removeAll();
         Get.products=T.getTable("select p1.Product,p1.Containt,p1.Company,p2.DMF,p2.DOE,p2.Batch,p2.Package,p2.Quantity,p2.Price from Prod1 p1 inner JOIN Prod2 p2 on p1.Product=p2.Product where p2.DOE>='"+g.Date()+"' and p2.Quantity>0");
         Get.spane = new JScrollPane(Get.products);
         pro2.add(Get.spane);
         Get.products.setForeground(Get.Color);
         Get.products.setEnabled(false);
         } catch (Exception ex)
         {
            showMessageDialog(null,ex.getMessage());
         }
            }
        }
        Get.sa.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0) {Refresh r=new Refresh();}});       
        Get.b1$4.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0) {Refresh r=new Refresh();}});       
        Get.del.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent arg0) {Refresh r=new Refresh();}});       
        
    }
}
