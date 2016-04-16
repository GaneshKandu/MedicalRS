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
public class Setting extends JPanel {

    /**
     *
     */
    public  Setting() {
        final Sql db=new Sql();
        JLabel Settingp = null;
        try {
            Settingp = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/tab.jpg"))));
        } catch (IOException ex) {
            Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
        add(Settingp);
        JLabel mn = new JLabel("Medical Name");
        final TextField MN = new TextField(50);
        JLabel add1 = new JLabel("Address");
        final TextField ON = new TextField(50);
        JLabel on = new JLabel("Owner Name");
        final TextField ADD = new TextField(50);
        JLabel pn = new JLabel("Tel");
        final TextField PN = new TextField(50);
        JLabel dln1 = new JLabel("Drugist Lic. No");
        final TextField DLN = new TextField(50);
        JLabel st1 = new JLabel("Subject To");
        final TextField ST = new TextField(50);
        JButton save = new JButton("Save");
        JButton reset = new JButton("Reset");
        Settingp.setLayout(new GridBagLayout());
        GridBagConstraints sett = new GridBagConstraints();
        sett.weightx = 1.0;
        sett.weighty = 1.0;
        sett.gridx = 0;
        sett.gridy = 0;
        Settingp.add(on, sett);
        sett.gridx = 1;
        sett.gridy = 0;
        Settingp.add(ON, sett);
        sett.gridx = 0;
        sett.gridy = 1;
        Settingp.add(mn, sett);
        sett.gridx = 1;
        sett.gridy = 1;
        Settingp.add(MN, sett);
        sett.gridx = 0;
        sett.gridy = 2;
        Settingp.add(add1, sett);
        sett.gridx = 1;
        sett.gridy = 2;
        Settingp.add(ADD, sett);
        sett.gridx = 0;
        sett.gridy = 5;
        Settingp.add(pn, sett);
        sett.gridx = 1;
        sett.gridy = 5;
        Settingp.add(PN, sett);
        sett.gridx = 0;
        sett.gridy = 6;
        Settingp.add(dln1, sett);
        sett.gridx = 1;
        sett.gridy = 6;
        Settingp.add(DLN, sett);
        sett.gridx = 0;
        sett.gridy = 7;
        Settingp.add(st1, sett);
        sett.gridx = 1;
        sett.gridy = 7;
        Settingp.add(ST, sett);
        sett.gridx = 0;
        sett.gridy = 8;
        Settingp.add(save, sett);
        sett.gridx = 1;
        sett.gridy = 8;
        Settingp.add(reset, sett);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                MN.setText("");
                ADD.setText("");
                PN.setText("");
                DLN.setText("");
                ST.setText("");
                ON.setText("");
            }
        });
        save.addActionListener(new ActionListener() {
            //"UPDATE Registration " +"SET age = 30 WHERE id in (100, 101)";
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                if("".equals(MN.getText())||"".equals(ADD.getText())||"".equals(PN.getText())||
                   "".equals(DLN.getText())||"".equals(ST.getText())||"".equals(ON.getText()))
                {
                    showMessageDialog(null,"Enter Some Input");
                }
                else
                {
    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
    } else if (response == JOptionPane.YES_OPTION)
    {
        db.sql(0,"UPDATE Setting SET Owner ='"+ON.getText()+"',MediName='"+MN.getText()+"',Address='"+ADD.getText()+"',Tel='"+PN.getText()+"',DLN='"+DLN.getText()+"',ST='"+ST.getText()+"',MUser='Admin' WHERE MUser='Admin'","Setting successfully Updated");
    }
                }
             }
        });
    }
    
}
