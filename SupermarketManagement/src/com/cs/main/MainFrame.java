package com.cs.main;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	JPanel contentPanel;
	/*定义菜单栏*/
	JMenuBar jMenuBar = new JMenuBar();
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("学生信息管理系统");
		this.setSize(900, 600);
		this.setVisible(true);
	}
	
}
