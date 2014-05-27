package com.cs.base;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Business {
	private static final String DRIVER = "com.mysql.jdbc.Driver";		//驱动固定代码

	private static final String URL = "jdbc:mysql://localhost:3306/cs";	//URL

	private static final String user  = "root";							//用户名
	private static final String password = "wr";						//密码
	//连接数据库的函数
	public static Connection getConnection() {
		java.sql.Connection conn = null;
		try {
			Class.forName(DRIVER);									//加载驱动
			System.out.println("加载驱动成功");			
			conn = DriverManager.getConnection(URL,user,password);	//建立连接
			System.out.println("建立连接成功");
		} catch (SQLException e) {									
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
		return conn;			//连接对象返回
	}
}
