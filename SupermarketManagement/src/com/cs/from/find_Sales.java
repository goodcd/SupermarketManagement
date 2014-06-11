package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.cs.tools.DateChooser;

/**
 * 商品销售的查询的find_Sales类
 * 并且定义了该窗体需要的各种组件，
 * 包括文本输入框、JLabel标签、JButton按钮、Panel容器等组件
 * 定义了两个构造函数，一个带有参数，实现界面的初始化；
 * 第二个没有参数，用来调用带有参数的构造函数。
 * @author MiracleWong
 *
 */
public class find_Sales extends JDialog {
	
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
	JLabel jLabel10 = new JLabel();
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	
	//文本框
	JTextField jTextField1 = new JTextField();
	JTextField jTextField2 = new JTextField();
	
	final DateChooser start = new DateChooser();
	final DateChooser end = new DateChooser();
	
	JButton jButton_OK = new JButton();
	
	JScrollPane jScrollPane1 = new JScrollPane();
	JTable jTable1 = new JTable(); 			// 表格
	Vector colnames = new Vector(); 		// 表头
	Vector colnames1 = new Vector(); 		// 测试
	Vector colnames2 = new Vector(); 		// 测试

	public find_Sales(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//初始化界面
			pack();			//刷新界面
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public find_Sales() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "销售明细查询", false);
		this.setSize(610, 620);
		setLocationRelativeTo(getOwner());
		this.setVisible(true);
	}
	//界面初始化函数
	public void jbInit() {
		
		panel1.setLayout(null); // 清空默认的布局设置
		
		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setDebugGraphicsOptions(0);
		jLabel1.setDisplayedMnemonic('0');
		jLabel1.setBounds(new Rectangle(12, 6, 573, 121));
		jLabel2.setText("销售商品明细");
		jLabel2.setBounds(new Rectangle(19, 40, 158, 38));
//		jLabel2.setFont(new Font("宋体", Font.BOLD,20));
		jLabel3.setText("起始日期");
		jLabel3.setBounds(new Rectangle(189, 31, 66, 20));	
		
		start.setBounds(new Rectangle(254, 31, 120,20));
		
		jLabel4.setText("结束日期");
		jLabel4.setBounds(new Rectangle(189, 62, 66, 20));
		
		end.setBounds(new Rectangle(254, 62,120, 20));
		
		jLabel5.setText("商品编号：");
		jLabel5.setBounds(new Rectangle(189, 98, 67, 20));
		
		jLabel6.setFont(new java.awt.Font("宋体", Font.BOLD, 20));
		jLabel6.setText("商品汇总");
		jLabel6.setBounds(new Rectangle(233, 126, 134, 31));
		jLabel7.setBorder(BorderFactory.createEtchedBorder());
		jLabel7.setBounds(new Rectangle(110, 162, 146, 24));
		jLabel8.setText(">>>>>>");
		jLabel8.setBounds(new Rectangle(262, 166, 60, 16));
		jLabel9.setBorder(BorderFactory.createEtchedBorder());
		jLabel9.setBounds(new Rectangle(310, 162, 146, 24));
		
		jLabel10.setText("金额合计：");
		jLabel10.setBounds(new Rectangle(36, 531, 176, 47));
		jLabel10.setFont(new java.awt.Font("宋体", Font.BOLD, 30));
		
		jLabel11.setBorder(BorderFactory.createEtchedBorder());
		jLabel11.setBounds(new Rectangle(215, 531, 183, 46));
		
		//设置文本框
		jTextField1.setBounds(new Rectangle(254, 98,  120, 20));
		
		jButton_OK.setText("确定");
		jButton_OK.setBounds(new Rectangle(510, 27, 63, 24));
		
		// 向表格中添加表头信息
		colnames.add("商品编号");
		colnames.add("商品名称");
		colnames.add("销售数量");
		colnames.add("销售金额");
		colnames.add("销售日期");
		colnames.add("金额合计");
		colnames2.add(colnames1);
		//设置ScrollPane的大小
		jScrollPane1.setBounds(new Rectangle(20, 200, 560, 310));
		
		jTable1 = Mytable.maketable(colnames2, colnames);
		jScrollPane1.getViewport().add(jTable1);
		
		// 初始化一个容器，并加入panel1
		getContentPane().add(panel1);
		// 将页面的组件添加到窗口
		panel1.add(jLabel1);
		panel1.add(jLabel2);
		panel1.add(jLabel3);
		panel1.add(jLabel4);
		panel1.add(jLabel5);
		panel1.add(jLabel6);
		panel1.add(jLabel7);
		panel1.add(jLabel8);
		panel1.add(jLabel9);
		panel1.add(jLabel10);
		panel1.add(jLabel11);
		panel1.add(jLabel12);
		panel1.add(start);
		panel1.add(end);
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jButton_OK);
		
		panel1.add(jScrollPane1);
		
	}
}
