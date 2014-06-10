package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.cs.means.GetTime;
/**
 * 在工程中增加进货的BackSale类，
 * 并且定义了该窗体需要的各种组件，
 * 包括文本输入框、JLabel标签、JButton按钮、Panel容器和下拉列表等组件
 * 定义了两个构造函数，一个带有参数，实现界面的初始化；
 * 第二个没有参数，用来调用带有参数的构造函数。
 * @author MiracleWong
 *
 */
public class BackSale extends JDialog {
	
	//类的成员变量
	JPanel panel1 = new JPanel();
	//标签
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
	//文本框
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    //按钮
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    JComboBox jComboBox1 = new JComboBox();		//复合框
    JComboBox jComboBox2 = new JComboBox();		//复合框
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //表头
    Vector colnames1 = new Vector(); //测试
    Vector colnames2 = new Vector(); //测试

	public  BackSale(Frame ower, String title, boolean modal) {
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
	public BackSale() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"进/退货维护",false);
		this.setSize(600, 500);				//设置窗体大小
		setLocationRelativeTo(getOwner());	//窗体居中
		this.setVisible(true);				//显示窗口
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 			//清除布局格式

		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setBounds(new Rectangle(29, 7, 536, 36));
		jLabel2.setText("类别：");			//类别
		jLabel2.setBounds(new Rectangle(35, 20, 40, 15));
		jLabel3.setText("时间：");			//时间
		jLabel3.setBounds(new Rectangle(185, 20, 40, 15));
		jLabel4.setText("操作员：");			//操作员
		jLabel4.setBounds(new Rectangle(385, 20, 60, 15));
		
		jLabel5.setBorder(BorderFactory.createEtchedBorder());
		jLabel5.setBounds(new Rectangle(29, 42, 536, 36));
		jLabel6.setText("商品编号：");			//商品编号
		jLabel6.setBounds(new Rectangle(35, 55, 80, 15));
		jLabel7.setText("数量：");			//数量
		jLabel7.setBounds(new Rectangle(235, 55, 40, 15));
		jLabel8.setText("进货单价：");			//进货单价
		jLabel8.setBounds(new Rectangle(385, 55, 80, 15));
		jLabel9.setText("备注：");			//备注
		jLabel9.setBounds(new Rectangle(35, 365, 42, 15));
		
		jScrollPane1.setBounds(new Rectangle(29, 77, 537, 275));
		
		//设置文本框
	    jTextField1.setBounds(new Rectangle(225, 13, 150, 24));
	    jTextField2.setBounds(new Rectangle(100, 48, 125, 24));
	    jTextField3.setBounds(new Rectangle(275, 48, 100, 24));
	    jTextField4.setBounds(new Rectangle(455, 48, 100, 24));
	    jTextField5.setBounds(new Rectangle(70, 350, 496, 54));
	    
	    //下拉框
	    jComboBox1.setBounds(new Rectangle(75, 13, 100, 24));
	    jComboBox1.addItem("进货");
        jComboBox1.addItem("退货");
        
        jComboBox2.setBounds(new Rectangle(455, 13, 100, 24));
	    jComboBox2.addItem("付鹏");
	    jComboBox2.addItem("汪涛");
        jComboBox2.addItem("薛本众");
        
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//得到当前的时间
	    
		jButton1.setBounds(new Rectangle(46, 409, 80, 30));
		jButton1.setText("确认");				//确认
		jButton1.addActionListener(new JoinAndExceed_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(146, 409, 80, 30));
		jButton2.setText("删除");				//删除
		jButton2.addActionListener(new JoinAndExceed_jButton2_actionAdapter(this));
		
		jButton3.setBounds(new Rectangle(246, 409, 80, 30));
		jButton3.setText("取消");             	//取消
		jButton3.addActionListener(new JoinAndExceed_jButton3_actionAdapter(this));
		
		jButton4.setBounds(new Rectangle(346, 409, 80, 30));
		jButton4.setText("提交");				//提交
		jButton4.addActionListener(new JoinAndExceed_jButton4_actionAdapter(this));
		
		jButton5.setBounds(new Rectangle(446, 409, 80, 30));
		jButton5.setText("查询");				//查询
		jButton5.addActionListener(new JoinAndExceed_jButton5_actionAdapter(this));
		
		//向表格中添加表头信息
		colnames.add("商品编号");
        colnames.add("商品名称");
        colnames.add("数量");
        colnames.add("进货价");
        colnames.add("日期");
        colnames.add("金额");
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
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jComboBox1);
		panel1.add(jComboBox2);	
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			jTextField1.setText(GetTime.getTime());
		}
	}
	
	Vector addAllData = new Vector(); 		//所有商品的相关信息
	public void jButton1_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton3_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton4_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton5_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}

class JoinAndExceed_jButton1_actionAdapter implements ActionListener {
	private BackSale adaptee;
	JoinAndExceed_jButton1_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class JoinAndExceed_jButton2_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton2_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton3_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton3_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton4_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton4_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton5_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton5_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}