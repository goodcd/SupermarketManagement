package com.cs.from;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class find_Sales extends JDialog {
	
	JPanel panel1 = new JPanel();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();

	public find_Sales(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//窗口的初始化函数
			pack();			//刷新窗口
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public find_Sales() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "销售明细检查", false);
		this.setSize(600, 620);
		this.setLocation(350, 50);
		this.setVisible(true);
	}
	
	public void jbInit() {

	}
}
