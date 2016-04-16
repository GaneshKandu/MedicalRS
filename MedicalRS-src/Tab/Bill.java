/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;

import static Functions.BillFile.Bill;
import Functions.*;
import Functions.Get;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

/**
 *
 * @author Admin
 */
public class Bill  extends JPanel {
    /**
     *
     */
    public static JLabel date = new JLabel("Time");
    /**
     *
     */
    public  Bill() {
        final Get g=new Get();
        final space sp=new space();
        final Sql db=new Sql();
        setLayout(new BorderLayout());
        JLabel Newp1 = null;
        try {
            Newp1 = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/bill.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        JPanel Newp2 = new JPanel();
        Newp2.setBackground(Get.Color);
        add(Newp1, BorderLayout.WEST);
        add(Newp2, BorderLayout.CENTER);
        JLabel l1 = new JLabel(g.medi());
        JLabel l13 = new JLabel("Customer No.:");
        JLabel l3 = new JLabel(g.add());
        JLabel l8 = new JLabel(g.tel());
        JLabel l4 = new JLabel("Name Patient");
        final TextField t1 = new TextField(40);
        JLabel l5 = new JLabel("Name Docter");
        final TextField t2 = new TextField(40);
        JLabel l6 = new JLabel("Add of Patient");
        final TextField a1 = new TextField(40);
        JLabel l7 = new JLabel("Name of Hospital");
        final TextField a2 = new TextField(40);
        final JLabel l9 = new JLabel("Net Amount");
        JLabel l10 = new JLabel();
        l10.setText("Subject To:"+g.st());
        JLabel l11 = new JLabel("");
        JLabel l12 = new JLabel(g.dln());
        JLabel gws = new JLabel("Get Well Soon");
        gws.setForeground(Color.RED);
        gws.setFont(new Font("Serif", Font.BOLD, 24));
        Newp1.setLayout(new GridBagLayout());
        GridBagConstraints nb = new GridBagConstraints();
        nb.gridx = 0;
        nb.gridy = 0;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l1, nb);
        nb.gridx = 1;
        nb.gridy = 0;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(date, nb);
        nb.gridx = 0;
        nb.gridy = 1;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l13, nb);
        nb.gridx = 1;
        nb.gridy = 1;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l8, nb);
        nb.gridx = 0;
        nb.gridy = 2;
        nb.weightx = 2.0;
        nb.gridheight=1;
        nb.gridwidth=2;
        nb.weighty = 1.0;
        Newp1.add(l3, nb);
        nb.gridx = 0;
        nb.gridy = 3;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        nb.gridheight=1;
        nb.gridwidth=1;
        Newp1.add(l4, nb);
        nb.gridx = 1;
        nb.gridy = 3;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        nb.gridheight=1;
        nb.gridwidth=1;
        Newp1.add(t1, nb);
        nb.gridx = 0;
        nb.gridy = 4;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l5, nb);
        nb.gridx = 1;
        nb.gridy = 4;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(t2, nb);
        nb.gridx = 0;
        nb.gridy = 5;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l6, nb);
        nb.gridx = 1;
        nb.gridy = 5;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(a1, nb);
        nb.gridx = 0;
        nb.gridy = 6;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l7, nb);
        nb.gridx = 1;
        nb.gridy = 6;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(a2, nb);
        nb.gridx = 0;
        nb.gridy = 7;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l10, nb);
        nb.gridx = 1;
        nb.gridy = 7;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l9, nb);
        nb.gridx = 0;
        nb.gridy = 8;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l12, nb);
        nb.gridx = 1;
        nb.gridy = 8;
        nb.weightx = 1.0;
        nb.weighty = 1.0;
        Newp1.add(l11, nb);
        nb.gridx = 0;
        nb.gridy = 9;
        nb.weightx = 2.0;
        nb.weighty = 1.0;
        nb.gridheight=1;
        nb.gridwidth=2;
        Newp1.add(gws, nb);
        Newp2.setLayout(new GridLayout(14, 6));
        JLabel ll1 = new JLabel("Product");
        JLabel ll2 = new JLabel("Quantity");
        JLabel ll3 = new JLabel("Package");
        final JLabel ll4 = new JLabel("MRP(Rs.)");
        final JLabel ll5 = new JLabel("Total");
        JLabel ll6 = new JLabel("Company");
        JLabel ll7 = new JLabel("DOE");
        JLabel ll8 = new JLabel("");
        JLabel ll9 = new JLabel("");
        JPanel dox1=new JPanel(); 
        JPanel dox2=new JPanel(); 
        JPanel dox3=new JPanel(); 
        JPanel dox4=new JPanel(); 
        JPanel dox5=new JPanel(); 
        JPanel dox6=new JPanel(); 
        JPanel dox7=new JPanel(); 
        JPanel dox8=new JPanel(); 
        JPanel dox9=new JPanel(); 
        JPanel dox10=new JPanel();
        JPanel dox11=new JPanel();
        JPanel dox12=new JPanel();
       final JComboBox jce1=new JComboBox(Get.MM); 
       final JComboBox jce2=new JComboBox(Get.MM); 
       final JComboBox jce3=new JComboBox(Get.MM); 
       final JComboBox jce4=new JComboBox(Get.MM); 
       final JComboBox jce5=new JComboBox(Get.MM); 
       final JComboBox jce6=new JComboBox(Get.MM); 
       final JComboBox jce7=new JComboBox(Get.MM); 
       final JComboBox jce8=new JComboBox(Get.MM); 
       final JComboBox jce9=new JComboBox(Get.MM); 
       final JComboBox jce10=new JComboBox(Get.MM);
       final JComboBox jce11=new JComboBox(Get.MM);
       final JComboBox jce12=new JComboBox(Get.MM);
       final TextField doe1 = new TextField(20);
       final TextField doe2 = new TextField(20);
       final TextField doe3 = new TextField(20);
       final TextField doe4 = new TextField(20);
       final TextField doe5 = new TextField(20);
       final TextField doe6 = new TextField(20);
       final TextField doe7 = new TextField(20);
       final TextField doe8 = new TextField(20);
       final TextField doe9 = new TextField(20);
       final TextField doe10 = new TextField(20);
       final TextField doe11 = new TextField(20);
       final TextField doe12 = new TextField(20);
        dox1.setLayout(new GridLayout());dox1.add(jce1);dox1.add(doe1);
        dox2.setLayout(new GridLayout());dox2.add(jce2);dox2.add(doe2);
        dox3.setLayout(new GridLayout());dox3.add(jce3);dox3.add(doe3);
        dox4.setLayout(new GridLayout());dox4.add(jce4);dox4.add(doe4);
        dox5.setLayout(new GridLayout());dox5.add(jce5);dox5.add(doe5);
        dox6.setLayout(new GridLayout());dox6.add(jce6);dox6.add(doe6);
        dox7.setLayout(new GridLayout());dox7.add(jce7);dox7.add(doe7);
        dox8.setLayout(new GridLayout());dox8.add(jce8);dox8.add(doe8);
        dox9.setLayout(new GridLayout());dox9.add(jce9);dox9.add(doe9);
        dox10.setLayout(new GridLayout());dox10.add(jce10);dox10.add(doe10);
        dox11.setLayout(new GridLayout());dox11.add(jce11);dox11.add(doe11);
        dox12.setLayout(new GridLayout());dox12.add(jce12);dox12.add(doe12);
        final TextField ppr1 = new TextField(20);
        final TextField qqu1 = new TextField("1",20);
        final TextField ppa1 = new TextField(20);
        final TextField com1 = new TextField(20);
        final TextField pp1 = new TextField("0",10);
        final TextField ppr2 = new TextField(20);
        final TextField qqu2 = new TextField("1",20);
        final TextField ppa2 = new TextField(20);
        final TextField com2 = new TextField(20);
        final TextField pp2 = new TextField("0",10);
        final TextField ppr3 = new TextField(20);
        final TextField qqu3 = new TextField("1",20);
        final TextField ppa3 = new TextField(20);
        final TextField com3 = new TextField(20);
        final TextField pp3 = new TextField("0",10);
        final TextField ppr4 = new TextField(20);
        final TextField qqu4 = new TextField("1",20);
        final TextField ppa4 = new TextField(20);
        final TextField com4 = new TextField(20);
        final TextField pp4 = new TextField("0",10);
        final TextField ppr5 = new TextField(20);
        final TextField qqu5 = new TextField("1",20);
        final TextField ppa5 = new TextField(20);
        final TextField com5 = new TextField(20);
        final TextField pp5 = new TextField("0",10);
        final TextField ppr6 = new TextField(20);
        final TextField qqu6 = new TextField("1",20);
        final TextField ppa6 = new TextField(20);
        final TextField com6 = new TextField(20);
        final TextField pp6 = new TextField("0",10);
        final TextField ppr7 = new TextField(20);
        final TextField qqu7 = new TextField("1",20);
        final TextField ppa7 = new TextField(20);
        final TextField com7 = new TextField(20);
        final TextField pp7 = new TextField("0",10);
        final TextField ppr8 = new TextField(20);
        final TextField qqu8 = new TextField("1",20);
        final TextField ppa8 = new TextField(20);
        final TextField com8 = new TextField(20);
        final TextField pp8 = new TextField("0",10);
        final TextField ppr9 = new TextField(20);
        final TextField qqu9 = new TextField("1",20);
        final TextField ppa9 = new TextField(20);
        final TextField com9 = new TextField(20);
        final TextField pp9 = new TextField("0",10);
        final TextField ppr10 = new TextField(20);
        final TextField qqu10 = new TextField("1",20);
        final TextField ppa10 = new TextField(20);
        final TextField com10 = new TextField(20);
        final TextField pp10 = new TextField("0",10);
        final TextField ppr11 = new TextField(20);
        final TextField qqu11 = new TextField("1",20);
        final TextField ppa11 = new TextField(20);
        final TextField com11 = new TextField(20);
        final TextField pp11 = new TextField("0",10);
        final TextField ppr12 = new TextField(20);
        final TextField qqu12 = new TextField("1",20);
        final TextField ppa12 = new TextField(20);
        final TextField com12 = new TextField(20);
        final TextField pp12 = new TextField("0",10);
        JButton r = new JButton("Reset");
        JButton s1 = new JButton("Save");
        JButton to = new JButton("Total");
        Newp2.add(ll1);
        Newp2.add(ll2);
        Newp2.add(ll3);
        Newp2.add(ll6);
        Newp2.add(ll7);
        Newp2.add(ll4);
        Newp2.add(ppr1);
        Newp2.add(qqu1);
        Newp2.add(ppa1);
        Newp2.add(com1);
        Newp2.add(dox1);
        Newp2.add(pp1);
        Newp2.add(ppr2);
        Newp2.add(qqu2);
        Newp2.add(ppa2);
        Newp2.add(com2);
        Newp2.add(dox2);
        Newp2.add(pp2);
        Newp2.add(ppr3);
        Newp2.add(qqu3);
        Newp2.add(ppa3);
        Newp2.add(com3);
        Newp2.add(dox3);
        Newp2.add(pp3);
        Newp2.add(ppr4);
        Newp2.add(qqu4);
        Newp2.add(ppa4);
        Newp2.add(com4);
        Newp2.add(dox4);
        Newp2.add(pp4);
        Newp2.add(ppr5);
        Newp2.add(qqu5);
        Newp2.add(ppa5);
        Newp2.add(com5);
        Newp2.add(dox5);
        Newp2.add(pp5);
        Newp2.add(ppr6);
        Newp2.add(qqu6);
        Newp2.add(ppa6);
        Newp2.add(com6);
        Newp2.add(dox6);
        Newp2.add(pp6);
        Newp2.add(ppr7);
        Newp2.add(qqu7);
        Newp2.add(ppa7);
        Newp2.add(com7);
        Newp2.add(dox7);
        Newp2.add(pp7);
        Newp2.add(ppr8);
        Newp2.add(qqu8);
        Newp2.add(ppa8);
        Newp2.add(com8);
        Newp2.add(dox8);
        Newp2.add(pp8);
        Newp2.add(ppr9);
        Newp2.add(qqu9);
        Newp2.add(ppa9);
        Newp2.add(com9);
        Newp2.add(dox9);
        Newp2.add(pp9);
        Newp2.add(ppr10);
        Newp2.add(qqu10);
        Newp2.add(ppa10);
        Newp2.add(com10);
        Newp2.add(dox10);
        Newp2.add(pp10);
        Newp2.add(ppr11);
        Newp2.add(qqu11);
        Newp2.add(ppa11);
        Newp2.add(com11);
        Newp2.add(dox11);
        Newp2.add(pp11);
        Newp2.add(ppr12);
        Newp2.add(qqu12);
        Newp2.add(ppa12);
        Newp2.add(com12);
        Newp2.add(dox12);
        Newp2.add(pp12);
        Newp2.add(ll8);
        Newp2.add(ll9);
        Newp2.add(r);
        Newp2.add(s1);
        Newp2.add(to);
        Newp2.add(ll5);
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                ppr1.setText("");
                ppr2.setText("");
                ppr3.setText("");
                ppr4.setText("");
                com1.setText("");
                doe1.setText("");
                qqu1.setText("1");
                qqu2.setText("1");
                qqu3.setText("1");
                qqu4.setText("1");
                com2.setText("");
                doe2.setText("");
                ppa1.setText("");
                ppa2.setText("");
                ppa3.setText("");
                ppa4.setText("");
                com3.setText("");
                doe3.setText("");
                pp1.setText("0");
                pp2.setText("0");
                pp3.setText("0");
                pp4.setText("0");
                com4.setText("");
                doe4.setText("");
                ppr5.setText("");
                ppr6.setText("");
                ppr7.setText("");
                ppr8.setText("");
                com5.setText("");
                doe5.setText("");
                qqu5.setText("1");
                qqu6.setText("1");
                qqu7.setText("1");
                qqu8.setText("1");
                com6.setText("");
                doe6.setText("");
                ppa5.setText("");
                ppa6.setText("");
                ppa7.setText("");
                ppa8.setText("");
                com7.setText("");
                doe7.setText("");
                pp5.setText("0");
                pp6.setText("0");
                pp7.setText("0");
                pp8.setText("0");
                com8.setText("");
                doe8.setText("");
                ppr9.setText("");
                ppr10.setText("");
                ppr11.setText("");
                ppr12.setText("");
                com9.setText("");
                doe9.setText("");
                qqu9.setText("1");
                qqu10.setText("1");
                qqu11.setText("1");
                qqu12.setText("1");
                com10.setText("");
                doe10.setText("");
                ppa9.setText("");
                ppa10.setText("");
                ppa11.setText("");
                ppa12.setText("");
                com11.setText("");
                doe11.setText("");
                pp9.setText("0");
                pp10.setText("0");
                pp11.setText("0");
                pp12.setText("0");
                com12.setText("");
                doe12.setText("");
                t1.setText("");
                t2.setText("");
                a1.setText("");
                a2.setText("");
            }
        });
        to.addActionListener(new ActionListener() {
            @Override
               public void actionPerformed(ActionEvent arg0) {
               double d$1=parseDouble(pp1.getText())*Integer.parseInt(qqu1.getText());
               double d$2=parseDouble(pp2.getText())*Integer.parseInt(qqu2.getText());
               double d$3=parseDouble(pp3.getText())*Integer.parseInt(qqu3.getText());
               double d$4=parseDouble(pp4.getText())*Integer.parseInt(qqu4.getText());
               double d$5=parseDouble(pp5.getText())*Integer.parseInt(qqu5.getText());
               double d$6=parseDouble(pp6.getText())*Integer.parseInt(qqu6.getText());
               double d$7=parseDouble(pp7.getText())*Integer.parseInt(qqu7.getText());
               double d$8=parseDouble(pp8.getText())*Integer.parseInt(qqu8.getText());
               double d$9=parseDouble(pp9.getText())*Integer.parseInt(qqu9.getText());
               double d$10=parseDouble(pp10.getText())*Integer.parseInt(qqu10.getText());
               double d$11=parseDouble(pp11.getText())*Integer.parseInt(qqu11.getText());
               double d$12=parseDouble(pp12.getText())*Integer.parseInt(qqu12.getText());
               double d$13=0+d$1+d$2+d$3+d$4+d$5+d$6+d$7+d$8+d$9+d$10+d$11+d$12;
               String totx=new Double(d$13).toString()+" Rs.";
               ll5.setText(totx);
               l9.setText(totx);
            }
        });
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
            if("".equals(t1.getText())||"".equals(t2.getText())||
               "".equals(a1.getText())||"".equals(a2.getText()))
                {
                    showMessageDialog(null,"Enter Some Input");
                }
                else
                {
                    try {
if(!"".equals(ppr1.getText())){Integer.parseInt(qqu1.getText()); parseDouble(pp1.getText()); Integer.parseInt(doe1.getText());}
if(!"".equals(ppr2.getText())){Integer.parseInt(qqu2.getText()); parseDouble(pp2.getText()); Integer.parseInt(doe2.getText());}
if(!"".equals(ppr3.getText())){Integer.parseInt(qqu3.getText()); parseDouble(pp3.getText());Integer.parseInt(doe3.getText());}
if(!"".equals(ppr4.getText())){Integer.parseInt(qqu4.getText()); parseDouble(pp4.getText());Integer.parseInt(doe4.getText());}
if(!"".equals(ppr5.getText())){Integer.parseInt(qqu5.getText()); parseDouble(pp5.getText());Integer.parseInt(doe5.getText());}
if(!"".equals(ppr6.getText())){Integer.parseInt(qqu6.getText()); parseDouble(pp6.getText());Integer.parseInt(doe6.getText());}
if(!"".equals(ppr7.getText())){Integer.parseInt(qqu7.getText()); parseDouble(pp7.getText());Integer.parseInt(doe7.getText());}
if(!"".equals(ppr8.getText())){Integer.parseInt(qqu8.getText()); parseDouble(pp8.getText());Integer.parseInt(doe8.getText());}
if(!"".equals(ppr9.getText())){Integer.parseInt(qqu9.getText());parseDouble(pp9.getText());Integer.parseInt(doe9.getText());}
if(!"".equals(ppr10.getText())){Integer.parseInt(qqu10.getText());parseDouble(pp10.getText());Integer.parseInt(doe10.getText());}
if(!"".equals(ppr11.getText())){Integer.parseInt(qqu11.getText());parseDouble(pp11.getText());Integer.parseInt(doe11.getText());}
if(!"".equals(ppr12.getText())){Integer.parseInt(qqu12.getText());parseDouble(pp12.getText());Integer.parseInt(doe12.getText());}
                    
                Calendar cal1 = new GregorianCalendar();
         double totb=0+parseDouble(pp1.getText())*Integer.parseInt(qqu1.getText())+0+
                    parseDouble(pp2.getText()) *Integer.parseInt(qqu2.getText())+
                    parseDouble(pp3.getText()) *Integer.parseInt(qqu3.getText())+
                    parseDouble(pp4.getText()) *Integer.parseInt(qqu4.getText())+
                    parseDouble(pp5.getText()) *Integer.parseInt(qqu5.getText())+
                    parseDouble(pp6.getText()) *Integer.parseInt(qqu6.getText())+
                    parseDouble(pp7.getText()) *Integer.parseInt(qqu7.getText())+
                    parseDouble(pp8.getText()) *Integer.parseInt(qqu8.getText())+
                    parseDouble(pp9.getText()) *Integer.parseInt(qqu9.getText())+
                    parseDouble(pp10.getText())*Integer.parseInt(qqu10.getText())+
                    parseDouble(pp11.getText())*Integer.parseInt(qqu11.getText())+
                    parseDouble(pp12.getText())*Integer.parseInt(qqu12.getText());
                String dt1 = valueOf(cal1.get(Calendar.DATE)) + "/";
                dt1 += valueOf(cal1.get(Calendar.MONTH) + 1) + "/";
                dt1 += valueOf(cal1.get(Calendar.YEAR)) + "   Time";
                dt1 += valueOf(cal1.get(Calendar.HOUR)) + ":";
                dt1 += valueOf(cal1.get(Calendar.MINUTE)) + ":";
                dt1 += valueOf(cal1.get(Calendar.SECOND))+" ";
                if(cal1.get(Calendar.AM_PM)==0){dt1+="AM";}else{dt1+="PM";}
                String df =Get.MM[cal1.get(Calendar.MONTH)]+" "+valueOf(cal1.get(Calendar.DATE))+","+valueOf(cal1.get(Calendar.YEAR));
                String[] bill =new String[29];
                bill[0]= g.medi() +"\t\t\t\tDate: " +dt1+ "    " +g.tel();
                bill[1]= "-------------------------------------------------------------------------------------------------------------------";
                bill[2]= "Patient Name : " + t1.getText();
                bill[3]= "Doctor Name  : " + t2.getText() ;
                bill[4]= "Patient Add. : " + a1.getText();
                bill[5]= "Hospital Name: " + a2.getText();
                bill[6]= "-------------------------------------------------------------------------------------------------------------------";
                bill[7]= "Product             Quantity            Package             DOE                 Company             MRP            ";
                bill[8]= "-------------------------------------------------------------------------------------------------------------------";
if(!"".equals(ppr1.getText())) {bill[9]=sp.space(ppr1.getText())+sp.space(qqu1.getText())+sp.space(ppa1.getText())+sp.space(jce1.getSelectedItem().toString()+"-01,"+doe1.getText())+sp.space(com1.getText())+sp.space(pp1.getText()+"X"+Integer.parseInt(qqu1.getText()));}else{bill[9]=" ";}
if(!"".equals(ppr2.getText())) {bill[10]=sp.space(ppr2.getText())+sp.space(qqu2.getText())+sp.space(ppa2.getText())+sp.space(jce2.getSelectedItem().toString()+"-01,"+doe2.getText())+sp.space(com2.getText())+sp.space(pp2.getText()+"X"+Integer.parseInt(qqu2.getText()));}else{bill[10]=" ";}
if(!"".equals(ppr3.getText())) {bill[11]=sp.space(ppr3.getText())+sp.space(qqu3.getText())+sp.space(ppa3.getText())+sp.space(jce3.getSelectedItem().toString()+"-01,"+doe3.getText())+sp.space(com3.getText())+sp.space(pp3.getText()+"X"+Integer.parseInt(qqu3.getText()));}else{bill[11]=" ";}
if(!"".equals(ppr4.getText())) {bill[12]=sp.space(ppr4.getText())+sp.space(qqu4.getText())+sp.space(ppa4.getText())+sp.space(jce4.getSelectedItem().toString()+"-01,"+doe4.getText())+sp.space(com4.getText())+sp.space(pp4.getText()+"X"+Integer.parseInt(qqu4.getText()));}else{bill[12]=" ";}
if(!"".equals(ppr5.getText())) {bill[13]=sp.space(ppr5.getText())+sp.space(qqu5.getText())+sp.space(ppa5.getText())+sp.space(jce5.getSelectedItem().toString()+"-01,"+doe5.getText())+sp.space(com5.getText())+sp.space(pp5.getText()+"X"+Integer.parseInt(qqu5.getText()));}else{bill[13]=" ";}
if(!"".equals(ppr6.getText())) {bill[14]=sp.space(ppr6.getText())+sp.space(qqu6.getText())+sp.space(ppa6.getText())+sp.space(jce6.getSelectedItem().toString()+"-01,"+doe6.getText())+sp.space(com6.getText())+sp.space(pp6.getText()+"X"+Integer.parseInt(qqu6.getText())) ;}else{bill[14]=" ";}
if(!"".equals(ppr7.getText())) {bill[15]=sp.space(ppr7.getText())+sp.space(qqu7.getText())+sp.space(ppa7.getText())+sp.space(jce7.getSelectedItem().toString()+"-01,"+doe7.getText())+sp.space(com7.getText())+sp.space(pp7.getText()+"X"+Integer.parseInt(qqu7.getText()));}else{bill[15]=" ";}
if(!"".equals(ppr8.getText())) {bill[16]=sp.space(ppr8.getText())+sp.space(qqu8.getText())+sp.space(ppa8.getText())+sp.space(jce8.getSelectedItem().toString()+"-01,"+doe8.getText())+sp.space(com8.getText())+sp.space(pp8.getText()+"X"+Integer.parseInt(qqu8.getText()));}else{bill[16]=" ";}
if(!"".equals(ppr9.getText())) {bill[17]=sp.space(ppr9.getText())+sp.space(qqu9.getText())+sp.space(ppa9.getText())+sp.space(jce9.getSelectedItem().toString()+"-01,"+doe9.getText())+sp.space(com9.getText())+sp.space(pp9.getText()+"X"+Integer.parseInt(qqu9.getText()));}else{bill[17]=" ";}
if(!"".equals(ppr10.getText())){bill[18]=sp.space(ppr10.getText())+sp.space(qqu10.getText())+sp.space(ppa10.getText())+sp.space(jce10.getSelectedItem().toString()+"-01,"+doe10.getText())+sp.space(com10.getText())+sp.space(pp10.getText()+"X"+Integer.parseInt(qqu10.getText()));}else{bill[18]=" ";}
if(!"".equals(ppr11.getText())){bill[19]=sp.space(ppr11.getText())+sp.space(qqu11.getText())+sp.space(ppa11.getText())+sp.space(jce11.getSelectedItem().toString()+"-01,"+doe11.getText())+sp.space(com11.getText())+sp.space(pp11.getText()+"X"+Integer.parseInt(qqu11.getText()));}else{bill[19]=" ";}
if(!"".equals(ppr12.getText())){bill[20]=sp.space(ppr12.getText())+sp.space(qqu12.getText())+sp.space(ppa12.getText())+sp.space(jce12.getSelectedItem().toString()+"-01,"+doe12.getText())+sp.space(com12.getText())+sp.space(pp12.getText()+"X"+Integer.parseInt(qqu12.getText()));}else{bill[20]=" ";}
                bill[21]= "-------------------------------------------------------------------------------------------------------------------";
                bill[22]= "                                                                                                 Total  "+totb+"Rs.";
                bill[23]= "-------------------------------------------------------------------------------------------------------------------";
                bill[24]= "Subject to :" +g.st() ;
                bill[25]=g.tel();
                bill[26]=g.add();
                
                bill[28]="                                                                                                      Auth Sign.";
               try {
                        Bill(bill);
                } catch (IOException ex1) {
                }
           if("".equals(ppr1.getText())||"".equals(qqu1.getText())||"".equals(ppa1.getText())||"".equals(doe1.getText())||"".equals(com1.getText())||"".equals(pp1.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu1.getText()+"  WHERE Product='"+ppr1.getText()+"'  and Package='"+ppa1.getText()+"'  and  DOE='"+doe1.getText()+"-"+g.getmm(jce1.getSelectedItem().toString())+"-01'"+"  and Price='"+pp1.getText()+"'",""); }
           if("".equals(ppr2.getText())||"".equals(qqu2.getText())||"".equals(ppa2.getText())||"".equals(doe2.getText())||"".equals(com2.getText())||"".equals(pp2.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu2.getText()+"  WHERE Product='"+ppr2.getText()+"'  and Package='"+ppa2.getText()+"'  and  DOE='"+doe2.getText()+"-"+g.getmm(jce2.getSelectedItem().toString())+"-01'"+"  and Price='"+pp2.getText()+"'","");}
           if("".equals(ppr3.getText())||"".equals(qqu3.getText())||"".equals(ppa3.getText())||"".equals(doe3.getText())||"".equals(com3.getText())||"".equals(pp3.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu3.getText()+"  WHERE Product='"+ppr3.getText()+"'  and Package='"+ppa3.getText()+"'  and  DOE='"+doe3.getText()+"-"+g.getmm(jce3.getSelectedItem().toString())+"-01'"+"  and Price='"+pp3.getText()+"'","");}
           if("".equals(ppr4.getText())||"".equals(qqu4.getText())||"".equals(ppa4.getText())||"".equals(doe4.getText())||"".equals(com4.getText())||"".equals(pp4.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu4.getText()+"  WHERE Product='"+ppr4.getText()+"'  and Package='"+ppa4.getText()+"'  and  DOE='"+doe4.getText()+"-"+g.getmm(jce4.getSelectedItem().toString())+"-01'"+"  and Price='"+pp4.getText()+"'","");;}
           if("".equals(ppr5.getText())||"".equals(qqu5.getText())||"".equals(ppa5.getText())||"".equals(doe5.getText())||"".equals(com5.getText())||"".equals(pp5.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu5.getText()+"  WHERE Product='"+ppr5.getText()+"'  and Package='"+ppa5.getText()+"'  and  DOE='"+doe5.getText()+"-"+g.getmm(jce5.getSelectedItem().toString())+"-01'"+"  and Price='"+pp5.getText()+"'","");}
           if("".equals(ppr6.getText())||"".equals(qqu6.getText())||"".equals(ppa6.getText())||"".equals(doe6.getText())||"".equals(com6.getText())||"".equals(pp6.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu6.getText()+"  WHERE Product='"+ppr6.getText()+"'  and Package='"+ppa6.getText()+"'  and  DOE='"+doe6.getText()+"-"+g.getmm(jce6.getSelectedItem().toString())+"-01'"+"  and Price='"+pp6.getText()+"'","");}
           if("".equals(ppr7.getText())||"".equals(qqu7.getText())||"".equals(ppa7.getText())||"".equals(doe7.getText())||"".equals(com7.getText())||"".equals(pp7.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu7.getText()+"  WHERE Product='"+ppr7.getText()+"'  and Package='"+ppa7.getText()+"'  and  DOE='"+doe7.getText()+"-"+g.getmm(jce7.getSelectedItem().toString())+"-01'"+"  and Price='"+pp7.getText()+"'","");}
           if("".equals(ppr8.getText())||"".equals(qqu8.getText())||"".equals(ppa8.getText())||"".equals(doe8.getText())||"".equals(com8.getText())||"".equals(pp8.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu8.getText()+"  WHERE Product='"+ppr8.getText()+"'  and Package='"+ppa8.getText()+"'  and  DOE='"+doe8.getText()+"-"+g.getmm(jce8.getSelectedItem().toString())+"-01'"+"  and Price='"+pp8.getText()+"'","");}
           if("".equals(ppr9.getText())||"".equals(qqu9.getText())||"".equals(ppa9.getText())||"".equals(doe9.getText())||"".equals(com9.getText())||"".equals(pp9.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu9.getText()+"  WHERE Product='"+ppr9.getText()+"'  and Package='"+ppa9.getText()+"'  and  DOE='"+doe9.getText()+"-"+g.getmm(jce9.getSelectedItem().toString())+"-01'"+"  and Price='"+pp9.getText()+"'","");}
           if("".equals(ppr10.getText())||"".equals(qqu10.getText())||"".equals(ppa10.getText())||"".equals(doe10.getText())||"".equals(com10.getText())||"".equals(pp10.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu10.getText()+"  WHERE Product='"+ppr10.getText()+"'  and Package='"+ppa10.getText()+"'  and  DOE='"+doe10.getText()+"-"+g.getmm(jce10.getSelectedItem().toString())+"-01'"+"  and Price='"+pp10.getText()+"'","");}
           if("".equals(ppr11.getText())||"".equals(qqu11.getText())||"".equals(ppa11.getText())||"".equals(doe11.getText())||"".equals(com11.getText())||"".equals(pp11.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu11.getText()+"  WHERE Product='"+ppr11.getText()+"'  and Package='"+ppa11.getText()+"'  and  DOE='"+doe11.getText()+"-"+g.getmm(jce11.getSelectedItem().toString())+"-01'"+"  and Price='"+pp11.getText()+"'","");}
           if("".equals(ppr12.getText())||"".equals(qqu12.getText())||"".equals(ppa12.getText())||"".equals(doe12.getText())||"".equals(com12.getText())||"".equals(pp12.getText())){}else
           { db.sql(1,"UPDATE Prod2 SET Quantity = Quantity-"+qqu12.getText()+"  WHERE Product='"+ppr12.getText()+"'  and Package='"+ppa12.getText()+"'  and  DOE='"+doe12.getText()+"-"+g.getmm(jce12.getSelectedItem().toString())+"-01'"+"  and Price='"+pp12.getText()+"'","");}
              db.sql(1,"insert into Report values('"+g.Date()+"',"+totb+",null,null)","");
            }
catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Enter Valid Data");}      
}}});
    }
    
}
