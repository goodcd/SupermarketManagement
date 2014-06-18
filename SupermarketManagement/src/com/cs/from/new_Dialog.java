package com.cs.from;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;


public class new_Dialog extends JDialog {
 	JPanel panel1 = new JPanel();
    JTextField meet = new JTextField();
    JTextField advance = new JTextField();
    JTextField back = new JTextField();
    JLabel hj = new JLabel();
    JLabel yf = new JLabel();
    JLabel zl = new JLabel();
    public new_Dialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public new_Dialog() {
        this(new Frame(), "交易情况", false);
        this.setSize(400, 300);
        setLocationRelativeTo(getOwner());
        this.setVisible(true);
    }

    private void jbInit() throws Exception {
        panel1.setLayout(null);
        meet.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        meet.setBounds(new Rectangle(95, 60, 230, 20));
        advance.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        advance.setBounds(new Rectangle(95, 120, 230, 20));
        back.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        back.setBounds(new Rectangle(95, 180, 230, 20));
        hj.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        hj.setText("金额共计:");
        hj.setBounds(new Rectangle(21, 45, 190, 42));
        yf.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        yf.setText("预付金额:");
        yf.setBounds(new Rectangle(21, 108, 190, 42));
        zl.setFont(new java.awt.Font("宋体", Font.PLAIN, 15));
        zl.setText("找零金额:");
        zl.setBounds(new Rectangle(21, 171, 190, 42));
 
        getContentPane().add(panel1);
        panel1.add(hj);
        panel1.add(yf);
        panel1.add(zl);
        panel1.add(advance);
        panel1.add(back);
        panel1.add(meet);
        advance.setEditable(false);
        meet.setEditable(false);
        back.setEditable(false);
    }
}
