/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;

import Functions.Get;
import Functions.Sql;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
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
public class Purches extends JPanel  {

    /**
     *
     */
    public  Purches() {
        final Get g=new Get();
        final Sql db=new Sql();
      JLabel Purchesp = null;
        try {
            Purchesp = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/tab.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Purches.class.getName()).log(Level.SEVERE, null, ex);
        }
      add(Purchesp);
      final TextField t1$1=new TextField(40);
        final JComboBox tmm0 = new JComboBox(Get.MM);
        final TextField tyy0 = new TextField(4);
        final JComboBox tmm3 = new JComboBox(Get.MM);
        final TextField tyy3 = new TextField(4);
        final TextField t1$2=new TextField(40);
        final TextField t1$3=new TextField(40);
        final TextField t1$4=new TextField(40);
        final TextField t1$5=new TextField(40);
        final TextField t1$6=new TextField(40);
        JPanel t1$7=new JPanel();
        t1$7.setLayout(new GridLayout());
        t1$7.add(tmm0);
        t1$7.add(tyy0);
        JPanel t2$7=new JPanel();
        t2$7.setLayout(new GridLayout());
        t2$7.add(tmm3);
        t2$7.add(tyy3);
        final TextField t1$8=new TextField(40);
        final TextField t1$9=new TextField(40);
        final TextField t1$10=new TextField(40);
        final TextField t1$11=new TextField(40);
        final TextField t1$12=new TextField(40);
        final TextField tp=new TextField(40);
        JButton b1$1=new JButton("Forword");
        JButton b1$2=new JButton("Backward");
        JButton b1$3=new JButton("Reset");
        Purchesp.setLayout(new GridBagLayout());
        GridBagConstraints pur=new GridBagConstraints();
        pur.gridx=0;
        pur.gridy=2;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Product"),pur);
        pur.gridx=1;
        pur.gridy=2;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$1,pur);
        pur.gridx=0;
        pur.gridy=3;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Package"),pur);
        pur.gridx=1;
        pur.gridy=3;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$2,pur);
        pur.gridx=0;
        pur.gridy=4;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Quantity"),pur);
        pur.gridx=1;
        pur.gridy=4;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$3,pur);
        pur.gridx=0;
        pur.gridy=5;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Containt : "),pur);
        pur.gridx=1;
        pur.gridy=5;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$4,pur);
        pur.gridx=0;
        pur.gridy=6;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Company : "),pur);
        pur.gridx=1;
        pur.gridy=6;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$5,pur);
        pur.gridx=0;
        pur.gridy=7;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("MRP : "),pur);
        pur.gridx=1;
        pur.gridy=7;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$6,pur);
        pur.gridx=0;
        pur.gridy=1;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Supplier Name"),pur);
        //-------------------------------------------------------
        pur.gridx=1;
        pur.gridy=1;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$9,pur);
        pur.gridx=1;
        pur.gridy=0;
        pur.weightx = 3.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$10,pur);
        pur.gridx=3;
        pur.gridy=1;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$11,pur);
        pur.gridx=3;
        pur.gridy=0;
        pur.weightx = 3.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$12,pur);
        pur.gridx=2;
        pur.gridy=1;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Supplier ID"),pur);
        pur.gridx=2;
        pur.gridy=0;
        pur.weightx = 3.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Supplier EMail"),pur);
        pur.gridx=0;
        pur.gridy=0;
        pur.weightx = 3.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Supplier Contact"),pur);
        pur.gridx=2;
        pur.gridy=2;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("DMF(MM/YY)"),pur);
        pur.gridx=2;
        pur.gridy=3;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Expiry(MM/YY)"),pur);
        pur.gridx=3;
        pur.gridy=2;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$7,pur);;
        pur.gridx=3;
        pur.gridy=3;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t2$7,pur);
        pur.gridx=2;
        pur.gridy=4;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Batch"),pur);
        pur.gridx=3;
        pur.gridy=4;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(t1$8,pur);
        pur.gridx=2;
        pur.gridy=5;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(new JLabel("Price"),pur);
        pur.gridx=3;
        pur.gridy=5;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(tp,pur);
        pur.gridx=0;
        pur.gridy=8;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(b1$1,pur);
        pur.gridx=1;
        pur.gridy=8;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(b1$2,pur);
        pur.gridx=2;
        pur.gridy=8;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(b1$3,pur);
        pur.gridx=3;
        pur.gridy=8;
        pur.weightx = 1.0;
        pur.weighty = 1.0;
        pur.gridheight=1;
        pur.gridwidth=1;
        Purchesp.add(Get.b1$4,pur);
        b1$1.addActionListener(new ActionListener() {
            int i=0;int j=Get.oxx.getRowCount();
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
               i %= j;
                t1$1.setText((String)Get.oxx.getValueAt(i,0));
                t1$2.setText((String)Get.oxx.getValueAt(i,1));
                t1$3.setText((String)Get.oxx.getValueAt(i,2));
                t1$4.setText((String)Get.oxx.getValueAt(i,3));
                t1$5.setText((String)Get.oxx.getValueAt(i,4));
                i++;
            }
        });
        b1$2.addActionListener(new ActionListener() {
               int i=Get.oxx.getRowCount()-1;
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
                if(i<0){i=Get.oxx.getRowCount()-1;}
                t1$1.setText((String)Get.oxx.getValueAt(i,0));
                t1$2.setText((String)Get.oxx.getValueAt(i,1));
                t1$3.setText((String)Get.oxx.getValueAt(i,2));
                t1$4.setText((String)Get.oxx.getValueAt(i,3));
                t1$5.setText((String)Get.oxx.getValueAt(i,4));
                i--;
            }
        });
        b1$3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
             t1$1.setText("");
             t1$2.setText("");
             t1$3.setText("");
             t1$4.setText("");
             t1$5.setText("");
             t1$6.setText("0");
             tyy0.setText("");
             tyy3.setText("");
             t1$8.setText("");
             tp.setText("0");
            }
        });
        Get.b1$4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
 if("".equals(t1$1.getText())||"".equals(t1$2.getText())||"".equals(t1$3.getText())||"".equals(t1$4.getText())||
   "".equals(t1$5.getText())||"".equals(t1$6.getText())||"".equals(tyy0.getText())||"".equals(t1$8.getText())||
   "".equals(t1$9.getText())||"".equals(t1$10.getText())||"".equals(t1$11.getText())||"".equals(t1$12.getText())||
        "".equals(tyy3.getText())||"".equals(tp.getText()))
{
                    showMessageDialog(null,"Enter Some Input");
}
else
{
if(tyy0.getText().length()!=4||tyy3.getText().length()!=4){showMessageDialog(null,"Enter Valid Year");}else{
try {
Integer.parseInt(tyy0.getText());Integer.parseInt(tyy3.getText());parseDouble(t1$6.getText());Integer.parseInt(t1$3.getText());parseDouble(tp.getText());
if(t1$12.getText().contains("@")&&t1$12.getText().contains(".")){
db.sql(1,"insert into Supp  values('"+t1$9.getText()+"','"+t1$11.getText()+"','"+t1$10.getText()+"','"+t1$12.getText()+"');","");
db.sql(1,"insert into Prod2 values('"+t1$1.getText()+"','"+parseInt(tyy0.getText())+"-"+g.getmm(tmm0.getSelectedItem().toString())+"-01','"+parseInt(tyy3.getText())+"-"+g.getmm(tmm3.getSelectedItem().toString())+"-01',"+"'"+t1$8.getText()+"','"+t1$2.getText()+"','"+t1$3.getText()+"','"+t1$6.getText()+"','"+t1$11.getText()+"','"+g.Date()+"');","");
db.sql(1,"insert into Prod1 values('"+t1$1.getText()+"','"+t1$4.getText()+"','"+t1$5.getText()+"');","");
db.sql(1,"insert into Report values('"+g.Date()+"',null,"+tp.getText()+","+(parseDouble(t1$6.getText())-parseDouble(tp.getText()))+")","");
db.sql(0,"update Orders set Quantity=Quantity-"+t1$3.getText()+" where Product='"+t1$1.getText()+"';","Saved Successfully");
db.sql(1,"delete from Orders where Quantity=0","");
}else{JOptionPane.showMessageDialog(null, "Enter Valid EMail ID!");} 
}catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Enter Valid Input !");}             
}}}});
    }
    
}
