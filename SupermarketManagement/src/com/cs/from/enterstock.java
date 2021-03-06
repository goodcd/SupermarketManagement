package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Toolkit;
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
import javax.swing.table.JTableHeader;

import com.cs.means.GetTime;

/**
 * 在工程中增加进货的enterstock类，
 * 并且定义了该窗体需要的各种组件，
 * 包括文本输入框、JLabel标签、JButton按钮、Panel容器和下拉列表等组件
 * 定义了两个构造函数，一个带有参数，实现界面的初始化；
 * 第二个没有参数，用来调用带有参数的构造函数。
 * @author MiracleWong
 *
 */
public class enterstock extends JDialog {
	
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
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	//文本框
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    //按钮
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    //下拉复选框
    JComboBox jComboBox1 = new JComboBox();
    JComboBox jComboBox2 = new JComboBox();
    JComboBox jComboBox3 = new JComboBox();
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //表头
    Vector colnames1 = new Vector(); //测试
    Vector colnames2 = new Vector(); //测试
	
	public  enterstock(Frame ower, String title, boolean modal) {
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
	public enterstock() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"进/出库管理",false);
		this.setSize(665, 500);
//		this.setLocation(100, 100);
		setLocationRelativeTo(getOwner());
		this.setVisible(true);			//显示窗口
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//清除默认的布局管理

		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setBounds(new Rectangle(30, 7, 600, 36));
		jLabel2.setText("类别：");			//类别
		jLabel2.setBounds(new Rectangle(40, 20, 40, 15));
		jLabel3.setText("时间：");			//时间
		jLabel3.setBounds(new Rectangle(205, 20, 40, 15));
		jLabel4.setText("操作员：");			//操作员
		jLabel4.setBounds(new Rectangle(425, 20, 60, 15));
		
		jLabel5.setText("货单录入");				//货单录入
		jLabel5.setBounds(new Rectangle(30, 45, 102, 26));
		
		jLabel6.setBorder(BorderFactory.createEtchedBorder());
		jLabel6.setBounds(new Rectangle(30, 72, 600, 70));
		jLabel7.setText("商品编号：");			//商品编号
		jLabel7.setBounds(new Rectangle(40, 82, 80, 15));
		jLabel8.setText("数        量：");			//数量
		jLabel8.setBounds(new Rectangle(235, 82, 80, 15));
		jLabel9.setText("进货单价：");			//进货单价
		jLabel9.setBounds(new Rectangle(425, 82, 80, 15));
		
		jLabel10.setText("仓  库  号：");				//仓库号
		jLabel10.setBounds(new Rectangle(40, 112, 80, 15));
		jLabel11.setText("总  金  额：");				//总金额
		jLabel11.setBounds(new Rectangle(235, 112, 80, 15));
		jLabel12.setText("经  手  人：");				//经手人
		jLabel12.setBounds(new Rectangle(425, 112, 80, 15));
		
		jScrollPane1.setBounds(new Rectangle(30, 150, 600, 240));
		
		//设置文本框
		jTextField1.setBounds(new Rectangle(250, 13, 150, 24));		
		jTextField2.setBounds(new Rectangle(110, 78, 115, 24));
	    jTextField3.setBounds(new Rectangle(305, 78, 95, 24));	    
	    jTextField4.setBounds(new Rectangle(495, 78, 115, 24));

	    jTextField5.setBounds(new Rectangle(305, 108, 95, 24));
	    jTextField6.setBounds(new Rectangle(495, 108, 115, 24));
	    
	    jTextField7.setBounds(new Rectangle(666, 59, 107, 21));
		
		//下拉框
	    jComboBox1.setBounds(new Rectangle(85, 13, 100, 24));
	    jComboBox1.addItem("入库");
        jComboBox1.addItem("出库");
        
        jComboBox2.setBounds(new Rectangle(490, 13, 100, 24));
	    jComboBox2.addItem("付鹏");
	    jComboBox2.addItem("汪涛");
        jComboBox2.addItem("薛本众");
        
        jComboBox3.setBounds(new Rectangle(110, 108, 115, 24));
        jComboBox3.addItem("CK0001");
        jComboBox3.addItem("CK0002");
        jComboBox3.addItem("CK0003");
		
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//得到当前的时间
	    
		jButton1.setBounds(new Rectangle(46, 409, 80, 30));
		jButton1.setText("确认");				//设置确认按钮
		jButton1.addActionListener(new Put_Out_Depot_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(166, 409, 80, 30));
		jButton2.setText("删除");				//设置删除按钮
		jButton2.addActionListener(new Put_Out_Depot_jButton2_actionAdapter(this));
		
		jButton3.setBounds(new Rectangle(286, 409, 80, 30));
		jButton3.setText("重置");             	//设置重置按钮
		
		jButton4.setBounds(new Rectangle(406, 409, 80, 30));
		jButton4.setText("提交");				//设置提交按钮
		jButton4.addActionListener(new Put_Out_Depot_jButton4_actionAdapter(this));
		
		jButton5.setBounds(new Rectangle(526, 409, 80, 30));
		jButton5.setText("退出");				//设置退出按钮
		jButton5.addActionListener(new Put_Out_Depot_jButton5_actionAdapter(this));
		
		//向表格中添加表头信息
		colnames.add("编号");		
	    colnames.add("数量");
	    colnames.add("进货价");
	    colnames.add("总金额");
	    colnames.add("日期");
	    colnames.add("仓库号");
	    colnames.add("经手人");
	    colnames.add("填单人");
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
		panel1.add(jLabel11);
		panel1.add(jLabel12);

		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);

		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jComboBox1);
		panel1.add(jComboBox2);
		panel1.add(jComboBox3);
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			jTextField1.setText(GetTime.getTime());
		}
	}
	
	Vector inserAll = new Vector();		//所有商品的相关信息
	//确认按钮——Button1的功能实现
	public void jButton1_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//删除按钮——Button2的功能实现
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//重置按钮——Button3的功能实现
	public void jButton3_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}	
	
	//提交按钮——Button4的功能实现
	public void jButton4_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//退出按钮——Button5的功能实现
	public void jButton5_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}


class Put_Out_Depot_jButton1_actionAdapter implements ActionListener {
	private enterstock adaptee;
	Put_Out_Depot_jButton1_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class Put_Out_Depot_jButton2_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton2_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton3_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton3_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
       adaptee.jButton3_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton4_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton4_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton5_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton5_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}

