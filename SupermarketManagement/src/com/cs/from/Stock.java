package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class Stock extends JDialog {
	
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
	JLabel jLabel10 = new JLabel();
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JTextField jTextField9 = new JTextField();
    JTextField jTextField10 = new JTextField();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();
    Vector colnames = new Vector(); //表头
    Vector colnames1 = new Vector(); //测试
    Vector colnames2 = new Vector(); //测试
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JComboBox jComboBox1 = new JComboBox();
	
	public  Stock(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//窗口的初始化函数
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Stock() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"增加商品",false);
		this.setSize(920, 500);
		this.setLocation(100, 100);
		this.setVisible(true);			//显示窗口
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//设置布局为空
		jLabel1.setText("商品编码：");				//设置商品编码名称大小和位置
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		jLabel2.setText("条  形  码：");				//设置条形码名称标签
		jLabel2.setBounds(new Rectangle(15, 50, 85, 26));
		jLabel3.setText("类别编号：");				//设置类别编号标签
		jLabel3.setBounds(new Rectangle(15, 90, 85, 26));
		jLabel4.setText("商品名称：");				//设置商品名称标签
		jLabel4.setBounds(new Rectangle(15, 130, 85, 26));
		jLabel5.setText("零售价(元)：");			//设置零售价标签
		jLabel5.setBounds(new Rectangle(15, 170, 85, 26));
		jLabel6.setText("商品规格：");				//设置商品规格标签
		jLabel6.setBounds(new Rectangle(15, 210, 85, 26));
		jLabel7.setText("计量单位：");				//设置计量单位标签
		jLabel7.setBounds(new Rectangle(15, 250, 85, 26));
		jLabel8.setText("进  货  价：");				//设置进货价标签
		jLabel8.setBounds(new Rectangle(15, 290, 85, 26));
		jLabel9.setText("保质期(天)：");			//设置保质期标签
		jLabel9.setBounds(new Rectangle(15, 330, 85, 26));
		jLabel10.setText("备   注 ：");				//设置备注标签
		jLabel10.setBounds(new Rectangle(15, 370, 85, 26));
		//添加复选框
		jComboBox1.addItem("生鲜类");
		jComboBox1.addItem("食品类");
		jComboBox1.addItem("蔬果类");
		jComboBox1.addItem("电器类");
		jComboBox1.addItem("日用类");
		jComboBox1.addItem("礼品类");
		jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));
		
		jTextField1.setBounds(new Rectangle(91, 10, 125, 24));		//设置选项文本框
	    jTextField2.setBounds(new Rectangle(91, 50, 125, 24));
	    jTextField4.setBounds(new Rectangle(91, 130, 125, 24));
	    jTextField5.setBounds(new Rectangle(91, 170, 125, 24));
	    jTextField6.setBounds(new Rectangle(91, 210, 125, 24));
	    jTextField7.setBounds(new Rectangle(91, 250, 125, 24));
	    jTextField8.setBounds(new Rectangle(91, 290, 125, 24));
	    jTextField9.setBounds(new Rectangle(91, 330, 125, 24));
	    jTextField10.setBounds(new Rectangle(91, 370, 125, 24));
	    
	    jScrollPane1.setBounds(new Rectangle(228, 10, 658, 383));
	    
		jButton1.setBounds(new Rectangle(53, 418, 127, 27));
		jButton1.setText("添    加");				//设置添加按钮
		
		jButton2.setBounds(new Rectangle(273, 418, 127, 27));
		jButton2.setText("重    置");				//设置添加按钮
		
		jButton3.setBounds(new Rectangle(493, 418, 127, 27));
		jButton3.setText("删    除");				//设置添加按钮
		
		jButton4.setBounds(new Rectangle(713, 418, 127, 27));
		jButton4.setText("提    交");				//设置添加按钮
		
		
		colnames.add("商品编码");		//向表格中添加表头信息
	    colnames.add("条型码");
	    colnames.add("类别编号");
	    colnames.add("商品名称");
	    colnames.add("零售价(元)");
	    colnames.add("商品规格");
	    colnames.add("计量单位");
	    colnames.add("进货价");
	    colnames.add("保质期(天)");
	    colnames.add("备注");
	    colnames2.add(colnames1);
	    jTable1 = Mytable.maketable(colnames2, colnames);
	    jScrollPane1.getViewport().add(jTable1);
	    //初始化一个容器，并加入panel1
		getContentPane().add(panel1);
		//将页面的组件添加到窗口
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
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);
		panel1.add(jTextField9);
		panel1.add(jTextField10);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jComboBox1);
		panel1.add(jScrollPane1);		
	}	
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("我爱你");	
	}
}
