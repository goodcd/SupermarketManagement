package com.cs.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class MainFrame extends JFrame{
	JPanel contentPane;
	/*定义菜单栏*/
	JMenuBar jMenuBar1 = new JMenuBar();
	JMenu jMenu1 = new JMenu();			//系统
	JMenu jMenu2 = new JMenu();			//采购
	JMenu jMenu3 = new JMenu();			//仓库
	JMenu jMenu4 = new JMenu();			//用户管理
	JMenu jMenu5 = new JMenu();			//信息查询
	JMenu jMenu6 = new JMenu();			//查询商品信息
	JMenu jMenu7 = new JMenu();			//按商品类别查询
	/*定义子菜单*/
	JMenuItem jMenuItem1 = new JMenuItem();
	JMenuItem jMenuItem2 = new JMenuItem();
	JMenuItem jMenuItem3 = new JMenuItem();
	JMenuItem jMenuItem4 = new JMenuItem();
	JMenuItem jMenuItem5 = new JMenuItem();
	JMenuItem jMenuItem6 = new JMenuItem();
	JMenuItem jMenuItem7 = new JMenuItem();
	JMenuItem jMenuItem8 = new JMenuItem();
	JMenuItem jMenuItem9 = new JMenuItem();
	JMenuItem jMenuItem10 = new JMenuItem();
	JMenuItem jMenuItem11 = new JMenuItem();
	JMenuItem jMenuItem12 = new JMenuItem();
	JMenuItem jMenuItem13 = new JMenuItem();
	JMenuItem jMenuItem14 = new JMenuItem();
	JMenuItem jMenuItem15 = new JMenuItem();
	JMenuItem jMenuItem16 = new JMenuItem();
	JMenuItem jMenuItem17 = new JMenuItem();
	JMenuItem jMenuItem18 = new JMenuItem();
	JMenuItem jMenuItem19 = new JMenuItem();
	JMenuItem jMenuItem20 = new JMenuItem();
	JMenuItem jMenuItem21 = new JMenuItem();
	
	//定义树形
	JTree jTree1 = new JTree();
	JLabel statusBar = new JLabel();				//表格展示区域
	JTable jTable = new JTable();					//表格
	TitledBorder titledBorder = new TitledBorder("");
	JScrollPane jScrollPane1 = new JScrollPane();	//带有滚动条的区域
	JScrollPane jScrollPane2 = new JScrollPane();

	public MainFrame() {
		// TODO Auto-generated constructor stub
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			jbInit();			//窗体初始化
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	//窗体初始化函数
	private void jbInit() throws Exception{
		contentPane = (JPanel)getContentPane();		//初始化JPanel
		contentPane.setLayout(null);				//清除界面的布局格式
		
		this.setTitle("超市后台管理系统");				//设置窗口名称
		this.setSize(new Dimension(940,600));		//设置窗口大小
		
		/*设置菜单名称*/
		jMenu1.setText("系统");
		jMenu2.setText("采购");
		jMenu3.setText("仓库");
		jMenu4.setText("用户管理");
		jMenu5.setText("信息查询");
		
		jMenu6.setText("查询商品信息");
		jMenu7.setText("按商品类别查询");
		
		/*设置一级菜单名称*/
		jMenuItem1.setText("前台终端");
		jMenuItem2.setText("退出系统");
		jMenuItem3.setText("新增商品");
		jMenuItem4.setText("采购单");
		jMenuItem5.setText("付款单");
		jMenuItem6.setText("入库/出库");
		jMenuItem7.setText("进货/退货");
		jMenuItem8.setText("添加/修改用户");
		jMenuItem9.setText("账户信息");
		jMenuItem10.setText("销售统计");
//		jMenuItem11.setText("查询商品信息");
		
		/*设置二级菜单名称*/
		jMenuItem12.setText("按商品名称查询");
		jMenuItem13.setText("按商品条形码查询");
		jMenuItem14.setText("按商品编号查询");
//		jMenuItem15.setText("按商品类别查询");
		
		/*设置三级菜单名称*/
		jMenuItem16.setText("电器类查询");
		jMenuItem17.setText("礼品类查询");
		jMenuItem18.setText("日用类查询");
		jMenuItem19.setText("蔬果类查询");
		jMenuItem20.setText("食品类查询");
		jMenuItem21.setText("生鲜类查询");
		
		/* 为各级的菜单添加监听器用来监听动作*/
//		jMenuItem1.addActionListener();
		jMenuItem2.addActionListener(new exit_sys(this));
		
		/*将三级菜单的名称加入到二级菜单中*/
		jMenu7.add(jMenuItem16);
		jMenu7.add(jMenuItem17);
		jMenu7.add(jMenuItem18);
		jMenu7.add(jMenuItem19);
		jMenu7.add(jMenuItem20);
		jMenu7.add(jMenuItem21);
		
		/*将二级菜单的名称加入到一级菜单中*/
		jMenu6.add(jMenuItem12);
		jMenu6.add(jMenuItem13);
		jMenu6.add(jMenuItem14);
		jMenu6.add(jMenu7);
		
		/*将一级菜单的名称加入到菜单中*/
		jMenu1.add(jMenuItem1);
		jMenu1.add(jMenuItem2);
		jMenu2.add(jMenuItem3);
		jMenu2.add(jMenuItem4);
		jMenu2.add(jMenuItem5);
		jMenu3.add(jMenuItem6);
		jMenu3.add(jMenuItem7);
		jMenu4.add(jMenuItem8);
		jMenu4.add(jMenuItem9);
		jMenu5.add(jMenuItem10);
		jMenu5.add(jMenu6);
		
		//将菜单加入菜单栏
		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);
		jMenuBar1.add(jMenu3);
		jMenuBar1.add(jMenu4);
		jMenuBar1.add(jMenu5);
		//将菜单栏加入到窗体
		setJMenuBar(jMenuBar1);
		
		/*以下是显示树形结构的部分*/
		
		/**设置树状图形**/
		//树形的根节点
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("进销管理/查询");
		//一级树形定义和名称
		DefaultMutableTreeNode details = new DefaultMutableTreeNode("销售清单");
		DefaultMutableTreeNode browse = new DefaultMutableTreeNode("浏览库存");
		DefaultMutableTreeNode user = new DefaultMutableTreeNode("用户管理");
		DefaultMutableTreeNode info = new DefaultMutableTreeNode("信息查询");
		DefaultMutableTreeNode goods = new DefaultMutableTreeNode("商品管理");
		
		//二级树形的定义和名称
		DefaultMutableTreeNode Sells = new DefaultMutableTreeNode("销售统计");
		
		DefaultMutableTreeNode Storeinfr = new DefaultMutableTreeNode("库存信息浏览");
		DefaultMutableTreeNode Store1 = new DefaultMutableTreeNode("按库存商品编号查询");
		
		DefaultMutableTreeNode UserNa = new DefaultMutableTreeNode("添加/修改用户");
		DefaultMutableTreeNode UserAdd = new DefaultMutableTreeNode("个人账户查询");
		
		DefaultMutableTreeNode search1 = new DefaultMutableTreeNode("按商品名称查询");
		DefaultMutableTreeNode search2 = new DefaultMutableTreeNode("按商品编号查询");
		DefaultMutableTreeNode search3 = new DefaultMutableTreeNode("按商品条形码查询");
		DefaultMutableTreeNode search4 = new DefaultMutableTreeNode("按商品类别查询");

		DefaultMutableTreeNode inout = new DefaultMutableTreeNode("入库/出库");
		DefaultMutableTreeNode addexit = new DefaultMutableTreeNode("进/退货");
		DefaultMutableTreeNode addgoods = new DefaultMutableTreeNode("增加商品");
		
		//三级树形的定义和名称
		DefaultMutableTreeNode sort1 = new DefaultMutableTreeNode("电器类查询");
		DefaultMutableTreeNode sort2 = new DefaultMutableTreeNode("礼品类查询");
		DefaultMutableTreeNode sort3 = new DefaultMutableTreeNode("日用类查询");
		DefaultMutableTreeNode sort4 = new DefaultMutableTreeNode("蔬果类查询");
		DefaultMutableTreeNode sort5 = new DefaultMutableTreeNode("食品类查询");
		DefaultMutableTreeNode sort6 = new DefaultMutableTreeNode("生鲜类查询");
		
		//父节点上添加一级节点
		root.add(details);
		root.add(browse);
		root.add(user);
		root.add(info);
		root.add(goods);
		//一级节点上添加二级节点
		details.add(Sells);
		browse.add(Storeinfr);
		browse.add(Store1);
		user.add(UserNa);
		user.add(UserAdd);
		info.add(search1);
		info.add(search2);
		info.add(search3);
		info.add(search4);
		goods.add(inout);
		goods.add(addexit);
		goods.add(addgoods);
		//二级节点上添加三级节点
		search4.add(sort1);
		search4.add(sort2);
		search4.add(sort3);
		search4.add(sort4);
		search4.add(sort5);
		search4.add(sort6);
		
		//刷新树形结构
		jTree1 = new JTree(root);
		//添加监听器
		
		//设置滚动区域的显示范围
		jScrollPane1.setBounds(new Rectangle(13, 25, 152, 435));
		jScrollPane2.setBounds(new Rectangle(167, 25, 750, 435));
		
		jScrollPane1.getViewport().add(jTree1);
		
		contentPane.add(jScrollPane1);
		contentPane.add(jScrollPane2);
		
		this.setVisible(true);			//使得窗口显示
	}
	public void exit_system(ActionEvent e) {
		System.exit(0);
	}
}

class exit_sys implements ActionListener {
	private MainFrame adaptee;
	exit_sys(MainFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.exit_system(e);
	}
}


























/*//整个页面的属性设置
Toolkit toolkit = Toolkit.getDefaultToolkit();
Dimension screenSize = toolkit.getScreenSize();		//获取主显示器的大小，如1280*1024
//使得Frame窗口在屏幕居中显示
this.setLocation((screenSize.width - this.getWidth()) / 2,
(screenSize.height - this.getHeight()) / 2);*/
