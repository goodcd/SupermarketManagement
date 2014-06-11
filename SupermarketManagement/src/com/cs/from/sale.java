package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class sale extends JDialog {

	// 类的成员变量
	JPanel panel1 = new JPanel();
	// 标签
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	// 文本框
	JTextField jTextField1 = new JTextField();
	JTextField jTextField2 = new JTextField();
	JTextField jTextField3 = new JTextField();
	JTextField jTextField4 = new JTextField();
	JTextField jTextField5 = new JTextField();
	JTextField jTextField6 = new JTextField();
	JTextField jTextField7 = new JTextField();
	JTextField jTextField8 = new JTextField();
	JTextField jTextField9 = new JTextField();

	// 按钮
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();

	JScrollPane jScrollPane1 = new JScrollPane();
	JTable jTable1 = new JTable(); 			// 表格
	Vector colnames = new Vector(); 		// 表头
	Vector colnames1 = new Vector(); 		// 测试
	Vector colnames2 = new Vector(); 		// 测试

	public sale(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			// 在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit(); 				// 初始化界面
			pack(); 				// 刷新界面
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public sale() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "前台收银", false);		//生成窗口
		this.setSize(800, 600);					//设置窗口大小
		setLocationRelativeTo(getOwner());		//居中显示
		this.setVisible(true);					//窗口可见
	}

	public void jbInit() {
		panel1.setLayout(null); // 清空默认的布局设置

		// 向表格中添加表头信息
		colnames.add("商品编号");
		colnames.add("名称");
		colnames.add("规格");
		colnames.add("单位");
		colnames.add("数量");
		colnames.add("售价");
		colnames.add("折扣");
		colnames.add("金额");
		colnames2.add(colnames1);
		//设置ScrollPane的大小
		jScrollPane1.setBounds(new Rectangle(25, 25, 740, 420));
		
		jTable1 = Mytable.maketable(colnames2, colnames);
		jScrollPane1.getViewport().add(jTable1);
		
		//设置标签
		jLabel1.setText("商品编号");
		jLabel1.setBounds(new Rectangle(30, 450, 60, 20));
		jLabel2.setText("数量");			
		jLabel2.setBounds(new Rectangle(270, 450, 60, 20));
		jLabel3.setText("折扣");			
		jLabel3.setBounds(new Rectangle(400, 450, 60, 20));
		jLabel4.setText("当前时间");		
		jLabel4.setBounds(new Rectangle(560, 450, 60, 20));
		jLabel5.setText("会员卡号");		
		jLabel5.setBounds(new Rectangle(30, 480, 60, 20));
		jLabel6.setText("单价");		
		jLabel6.setBounds(new Rectangle(270, 480, 60, 20));
		jLabel7.setText("应付金额：");		
		jLabel7.setBounds(new Rectangle(30, 510, 80, 40));
		jLabel8.setText("预付金额：");		
		jLabel8.setBounds(new Rectangle(250, 510, 80, 40));
		jLabel9.setText("找零金额：");		
		jLabel9.setBounds(new Rectangle(470, 510, 80, 40));
		
		//设置文本框
		jTextField1.setBounds(new Rectangle(100, 450, 150, 20));
	    jTextField2.setBounds(new Rectangle(305, 450, 80, 20));
	    jTextField3.setBounds(new Rectangle(435, 450, 100, 20));
	    jTextField4.setBounds(new Rectangle(630, 450, 100, 20));
	    jTextField5.setBounds(new Rectangle(100, 480, 150, 20));
	    jTextField6.setBounds(new Rectangle(305, 480, 80, 20));
	    jTextField7.setBounds(new Rectangle(100, 516, 120, 30));
	    jTextField8.setBounds(new Rectangle(320, 516, 120, 30));
	    jTextField9.setBounds(new Rectangle(540, 516, 120, 30));
	    
	    //设置按钮
	    jButton1.setText("撤销商品");
	    jButton1.setBounds(new Rectangle(435, 480, 100, 20));
	    jButton2.setText("交易取消");
	    jButton2.setBounds(new Rectangle(555, 480, 100, 20));
	    jButton3.setText("高    级");
	    jButton3.setBounds(new Rectangle(675, 480, 100, 20));
	    
		// 初始化一个容器，并加入panel1
		getContentPane().add(panel1);

		// 将页面的组件添加到窗口
		panel1.add(jScrollPane1);
		panel1.add(jLabel1);
		panel1.add(jLabel2);
		panel1.add(jLabel3);
		panel1.add(jLabel4);
		panel1.add(jLabel5);
		panel1.add(jLabel6);
		panel1.add(jLabel7);
		panel1.add(jLabel8);
		panel1.add(jLabel9);
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);
		panel1.add(jTextField9);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);

	}
}
