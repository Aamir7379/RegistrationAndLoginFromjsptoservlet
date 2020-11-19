package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
public static Connection get_connConnection() {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return con;
	
}
}
