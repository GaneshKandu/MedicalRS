/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Head;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Functions.Get;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author Admin
 */
public class head extends JPanel
{
    /**
     *
     */
    public Get g=new Get();
    /**
     *
     */
    public static JLabel date = new JLabel("Date");
    /**
     *
     */
    public static JLabel name0 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public static JLabel name1 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public static JLabel name2 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public static JLabel name3 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public static JLabel name4 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public static JLabel name5 = new JLabel("MEDICAL  RECORD  SYSTEM");
    /**
     *
     */
    public head()
  {
        JLabel name = new JLabel(g.medi());
        JLabel dln = new JLabel(g.dln());
        JLabel wew = new JLabel(g.own());
        JLabel add = new JLabel(g.add());
        JLabel tel = new JLabel(g.tel());
        JLabel st = new JLabel("Subject To:"+g.st());
        JLabel lb1 = null;
        try {
            lb1 = new JLabel(g.medi(),new ImageIcon(ImageIO.read(getClass().getResource("/Image/Medical-01.gif"))),2);
        } catch (IOException ex) {
            Logger.getLogger(head.class.getName()).log(Level.SEVERE, null, ex);
        }
        lb1.setFont(new Font("Serif", Font.BOLD, 100));
        JLabel pan0 = null;
        try {
            pan0 = new JLabel(new ImageIcon(ImageIO.read(getClass().getResource("/Image/head.png"))));
        } catch (IOException ex) {
            Logger.getLogger(head.class.getName()).log(Level.SEVERE, null, ex);
        }
        JPanel pan=new JPanel();
        add(pan0);
        lb1.setForeground(Color.RED);
        pan0.setLayout(null);
        pan0.add(name);
        name.setBounds(0,0,670,30);
        pan0.add(date);
        date.setBounds(672,0,670,30);
        pan0.add(lb1);
        lb1.setBounds(0,30,1433,100);
        pan0.add(dln);
        dln.setBounds(0,120,670,30);
        pan0.add(tel);
        tel.setBounds(672,120,670,30);
        pan0.add(wew);
        wew.setBounds(0,140,670,30);
        pan0.add(add);
        add.setBounds(670,140,670,30);
        pan0.add(name0);
        pan0.add(name1);
        pan0.add(name2);
        pan0.add(name3);
        pan0.add(name4);
        pan0.add(name5);
  }
}
