package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.cs.main.MainFrame;
import com.cs.means.find_goods_info;


/**
 * 系统登录功能模块——login
 * 功能：增加系统的安全性，设置只有通过系统身份验证的用户才能使用本系统
 * @author MiracleWong
 *
 */
public class login extends JDialog{
	//声明
	sale form;
	JPanel jPanel1 = new JPanel();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JTextField jTextField1 = new JTextField();
	JPasswordField jPasswordField1 = new JPasswordField();
	
	public  login(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//窗口初始化
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public login() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"管理员登录",false);
		this.setSize(400, 300);
		this.setLocationRelativeTo(getOwner());			//窗体居中
		this.setVisible(true);			//显示窗口
	}
	
	//jbInit()为自定义的窗体实例化函数，初始化窗体
	private void jbInit() throws Exception{
		jPanel1.setLayout(null);	//去掉所有默认布局
		//设置显示区域
		jTextField1.setBounds(new Rectangle(158, 87, 100, 25));
		jLabel1.setText("用户名");
		jLabel1.setBounds(new Rectangle(78, 87, 49, 25));
		jLabel2.setText("密    码");
		jLabel2.setBounds(new Rectangle(76, 124, 49, 25));
//		jLabel3.setFont(new java.awt.Font("宋体", Font.PLAIN, 20));	//设置字体
		jLabel3.setText("管理员登录");
		jLabel3.setBounds(new Rectangle(145, 30, 113, 27));
		jButton1.setText("登    录");
		jButton1.setBounds(new Rectangle(75, 206, 83, 25));
		jButton1.addActionListener(new Admin_jButton1_actionAdapter(this));		//注册监听器
		jButton2.setText("取    消");
		jButton2.setBounds(new Rectangle(210, 206, 83, 25));
		jButton2.addActionListener(new Admin_jButton2_actionAdapter(this));		//注册监听器
		
		jPasswordField1.setBounds(new Rectangle(158, 125, 101, 25));
		//初始化一个容器，并加入jPanel1
		this.getContentPane().add(jPanel1);
		//将组件添加到jpanel1上
		jPanel1.add(jLabel3);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		jPanel1.add(jLabel2);
		jPanel1.add(jPasswordField1);
		
		jPanel1.add(jButton1);
		jPanel1.add(jButton2);
		
	}
	//jButton1的监听事件
	public void jButton1_acactionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Vector user = new Vector();
        String name = jTextField1.getText();
        String password = jPasswordField1.getText();
        user = find_goods_info.Select_User(name, password);
        if (user.size() != 0) {
            this.setVisible(false);
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            mainFrame.setLocation(50, 50);
            form.setVisible(false);			//设置窗体不可见
            System.out.println("连接成功");
        }
        else {
            JOptionPane.showMessageDialog(this, "用户名或密码不正确,请重新输入", "错误",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        }
	}
	//jButton2的监听事件
	public void jButton2_acactionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}
}

class Admin_jButton1_actionAdapter implements ActionListener {
	private login adaptee;
	Admin_jButton1_actionAdapter(login adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_acactionPerformed(e);
	}
}

class Admin_jButton2_actionAdapter implements ActionListener {
	private login adaptee;
	Admin_jButton2_actionAdapter(login adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton2_acactionPerformed(e);
	}
}
