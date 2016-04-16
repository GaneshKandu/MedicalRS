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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Order  extends JPanel  {

      /**
     *
     */
    public static JLabel IMG1=new JLabel(new ImageIcon("/Image/medi0_1.jpg"));
      /**
     *
     */
    public static JLabel IMG2=new JLabel(new ImageIcon("/Image/medi1_1.jpg"));
    /**
     *
     */
    public  Order() {
        final Sql db=new Sql();
        final list lt=new list();
        JLabel Orderp = null;
        try {
            Orderp = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/tab.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        add(Orderp);
        final TextField t$1=new TextField(40);
        final TextField t$2=new TextField(40);
        final TextField t$3=new TextField(40);
        final TextField t$4=new TextField(40);
        final TextField t$5=new TextField(40);
        JButton bfo=new JButton("Forword");
        JButton bba=new JButton("Backword");
        JButton b$3=new JButton("Reset");
        Orderp.setLayout(new GridBagLayout());
        GridBagConstraints ord=new GridBagConstraints();
        ord.gridx=0;
        ord.gridy=0;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(new JLabel("Product"),ord);
        ord.gridx=1;
        ord.gridy=0;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(t$1,ord);
        ord.gridx=0;
        ord.gridy=1;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(new JLabel("Package"),ord);
        ord.gridx=1;
        ord.gridy=1;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(t$2,ord);
        ord.gridx=0;
        ord.gridy=2;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(new JLabel("Quantity"),ord);
        ord.gridx=1;
        ord.gridy=2;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(t$3,ord);
        ord.gridx=0;
        ord.gridy=3;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(new JLabel("Containt : "),ord);
        ord.gridx=1;
        ord.gridy=3;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(t$4,ord);
        ord.gridx=0;
        ord.gridy=4;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(new JLabel("Company : "),ord);
        ord.gridx=1;
        ord.gridy=4;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(t$5,ord);
        ord.gridx=2;
        ord.gridy=1;
        ord.gridheight=5;
        ord.gridwidth=1;
        Orderp.add(IMG1,ord);
        ord.gridx=3;
        ord.gridy=1;
        ord.gridheight=5;
        ord.gridwidth=1;
        Orderp.add(IMG2,ord);
        ord.gridx=2;
        ord.gridy=7;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(b$3,ord);
        ord.gridx=3;
        ord.gridy=7;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(Get.b$4,ord);
        ord.gridx=0;
        ord.gridy=6;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(bfo,ord);
        ord.gridx=1;
        ord.gridy=6;
        ord.weightx = 1.0;
        ord.weighty = 1.0;
        ord.gridheight=1;
        ord.gridwidth=1;
        Orderp.add(bba,ord);
        b$3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {   
                t$1.setText("");
                t$2.setText("");
                t$3.setText("");
                t$4.setText("");
                t$5.setText("");
            }
        });
        Get.b$4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
                if("".equals(t$1.getText())||"".equals(t$2.getText())||"".equals(t$3.getText())||
                   "".equals(t$4.getText())||"".equals(t$5.getText()))
                {
                    showMessageDialog(null,"Enter Some Input");
                }
                else
                {
try{
Integer.parseInt(t$3.getText());
db.sql(0,"insert into Orders values('"+t$1.getText()+"','"+t$2.getText()+"',"+t$3.getText()+",'"+t$4.getText()+"','"+t$5.getText()+"');",t$1.getText()+" is Oedered");
                }
catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Enter Valid Data");}
                }
            }
        });
        bfo.addActionListener(new ActionListener() {
            int i=0;int j=Get.xxx.getRowCount();
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
                i %= j;
                t$1.setText((String)Get.xxx.getValueAt(i,0));
                t$2.setText((String)Get.xxx.getValueAt(i,6));
                t$3.setText((String)Get.xxx.getValueAt(i,7));
                t$4.setText((String)Get.xxx.getValueAt(i,1));
                t$5.setText((String)Get.xxx.getValueAt(i,2));
                i++;
            }
        });
        
        bba.addActionListener(new ActionListener() {
                 int i=Get.xxx.getRowCount()-1;
            @Override
            public void actionPerformed(ActionEvent arg0)
            { 
                if(i<0){i=Get.xxx.getRowCount()-1;}
                t$1.setText((String)Get.xxx.getValueAt(i,0));
                t$2.setText((String)Get.xxx.getValueAt(i,6));
                t$3.setText((String)Get.xxx.getValueAt(i,7));
                t$4.setText((String)Get.xxx.getValueAt(i,1));
                t$5.setText((String)Get.xxx.getValueAt(i,2));
                i--;
            }
        });
    }
    
}
