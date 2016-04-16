/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Report
{

    /**
     *
     * @param s
     * @param e
     * @return
     */
    public String[] report(String s,String e)
    {
        String[] price={"","","",""};
        try 
        {
            Class.forName("org.h2.Driver");
            Connection con = getConnection("jdbc:h2:file:./db/MedicaRSl","ganesh","ganesh");
            DefaultTableModel dm=new DefaultTableModel();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select sum(sold) as countp from Report where date between '"+s+"' and '"+e+"'");
            while(rs1.next())
            {
               price[0]=rs1.getString("countp");
            }
            ResultSet rs2=st.executeQuery("select sum(buy) as countp from Report where date between '"+s+"' and '"+e+"'");
            while(rs2.next())
            {
               price[1]=rs2.getString("countp");
            }
            ResultSet rs3=st.executeQuery("select sum(Price) as countp from Prod2 where DOE between '"+s+"' and '"+e+"'");
            while(rs3.next())
            {
               price[2]=rs3.getString("countp");
            }
            ResultSet rs4=st.executeQuery("select sum(Profite) as countp from Report where date between '"+s+"' and '"+e+"'");
            while(rs4.next())
            {
               price[3]=rs4.getString("countp");
            }
            con.close();
            st.close();
            rs1.close();
            rs2.close();
            rs3.close();
            rs4.close();
        } 
        catch (ClassNotFoundException ex) {
            showMessageDialog(null,ex.getMessage());
        } catch (SQLException ex) {
            showMessageDialog(null,ex.getMessage());
        }
        return price;
    }
}
