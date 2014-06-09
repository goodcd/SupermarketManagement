package com.cs.from;

import java.awt.Frame;

import javax.swing.JDialog;

public class sale extends JDialog {

	public sale(Frame ower, String title, boolean modal) {
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
	public sale() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "前台收银", false);
		this.setSize(800, 600);
		this.setLocation(250, 100);
		this.setVisible(true);
	}
	
	public void jbInit() {

	}
}
