package com.cs.from;

import java.util.Vector;

import javax.swing.JTable;

/**
 * 生成表格的Mytable类
 * 将参数obj转换成table表格对象的表头title
 * 功能：实现表格的可伸缩定义，以便后期维护
 * @author Miracle_Wong
 *
 */
public class Mytable {
	public static JTable maketable(Vector obj, Vector title) {
		JTable jTable = new JTable(obj, title);
		return null;
	}
}
