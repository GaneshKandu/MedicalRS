/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import static java.lang.Class.forName;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Table
{
    /**
     *
     * @param sql
     * @return
     * @throws Exception
     */
    public JTable getTable(String sql)throws Exception
{
        JTable t1=new JTable();
          try{
            forName("org.h2.Driver");
            Connection con= getConnection("jdbc:h2:file:./db/MedicaRSl","ganesh","ganesh");
            DefaultTableModel dm=new DefaultTableModel();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsmd=rs.getMetaData();
            int cols=rsmd.getColumnCount();
            String c[]=new String[cols];
            for(int i=0;i<cols;i++){
                c[i]=rsmd.getColumnName(i+1);
                dm.addColumn(c[i]);
            }
            //rows
            Object row[]=new Object[cols];
            while(rs.next()){
                for(int i=0;i<cols;i++){
                    row[i]=rs.getString(i+1);
                }
                dm.addRow(row);
            }
            t1.setModel(dm);
            con.close();
            st.close();
            rs.close();
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            showMessageDialog(null,ex.getMessage());
        } 
        return t1;
    }
}