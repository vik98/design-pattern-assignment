package com.greatlearning.dp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {
	private static JDBCSingleton instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/CRUD?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	private String dbuser = "root";
	private String dbpassword = "root";
	
	private JDBCSingleton() throws SQLException{
		try {
            Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, dbuser, dbpassword);
		} catch (ClassNotFoundException ex) {
			System.out.println("Class not found exception : " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
	    return connection;
	}
	
	public static JDBCSingleton getInstance() throws SQLException {
		if (instance == null || instance.getConnection().isClosed()) {
			instance = new JDBCSingleton();
		}
		return instance;
	}
	
}
