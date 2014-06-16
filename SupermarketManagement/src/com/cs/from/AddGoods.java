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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import com.cs.means.Insert_goods;

public class AddGoods extends JDialog {

	// 类的成员变量
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
	Vector colnames = new Vector(); // 表头
	Vector colnames1 = new Vector(); // 测试
	Vector colnames2 = new Vector(); // 测试
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();
	JButton jButton4 = new JButton();
	JComboBox jComboBox1 = new JComboBox();

	public AddGoods(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			// 在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit(); // 窗口的初始化函数
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public AddGoods() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "增加商品", false);
		this.setSize(920, 500); // 设置窗体大小
		setLocationRelativeTo(getOwner()); // 居中显示
		this.setVisible(true); // 显示窗口
	}

	private void jbInit() throws Exception {
		panel1.setLayout(null); // 设置布局为空
		jLabel1.setText("商品编码："); // 设置商品编码名称大小和位置
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		jLabel2.setText("条  形  码："); // 设置条形码名称标签
		jLabel2.setBounds(new Rectangle(15, 50, 85, 26));
		jLabel3.setText("类别编号："); // 设置类别编号标签
		jLabel3.setBounds(new Rectangle(15, 90, 85, 26));
		jLabel4.setText("商品名称："); // 设置商品名称标签
		jLabel4.setBounds(new Rectangle(15, 130, 85, 26));
		jLabel5.setText("零售价(元)："); // 设置零售价标签
		jLabel5.setBounds(new Rectangle(15, 170, 85, 26));
		jLabel6.setText("商品规格："); // 设置商品规格标签
		jLabel6.setBounds(new Rectangle(15, 210, 85, 26));
		jLabel7.setText("计量单位："); // 设置计量单位标签
		jLabel7.setBounds(new Rectangle(15, 250, 85, 26));
		jLabel8.setText("进  货  价："); // 设置进货价标签
		jLabel8.setBounds(new Rectangle(15, 290, 85, 26));
		jLabel9.setText("保质期(天)："); // 设置保质期标签
		jLabel9.setBounds(new Rectangle(15, 330, 85, 26));
		jLabel10.setText("备   注 ："); // 设置备注标签
		jLabel10.setBounds(new Rectangle(15, 370, 85, 26));
		// 添加复选框
		jComboBox1.addItem("生鲜类");
		jComboBox1.addItem("食品类");
		jComboBox1.addItem("蔬果类");
		jComboBox1.addItem("电器类");
		jComboBox1.addItem("日用类");
		jComboBox1.addItem("礼品类");
		jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));

		jTextField1.setBounds(new Rectangle(91, 10, 125, 24)); // 设置选项文本框
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
		jButton1.setText("添    加"); // 设置添加按钮
		jButton1.addActionListener(new AddMerchandise_jButton1_actionAdapter(
				this));

		jButton2.setBounds(new Rectangle(273, 418, 127, 27));
		jButton2.setText("重    置"); // 设置重置按钮
		jButton2.addActionListener(new AddMerchandise_jButton2_actionAdapter(
				this));

		jButton3.setBounds(new Rectangle(493, 418, 127, 27));
		jButton3.setText("删    除"); // 设置删除按钮
		jButton3.addActionListener(new AddMerchandise_jButton3_actionAdapter(
				this));

		jButton4.setBounds(new Rectangle(713, 418, 127, 27));
		jButton4.setText("提    交"); // 设置提交按钮
		jButton4.addActionListener(new AddMerchandise_jButton4_actionAdapter(
				this));

		colnames.add("商品编码"); // 向表格中添加表头信息
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
		// jScrollPane1.getViewport().add(jTable1);
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

	// 利用Vector可变长数组的特性来提取商品信息，若商品信息中有未填写的内容则返回提示；
	// 若填写符合要求则采用add()的方法加入addAllData数组中。
	Vector addAllData = new Vector(); // 所有商品的相关信息

	// button1 的 功能：添加商品的信息到表格中
	public void jButton1_actionPerformed(ActionEvent e) {
		// 判断商品的信息是否完善
		if ((jTextField1.getText().length() == 0)
				|| (jTextField2.getText().length() == 0)
				|| (jTextField4.getText().length() == 0)
				|| (jTextField5.getText().length() == 0)
				|| (jTextField6.getText().length() == 0)
				|| (jTextField7.getText().length() == 0)
				|| (jTextField8.getText().length() == 0)
				|| (jTextField9.getText().length() == 0)) {
			JOptionPane.showMessageDialog(this, "提交的数据不合法，请检查", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			Double dj = new Double(jTextField5.getText()); // 零售价：定价
			Double jhj = new Double(jTextField8.getText()); // 进货价
			Double bzq = new Double(jTextField9.getText()); // 保质期
		} catch (Exception ex) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "提交的数据不合法，请检查", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		Vector addData = new Vector(); // 单个商品的相关信息
		addData.add(jTextField1.getText()); // 添加商品编码
		addData.add(jTextField2.getText()); // 添加条形码
		// 添加类别编号
		if (jComboBox1.getSelectedItem().equals("生鲜类")) {
			addData.add("SX1001");
		}
		if (jComboBox1.getSelectedItem().equals("食品类")) {
			addData.add("SP1002");
		}
		if (jComboBox1.getSelectedItem().equals("蔬果类")) {
			addData.add("SG1003");
		}
		if (jComboBox1.getSelectedItem().equals("电器类")) {
			addData.add("DQ1004");
		}
		if (jComboBox1.getSelectedItem().equals("日用类")) {
			addData.add("RY1005");
		}
		if (jComboBox1.getSelectedItem().equals("礼品类")) {
			addData.add("LP1006");
		}
		addData.add(jTextField4.getText()); // 添加商品名称
		addData.add(jTextField5.getText()); // 添加零售价
		addData.add(jTextField6.getText()); // 添加商品规格
		addData.add(jTextField7.getText()); // 添加计量单位
		addData.add(jTextField8.getText()); // 添加进货价
		addData.add(jTextField9.getText()); // 添加保质期
		addData.add(jTextField10.getText()); // 添加备注
		addAllData.add(addData); // 将商品添加到表格中
		jTable1 = Mytable.maketable(addAllData, colnames); // 显示内容
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button2 —— 重置 的功能：删除所有的商品信息
	public void jButton2_actionPerformed(ActionEvent e) {
		addAllData.removeAllElements();
		jTable1 = Mytable.maketable(addAllData, colnames); // 显示内容
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button3 —— 删除 的功能：删除选定的商品信息
	public void jButton3_actionPerformed(ActionEvent e) {
		int row = jTable1.getSelectedRow();
		addAllData.remove(row);
		jTable1 = Mytable.maketable(addAllData, colnames); // 显示内容
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button4 —— 提交 的功能：
	public void jButton4_actionPerformed(ActionEvent e) {
		Vector addData1 = new Vector();
		int i = 0;
		int number = 0;
		// 对表格中的数据进行循环遍历
		while (i < addAllData.size()) {
			addData1 = (Vector) addAllData.get(i); // 获取每一个商品的信息
			Double number1 = new Double(addData1.get(4).toString()); // 获取单价
			Double number2 = new Double(addData1.get(7).toString()); // 获取进货价
			Double number3 = new Double(addData1.get(8).toString()); // 获取保质期
			// 调用新增商品事件
			number = Insert_goods.Insert_merchandise(
					addData1.get(0).toString(), addData1.get(1).toString(),
					addData1.get(2).toString(),	addData1.get(3).toString(), 
					number1, addData1.get(5).toString(), 
					addData1.get(6).toString(), number2, 
					number3, addData1.get(9).toString());
			i++;

			String str = "第" + i + "条数据写入失败";
			if (number == 0) {
				JOptionPane.showMessageDialog(this, str, "提示",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if (i == addAllData.size()) // 判断是否全部提交
			{
				JOptionPane.showMessageDialog(this, "提交数据成功", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

// Button1——“添加”按钮的的监听器，用来添加商品信息
class AddMerchandise_jButton1_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton1_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

// Button2——“重置”按钮的的监听器，用来清空商品信息
class AddMerchandise_jButton2_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton2_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

// Button3——“删除”按钮的的监听器，用来删除商品信息
class AddMerchandise_jButton3_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton3_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton3_actionPerformed(e);
	}
}

// Button4——“提交”按钮的的监听器，用来将新添加的信息写入数据库
class AddMerchandise_jButton4_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton4_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton4_actionPerformed(e);
	}
}

/*
 * jButton1_actionPerformed()是在对象发生操作时调用的， 每个对象都可以定义一个相应的方法，它们是和监听器配套使用的，
 * 监听器就是监控对象上是否有发生动作，如果有就触发并执行监听器里面的语块
 */

