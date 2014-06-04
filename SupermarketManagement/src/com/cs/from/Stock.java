package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
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

	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();

    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //表头
    Vector colnames1 = new Vector(); //测试
    Vector colnames2 = new Vector(); //测试
	
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
		this(new Frame(),"采购表",false);
		this.setSize(820, 570);
		this.setLocation(100, 100);
		this.setVisible(true);			//显示窗口
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//清除默认的布局
		
		jLabel1.setText("商品编码");				//设置商品编码名称大小和位置
		jLabel1.setBounds(new Rectangle(37, 28, 75, 21));
		jLabel2.setText("商品名称");				//设置商品名称标签
		jLabel2.setBounds(new Rectangle(226, 28, 75, 21));
		jLabel3.setText("采购部门");				//设置类别编号标签
		jLabel3.setBounds(new Rectangle(411, 28, 75, 21));
		jLabel4.setText("数        量");				//设置商品名称标签
		jLabel4.setBounds(new Rectangle(37, 59, 75, 21));
		jLabel5.setText("单        价");				//设置单价标签
		jLabel5.setBounds(new Rectangle(226, 59, 75, 21));
		jLabel6.setText("金        额");				//设置金额标签
		jLabel6.setBounds(new Rectangle(411, 59, 75, 21));
		jLabel7.setText("下单日期");				//设置下单日期标签
		jLabel7.setBounds(new Rectangle(589, 28, 75, 21));
		jLabel8.setText("付款期限(天)");				//设置下单日期标签
		jLabel8.setBounds(new Rectangle(589, 59, 75, 21));
		
		jScrollPane1.setBounds(new Rectangle(14, 126, 765, 381));
		
		jTextField1.setBounds(new Rectangle(104, 28, 111, 21));		//设置选项文本框
	    jTextField2.setBounds(new Rectangle(286, 28, 111, 21));
	    jTextField2.setEnabled(false);
	    jTextField3.setBounds(new Rectangle(469, 28, 111, 21));
	    jTextField4.setBounds(new Rectangle(104, 59, 111, 21));
	    jTextField4.setText("1");
	    jTextField5.setBounds(new Rectangle(286, 59, 111, 21));
	    jTextField5.setEnabled(false);
	    jTextField6.setBounds(new Rectangle(469, 59, 111, 21));
	    jTextField6.setEnabled(false);
	    jTextField7.setBounds(new Rectangle(645, 28, 128, 21));
	    jTextField7.setEnabled(false);
	    jTextField8.setBounds(new Rectangle(666, 59, 107, 21));
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//得到当前的时间
	    
		jButton1.setBounds(new Rectangle(137, 93, 83, 25));
		jButton1.setText("确定");				//设置添加按钮
		
		jButton2.setBounds(new Rectangle(244, 93, 83, 25));
		jButton2.setText("删除");				//设置添加按钮
		
		jButton3.setBounds(new Rectangle(351, 93, 83, 25));
		jButton3.setText("提交");				//设置添加按钮
		
		jButton4.setBounds(new Rectangle(457, 93, 83, 25));
		jButton4.setText("清空");				//设置添加按钮
		
		jButton5.setBounds(new Rectangle(565, 93, 83, 25));
		jButton5.setText("退出");				//设置添加按钮
		
		//向表格中添加表头信息
		colnames.add("商品编码");		
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

		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);

		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			/*jTextField7.setText(GetT);*/
		}
	}
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("我爱你");	
	}
}

