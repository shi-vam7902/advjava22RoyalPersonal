package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection()  {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/Advancejava22";
		String userName = "root";
		String password = "root";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName,password);
			System.out.println("Data Base Connection Established "); 
			return con;	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}
	
	
}
