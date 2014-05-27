package com.cs.main;

import com.cs.base.Business;

public class Main {
	boolean packFrame = false;
	//构造函数
	public Main() {
		// TODO Auto-generated constructor stub
		MainFrame frame = new MainFrame();
		if (packFrame) {
			frame.pack();		//让窗口显示合适的大小
		} else {
			frame.validate();	//刷新窗体组件的信息
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business business = new Business();
		business.getConnection();
	}

}
