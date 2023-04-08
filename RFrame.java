import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RFrame implements ActionListener {
    JLabel title;
    JLabel total;
    JButton b;
    JCheckBox cb1;
    JCheckBox cb2;
    JCheckBox cb3;
    JCheckBox cb4;
    JCheckBox cb5;
    JCheckBox cb6;
    JCheckBox cb7;
    JCheckBox cb8;
    JCheckBox cb9;
    JCheckBox cb10;

    void Restaurant() {
        JFrame f = new JFrame("Restaurant");
        total = new JLabel();
        total.setBounds(100, 700, 400, 50);

        title = new JLabel("Welcome To My Restaurant !!");
        title.setBounds(100, 100, 300, 20); // 100, 100, 150, 20

        cb1 = new JCheckBox("Pizza >>> 50 QR");
        cb1.setBounds(100, 150, 150, 20);

        cb2 = new JCheckBox("Burger >>> 20 QR");
        cb2.setBounds(100, 200, 150, 20);

        cb3 = new JCheckBox("Chickhen Briyani >>> 20 QR");
        cb3.setBounds(100, 250, 200, 20);

        cb4 = new JCheckBox("Mutton Briyani >>> 30 QR");
        cb4.setBounds(100, 300, 200, 20);

        cb5 = new JCheckBox("Veg Briyani >>> 10 QR");
        cb5.setBounds(100, 350, 200, 20);

        cb6 = new JCheckBox("Karak >>> 1 QR");
        cb6.setBounds(100, 400, 150, 20);

        cb7 = new JCheckBox("Coke >>> 2 QR");
        cb7.setBounds(100, 450, 150, 20);

        cb8 = new JCheckBox("Water >>> 1 QR");
        cb8.setBounds(100, 500, 1500, 20);

        cb9 = new JCheckBox("IceCream  >>> 2 QR");
        cb9.setBounds(100, 550, 150, 20);

        cb10 = new JCheckBox("Falooda >>> 5 QR");
        cb10.setBounds(100, 600, 150, 20);

        b = new JButton("Order");
        b.setBounds(100, 650, 150, 20);
        b.addActionListener(this);

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);
        f.add(cb7);
        f.add(cb8);
        f.add(cb9);
        f.add(cb10);
        f.add(title);
        f.add(total);
        f.add(b);

        f.setSize(500, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBackground(java.awt.Color.LIGHT_GRAY);

    }

    public void actionPerformed(ActionEvent e) {

        int totalAmount = 0;

        if (cb1.isSelected()) {
            totalAmount += 50;
        }
        if (cb2.isSelected()) {
            totalAmount += 20;
        }
        if (cb3.isSelected()) {
            totalAmount += 20;
        }
        if (cb4.isSelected()) {
            totalAmount += 30;
        }
        if (cb5.isSelected()) {
            totalAmount += 10;
        }
        if (cb6.isSelected()) {
            totalAmount += 1;
        }
        if (cb7.isSelected()) {
            totalAmount += 2;
        }
        if (cb8.isSelected()) {
            totalAmount += 1;
        }
        if (cb9.isSelected()) {
            totalAmount += 2;
        }
        if (cb10.isSelected()) {
            totalAmount += 5;
        }

        JOptionPane.showMessageDialog(b, this, "" + "Total :" + totalAmount, 1);

    }

}
