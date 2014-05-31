package com.cs.from;

import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddGoods extends JDialog {
	//类的成员变量
	JPanel panel1 = new JPanel();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	JLabel jLabel0 = new JLabel();
	JLabel jLabel11 = new JLabel();
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//设置布局为空
		jLabel1.setText("商品编码：");				//设置商品编码名称大小和位置
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		getContentPane().add(panel1);
		panel1.add(jLabel1);
	}
}
