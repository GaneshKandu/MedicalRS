/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;
import Functions.Sql;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import Functions.Get;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class anr  extends JPanel {

    /**
     *
     */
    public  anr() {
        final Get g=new Get();
        final Sql db=new Sql();
        SimpleDateFormat date = new SimpleDateFormat("MMMMM d,yyyy");
        JLabel pro = new JLabel("Product");
        JLabel con = new JLabel("Containt");
        JLabel qua = new JLabel("Quantity");
        JLabel dmf = new JLabel("DMF");
        JLabel doe = new JLabel("DOE");
        JLabel pri = new JLabel("MRP");
        JLabel bat = new JLabel("Batch");
        JLabel pac = new JLabel("Package");
        JLabel com = new JLabel("Company");
        final JPanel tdmf = new JPanel();
        tdmf.setLayout(new GridLayout());
        final JPanel tdoe = new JPanel();
        tdoe.setLayout(new GridLayout());
        final JComboBox tmm2 = new JComboBox(Get.MM);
        final JComboBox tmm1 = new JComboBox(Get.MM);
        final TextField tyy2 = new TextField(4);
        final TextField tyy1 = new TextField(4);
        final TextField tpro = new TextField(40);
        final TextField tcon = new TextField(40);
        final TextField tqua = new TextField(40);
        final TextField tpri = new TextField(40);
        final TextField tbat = new TextField(40);
        final TextField tpac = new TextField(40);
        final TextField tcom = new TextField(40);
        final TextField pr = new TextField(40);
        JLabel arp = null;
        try {
            arp = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/tab.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(anr.class.getName()).log(Level.SEVERE, null, ex);
        }
        add(arp);
        JButton re = new JButton("Reset");
        tdmf.add(tmm1);
        tdmf.add(tyy1);
        tdoe.add(tmm2);
        tdoe.add(tyy2);
        arp.setLayout(new GridBagLayout());
        GridBagConstraints anr = new GridBagConstraints();
        anr.gridx = 0;
        anr.gridy = 0;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(pro, anr);
        anr.gridx = 1;
        anr.gridy = 0;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tpro, anr);
        anr.gridx = 0;
        anr.gridy = 1;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(con, anr);
        anr.gridx = 1;
        anr.gridy = 1;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tcon, anr);
        anr.gridx = 0;
        anr.gridy = 2;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(qua, anr);
        anr.gridx = 1;
        anr.gridy = 2;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tqua, anr);
        anr.gridx = 0;
        anr.gridy = 3;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(dmf, anr);
        anr.gridx = 1;
        anr.gridy = 3;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tdmf, anr);
        anr.gridx = 0;
        anr.gridy = 4;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(doe, anr);
        anr.gridx = 1;
        anr.gridy = 4;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tdoe, anr);
        anr.gridx = 0;
        anr.gridy = 5;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(pri, anr);
        anr.gridx = 1;
        anr.gridy = 5;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tpri, anr);
        anr.gridx = 0;
        anr.gridy = 6;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(bat, anr);
        anr.gridx = 1;
        anr.gridy = 6;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tbat, anr);
        anr.gridx = 0;
        anr.gridy = 7;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(pac, anr);
        anr.gridx = 1;
        anr.gridy = 7;
        anr.weightx = 1.0;
        anr.weighty = 1.0; 
        arp.add(tpac, anr);
        anr.gridx = 0;
        anr.gridy = 8;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(com, anr);
        anr.gridx = 1;
        anr.gridy = 8;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(tcom, anr);
        anr.gridx = 0;
        anr.gridy = 9;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(new JLabel("Price"), anr);
        anr.gridx = 1;
        anr.gridy = 9;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(pr, anr);
        anr.gridx = 0;
        anr.gridy = 10;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(Get.sa, anr);
        anr.gridx = 1;
        anr.gridy = 10;
        anr.weightx = 1.0;
        anr.weighty = 1.0;
        arp.add(re, anr);
        
 Get.sa.addActionListener(new ActionListener() 
 {
            @Override
 public void actionPerformed(ActionEvent arg0)
 { 
     if("".equals(tpro.getText())||"".equals(tcon.getText())||
        "".equals(tqua.getText())||"".equals(tyy1.getText())||
        "".equals(tyy2.getText())||"".equals(tpri.getText())||
        "".equals(tbat.getText())||"".equals(tpac.getText())||
        "".equals(tcom.getText())||"".equals(pr.getText()))
     {
                    showMessageDialog(null,"Enter Some Input");
     }
     else
     {
     //PARSEDATETIME ('January 1,2019','M d,y')    
if(tyy1.getText().length()!=4||tyy2.getText().length()!=4){showMessageDialog(null,"Enter Valid Year");}else{
  try {
Integer.parseInt(tyy1.getText()); Integer.parseInt(tyy2.getText()); Integer.parseInt(tqua.getText()); parseDouble(tpri.getText());  parseDouble(pr.getText());  
db.sql(1,"insert into Prod1 values('"+tpro.getText()+"','"+tcon.getText()+"','"+tcom.getText()+"');","");
db.sql(1,"insert into Prod2 values('"+tpro.getText()+"','"+parseInt(tyy1.getText())+"-"+g.getmm(tmm1.getSelectedItem().toString())+"-01',"+"'"+parseInt(tyy2.getText())+"-"+g.getmm(tmm2.getSelectedItem().toString())+"-01',"+"'"+tbat.getText()+"','"+tpac.getText()+"','"+tqua.getText()+"','"+tpri.getText()+"','Admin','"+g.Date()+"');","");
db.sql(0,"insert into Report values('"+g.Date()+"',null,"+pr.getText()+","+(parseDouble(tpri.getText())-parseDouble(pr.getText()))+")","Successfully added to products");
    }
catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Enter Valid Data");}
     }}
     System.out.println("1");
 }});
 re.addActionListener(new ActionListener() 
 {
            @Override
 public void actionPerformed(ActionEvent arg0) 
 {
   tyy2.setText(""); tyy1.setText(""); tpro.setText(""); tcon.setText(""); 
   tqua.setText(""); tpri.setText(""); tbat.setText("");tpac.setText(""); 
   tcom.setText(""); 
 }
 });
    }
    
}
