package com.cs.main;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.cs.base.Business;
import com.cs.from.AddGoods;
import com.cs.from.login;

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
		Dimension scSize = Toolkit.getDefaultToolkit().getScreenSize();	
		Dimension fSize = frame.getSize();				//获得窗口的大小
		
		if (fSize.height > scSize.height) {
			fSize.height = scSize.height;
		}
		if (fSize.width > scSize.width) {
			fSize.width = scSize.width;
		}
		
		frame.setLocation((scSize.width - fSize.width)/2, (scSize.height - fSize.height)/2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main main = new Main();
/*		login login1 = new login();*/
		AddGoods addGoods = new AddGoods();
/*		Business business = new Business();
		business.getConnection();*/
	}

}
