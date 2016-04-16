/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tab;
import Functions.Report;
import Functions.Get;
import Functions.Sql;
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
public class Reportt extends JPanel  {

    /**
     *
     */
    public  Reportt() {
        JLabel Report = null;
        try {
            Report = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/tab.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Reportt.class.getName()).log(Level.SEVERE, null, ex);
        }
        add(Report);
        final Report rp=new Report();
        final Sql db=new Sql();
        Report.setLayout(new GridBagLayout());
        GridBagConstraints rep=new GridBagConstraints();
        JLabel r$1 = null;
        try {
            r$1 = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/date.gif"))));
        } catch (IOException ex) {
            Logger.getLogger(Reportt.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel r$2 = null;
        try {
            r$2 = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/date.gif"))));
        } catch (IOException ex) {
            Logger.getLogger(Reportt.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel rb = null;
        try {
            rb = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/date.gif"))));
        } catch (IOException ex) {
            Logger.getLogger(Reportt.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel drb = null;
        try {
            drb = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/date.gif"))));
        } catch (IOException ex) {
            Logger.getLogger(Reportt.class.getName()).log(Level.SEVERE, null, ex);
        }
        r$1.setLayout(new GridLayout());
        r$2.setLayout(new GridLayout());
        rb.setLayout(new GridLayout());
        drb.setLayout(new GridLayout());
        final JComboBox tmm4 = new JComboBox(Get.MM);
        final JComboBox tmm5 = new JComboBox(Get.MM);
        final JComboBox tdd4 = new JComboBox(Get.DD);
        final JComboBox tdd5 = new JComboBox(Get.DD);
        final TextField tyy5 = new TextField(4);
        Calendar cal2 = new GregorianCalendar();
        tdd5.setSelectedIndex(cal2.get(Calendar.DATE)-1);
        tmm5.setSelectedIndex(cal2.get(Calendar.MONTH));
        tyy5.setText(valueOf(cal2.get(Calendar.YEAR)));
        final TextField tyy4 = new TextField("2010",4);
        final JLabel rep0=new JLabel("SOLD");
        final JLabel rep1=new JLabel("BUY");
        final JLabel rep2=new JLabel("PROFIT");
        final JLabel rep3=new JLabel("EXPIRIES");
        JLabel rd1=new JLabel("Starting Date");
        JButton srb=new JButton("Report");
        JButton dsrb=new JButton("Delete Reports");
        JLabel rd2=new JLabel("Ending Date");
        rd1.setFont(new Font("", Font.PLAIN,50));
        rep0.setFont(new Font("", Font.PLAIN,25));
        rep1.setFont(new Font("", Font.PLAIN,25));
        rep2.setFont(new Font("", Font.PLAIN,25));
        rep3.setFont(new Font("", Font.PLAIN,25));
        tyy4.setFont(new Font("", Font.PLAIN,25));
        tyy5.setFont(new Font("", Font.PLAIN,25));
        rd2.setFont(new Font("", Font.PLAIN,50));
        tmm4.setFont(new Font("", Font.PLAIN,25));
        tmm5.setFont(new Font("", Font.PLAIN,25));
        tdd4.setFont(new Font("", Font.PLAIN,40));
        tdd5.setFont(new Font("", Font.PLAIN,40));
        rb.add(srb);
        r$1.add(tdd4);
        r$1.add(tmm4);
        r$1.add(tyy4);
        r$2.add(tdd5);
        r$2.add(tmm5);
        r$2.add(tyy5);
        drb.add(dsrb);
        rep.gridx = 0;
        rep.gridy = 0;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rd1, rep);
        rep.gridx = 0;
        rep.gridy = 1;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(r$1, rep);
        rep.gridx = 0;
        rep.gridy = 2;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rd2, rep);
        rep.gridx = 0;
        rep.gridy = 3;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(r$2, rep);
        rep.gridx = 1;
        rep.gridy = 0;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rep3, rep);
        rep.gridx = 0;
        rep.gridy = 4;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rb, rep);
        rep.gridx = 1;
        rep.gridy = 1;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rep0, rep);
        rep.gridx = 1;
        rep.gridy = 2;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(rep1, rep);
        rep.gridx = 1;
        rep.gridy = 3;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        //Report.add(rep2, rep);
        rep.gridx = 1;
        rep.gridy = 4;
        rep.gridheight = 1;
        rep.gridwidth = 1;
        rep.weightx = 1.0;
        rep.weighty = 1.0;
        Report.add(drb, rep);
         srb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            { 
                Double c=0.0;
                String[] rep={"0.0","0.0","0.0","0.0"};
                if(tyy4.getText().length()!=4||tyy5.getText().length()!=4){showMessageDialog(null,"Enter Valid Year");}else{
                rep=rp.report(tmm4.getSelectedItem().toString()+" "+tdd4.getSelectedItem().toString()+","+tyy4.getText(),tmm5.getSelectedItem().toString()+" "+tdd5.getSelectedItem().toString()+","+tyy5.getText());
                }
try{parseDouble(rep[0]);}catch(NullPointerException e){rep[0]="0.0";}
                try{parseDouble(rep[1]);}catch(NullPointerException e){rep[1]="0.0";}
                try{parseDouble(rep[2]);}catch(NullPointerException e){rep[2]="0.0";}
                try{parseDouble(rep[3]);}catch(NullPointerException e){rep[3]="0.0";}
                c=(Double.parseDouble(rep[3])-Double.parseDouble(rep[2]));
                rep0.setText("Sold : "+rep[0].toString());
                rep1.setText("Buy : "+rep[1].toString());
                rep3.setText("Expiries : "+rep[2].toString());
                rep3.setForeground(Color.RED);
              /*  if(c>=0)
                {rep2.setText("Profit :"+c);rep2.setForeground(Color.GREEN);}
                else
                {rep2.setText("Loss :"+c*(-1));rep2.setForeground(Color.RED);}*/
             }
        });
         dsrb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            { 
    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
    } else if (response == JOptionPane.YES_OPTION)
    {
                db.sql(0,"truncate table Report","Report Successfully Deleted");
   }
             }
        });
    }
    
}
