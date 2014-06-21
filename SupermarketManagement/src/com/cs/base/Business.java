package com.cs.base;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * 添加类Business
 * 用于实现数据库的连接
 * @author MiracleWong
 *
 */
public class Business {
	private static final String DRIVER = "com.mysql.jdbc.Driver";		//驱动固定代码

	private static final String URL = "jdbc:mysql://localhost:3306/cs";	//URL

	private static final String user  = "root";							//用户名
	private static final String password = "123456";					//密码
	//连接数据库的函数
	public static Connection getConnection() {							//开始连接数据库
		java.sql.Connection conn = null;
		try {
			Class.forName(DRIVER);										//加载驱动
			System.out.println("加载驱动成功");			
			conn = DriverManager.getConnection(URL,user,password);		//建立连接
			System.out.println("建立连接成功");
		} catch (SQLException e) {										//检查是否有异常
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
