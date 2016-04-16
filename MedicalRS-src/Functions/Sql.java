/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import static java.lang.Class.forName;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Admin
 */
public class Sql
{
    /*
     * @param i
     * @param sql
     * @param msg
     */
   
    public void sql(int i,String sql,String msg)
{
    try 
        {
            forName("org.h2.Driver");
            Connection conn = null;
            conn = getConnection("jdbc:h2:file:./db/MedicaRSl","ganesh","ganesh");
            Statement stmt = conn.createStatement(); 
            stmt.executeUpdate(sql);
            if(i==0)
            {
                showMessageDialog(null,msg);
            }
            conn.close();
            stmt.close();
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            showMessageDialog(null,ex.getMessage());
        }
}
}
