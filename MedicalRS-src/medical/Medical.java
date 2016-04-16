
package medical;

import Functions.Get;
import Functions.Sql;
import Tab.Order;
import Tab.list;
import Tab.Setting;
import Tab.Products;
import Tab.Expiries;
import Tab.Bill;
import Tab.anr;
import Tab.supp;
import Tab.Old;
import Tab.Reportt;
import Tab.Purches;
import Tab.ordered;
import Head.head;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import org.h2.jdbcx.JdbcDataSource;

/**
 *
 * @author Admin
 */
public class Medical extends JFrame
{
    public static void main(String[] args)
    {
        Medical m=new Medical();
        m = null;
    }
Medical()
{
    
        int lo=0;
        Sql db=new Sql();
db.sql(1,"CREATE TABLE if not EXISTS Orders(\n" +
"	Product varchar NOT NULL,\n" +
"	Package varchar NOT NULL,\n" +
"	Quantity int NOT NULL,\n" +
"	Containt varchar NOT NULL,\n" +
"	Company varchar NOT NULL\n" +
");","");
db.sql(1,"CREATE TABLE if not EXISTS Setting(\n" +
"	Owner varchar NOT NULL,\n" +
"	MediName varchar NOT NULL,\n" +
"	Address varchar  NOT NULL,\n" +
"	Tel varchar NOT NULL,\n" +
"	DLN varchar NOT NULL,\n" +
"	ST varchar NOT NULL,\n" +
"	MUser varchar NOT NULL\n" +
");","");
db.sql(1,"CREATE TABLE if not EXISTS Prod2(\n" +
"	Product varchar NOT NULL,\n" +
"	DMF datetime NOT NULL,\n" +
"	DOE datetime NOT NULL,\n" +
"	Batch varchar NOT NULL,\n" +
"	Package varchar NOT NULL,\n" +
"	Quantity int NOT NULL,\n" +
"	Price double NOT NULL,\n" +
"	SID varchar NOT NULL,\n" +
"	Date datetime NOT NULL\n" +
");","");
db.sql(1,"CREATE TABLE if not EXISTS Supp(\n" +
"	SName varchar NOT NULL,\n" +
"	SID varchar NOT NULL,\n" +
"	SCont varchar NOT NULL,\n" +
"	SEID varchar NOT NULL\n" +
");","");
db.sql(1,"CREATE TABLE if not EXISTS Prod1(\n" +
"	Product varchar(500)  Primary key NOT NULL,\n" +
"	Containt varchar NOT NULL,\n" +
"	Company varchar NOT NULL,\n" +
");","");
db.sql(1,"CREATE TABLE if not EXISTS Report(\n" +
"	date smalldatetime NOT NULL,\n" +
"	sold double NULL,\n" +
"	buy double NULL,\n" +
"	Profite double NULL\n" +
");","");

//db.sql(1,"insert into Setting values('Ganesh Kandu','Medical Name','Address','9876543210','1234556','Thane','Admin');","");

        JFrame load=new JFrame();
        load.setUndecorated(true);
        //load.setOpacity(0.4f);
        Get g=new Get();
        JLabel loading = null;
        add(new JLabel("<html>Text color: <font color='red'>red</font></html>"));
        try 
        {
            loading = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/loading.gif"))));
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        Toolkit toolkit =  getDefaultToolkit ();
        Dimension dim = toolkit.getScreenSize();
        load.setBounds(dim.width/2-320,dim.height/2-240,640,480);
        try {
            load.setIconImage(new ImageIcon(ImageIO.read(getClass().getResource("/Image/medical_logo.png"))).getImage());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            setIconImage(new ImageIcon(ImageIO.read(getClass().getResource("/Image/medical_logo.png"))).getImage());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        load.add(loading);
        load.setVisible(true);
        JProgressBar ld = new JProgressBar(0,100);
        loading.add(ld);
        ld.setValue(0);
        ld.setStringPainted(true);
        ld.setFont(new Font("Serif", Font.BOLD,25));
        ld.setForeground(Color.green);
        ld.setBackground(Color.blue);
        ld.setBounds(50,400,540,30);
        JTabbedPane tab = new JTabbedPane();
        tab.setBackground(Color.yellow);
        tab.setForeground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Medical  Record  System");
        setSize(1_366,728);
        ld.setValue(10);
        try {
            tab.addTab("Products",new ImageIcon(ImageIO.read(getClass().getResource("/Image/product.png"))),new Products());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(15);
        try {
            tab.addTab("Expiries",new ImageIcon(ImageIO.read(getClass().getResource("/Image/expiry.png"))),new Expiries());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(20);
        try {
            tab.addTab("Lists",new ImageIcon(ImageIO.read(getClass().getResource("/Image/list.png"))),new list());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(30);
        try {
            tab.addTab("Ordered",new ImageIcon(ImageIO.read(getClass().getResource("/Image/order.png"))),new ordered());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(35);
        try {
            tab.addTab("Order",new ImageIcon(ImageIO.read(getClass().getResource("/Image/order.png"))),new  Order());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(40);
        try {
            tab.addTab("Parches",new ImageIcon(ImageIO.read(getClass().getResource("/Image/perchus.png"))),new  Purches());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(45);
        try {
            tab.addTab("Setting",new ImageIcon(ImageIO.read(getClass().getResource("/Image/setting.png"))),new  Setting());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(50);
        try {
            tab.addTab("Bill",new ImageIcon(ImageIO.read(getClass().getResource("/Image/bill.png"))),new  Bill());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(55);
        try {
            tab.addTab("Saved Bills",new ImageIcon(ImageIO.read(getClass().getResource("/Image/oldbills.png"))),new  Old());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(60);
        try {
            tab.addTab("Add",new ImageIcon(ImageIO.read(getClass().getResource("/Image/add.png"))),new  anr());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(65);
        try {
            tab.addTab("Supplier Detail",new ImageIcon(ImageIO.read(getClass().getResource("/Image/sup.png"))),new supp());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        ld.setValue(70);
        try {
            tab.addTab("Report",new ImageIcon(ImageIO.read(getClass().getResource("/Image/Report.png"))),new Reportt());
        } catch (IOException ex) {
            Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
        }
        remove(loading);
        add(new head(), BorderLayout.NORTH);
        add(tab, BorderLayout.CENTER);
        ld.setValue(100);
        int j=0,k=1;
        while (true) 
        {
            try {
                j++;         
                Thread.sleep(10); 
                Calendar cal = new GregorianCalendar();  
                String dt="Date: ";
                dt += valueOf(cal.get(Calendar.DATE)) + "/";
                dt += valueOf(cal.get(Calendar.MONTH) + 1) + "/";
                dt += valueOf(cal.get(Calendar.YEAR)) + "  Time: ";
                dt += valueOf(cal.get(Calendar.HOUR)) + ":";
                dt += valueOf(cal.get(Calendar.MINUTE)) + ":";
                dt += valueOf(cal.get(Calendar.SECOND))+" ";
                if(cal.get(Calendar.AM_PM)==0){dt+="AM";}else{dt+="PM";}
                    head.date.setText(dt);
                    head.name0.setBounds(j%1613-269,155,670,30);
                    head.name1.setBounds((j+1364)%1613-269,155,670,30);
                    head.name2.setBounds((j+269)%1613-269,155,670,30);
                    head.name3.setBounds((j+537)%1613-269,155,670,30);
                    head.name4.setBounds((j+806)%1613-269,155,670,30);
                    head.name5.setBounds((j+1075)%1613-269,155,670,30);
                    Bill.date.setText(dt);
                    k=j%199;
                    if(k<100){k=0;}else{k=1;}
                try {
                    Order.IMG1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Image/medi0_"+k+".jpg"))));
                } catch (IOException ex) {
                    Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Order.IMG2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/Image/medi1_"+k+".jpg"))));
                } catch (IOException ex) {
                    Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(lo==0)
                {  
                    setVisible(true);
                    load.setVisible(false);
                    load.dispose();
                }
                lo=1;
            } catch (InterruptedException ex1) 
            {
                   showMessageDialog(null,ex1);
            }
        }
}

}
