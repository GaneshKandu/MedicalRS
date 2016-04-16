/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;
import java.awt.Color;
import static java.lang.Class.forName;
import static java.lang.String.valueOf;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Admin
 */
public class Get 
{     
   
    public static final String[] TT={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"};
       /**
     *
     */
    public static final String[] DD={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       /**
     *
     */
    public static final String[] MM={"January","February","March","April","May","June","July","August","September","October","November","December"};
    
       /**
     *
     */
    public static final String [] H={"product","Containt","Company","DMF","DOE","Batch","Package","Quantity","Price"};
       /**
     *
     */
    public static final Color Color=new Color(88,184,241,255);
       /**
     *
     */
    public static JButton sa = new JButton("Add");
       /**
     *
     */
    public static JButton b$4=new JButton("Save");
       /**
     *
     */
    public static JButton b1$4=new JButton("Save");
       /**
     *
     */
    public static JButton del=new JButton("Delete Expiries");
       /**
     *
     */
    public static JScrollPane spane;
       /**
     *
     */
    public static JScrollPane ex;
       /**
     *
     */
    public static JScrollPane lx;
       /**
     *
     */
    public static JScrollPane lxx;
       /**
     *
     */
    public static JScrollPane slx;
       /**
     *
     */
    public static JScrollPane sl1 = null;
       /**
     *
     */
    public static JTable sx1;
       /**
     *
     */
    public static JTable xxx;
       /**
     *
     */
    public static JTable oxx;
       /**
     *
     */
    public static JTable sxx;
       /**
     *
     */
    public static JTable expt;
       /**
     *
     */
    public static JTable products;
       String own="Owner"; 
       String mn="Medical Name"; 
       String add="Add";
       String tel="Tel";
       String dln="DLN";
       String st="ST";  
    /**
     *
     */
    public Get()
 {
          Connection conn = null;
          Statement stmt = null;
          ResultSet rs=null;
        try {
            forName("org.h2.Driver");
            conn = getConnection("jdbc:h2:file:./db/MedicaRSl","ganesh","ganesh");
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select * from Setting");
           while(rs.next())
            {
                own =rs.getString("Owner");
                mn=rs.getString("MediName");
                add="Add : "+rs.getString("Address");
                tel="Tel : "+rs.getString("Tel");
                dln="DLN : "+rs.getString("DLN");
                st =rs.getString("ST");
            }
        conn.close();
            }
            catch (SQLException | ClassNotFoundException ex) 
            {
            showMessageDialog(null,ex.getMessage());
            }
 } 
    /**
     *
     * @return
     */
    public String own(){return own;}
    /**
     *
     * @return
     */
    public String medi(){return mn;}
    /**
     *
     * @return
     */
    public String add(){return add;}
    /**
     *
     * @return
     */
    public String tel(){return tel;}
    /**
     *
     * @return
     */
    public String dln(){return dln;}
    /**
     *
     * @return
     */
    public String st() {return st;}
    /**
     *
     * @return
     */
    public String Date()
 {
       Calendar cal = new GregorianCalendar();  
    final String dt0=valueOf(cal.get(Calendar.YEAR))+"-"+cal.get(Calendar.MONTH)+"-"+valueOf(cal.get(Calendar.DATE));
    return dt0;
 }
    /**
     *
     * @return
     */
    public int YY()
 {
       Calendar cal = new GregorianCalendar();  
    int dyy=cal.get(Calendar.YEAR); 
    return dyy;
 }
 public String getmm(String mm){
     String m = "01";
     switch(mm){
         case "January":
             m = "01";
             break;
         case "February":
             m = "02";
             break;
         case "March":
             m = "03";
             break;
         case "April":
             m = "04";
             break;
         case "May":
             m = "05";
             break;
        case "June":
             m = "06";
            break;
        case "July":
             m = "07";
            break;
        case "August":
             m = "08";
            break;
        case "September":
             m = "09";
            break;
        case "October":
             m = "10";
            break;
        case "November":
             m = "11";
            break;
        case "December":
             m = "12";
            break;
     }
     
     return m;
 }
}
   
