package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.bean.Employee;
import com.dbconnection.Dbconnection;

public class EmployeeDao {
public int Registration(Employee employee) {
	int insert=0;
	try {
		
		Connection con=null;
		con=Dbconnection.get_connConnection();
		PreparedStatement ps=con.prepareStatement("insert into Registration values(?,?,?,?,?,?)");
		ps.setInt(1,0);
		ps.setString(2,employee.getUsername());
		ps.setString(3,employee.getPassword());
		ps.setString(4,employee.getAddress());
		ps.setString(5,employee.getEmail());
		ps.setString(6,employee.getDob());
		insert = ps.executeUpdate();
	} catch (Exception e) {
	e.printStackTrace();
	}
	return insert;
}
public Employee checklogin(Employee employee) {
	try {
		Connection con=null;
		con=Dbconnection.get_connConnection();
		PreparedStatement ps=con.prepareStatement("select * from Registration where username=? and password=?");
		ps.setString(1,employee.getUsername());
		ps.setString(2,employee.getPassword());
		ResultSet resultSet=ps.executeQuery();
		if(resultSet.next()) {
			employee.setId(resultSet.getInt("id"));
			employee.setUsername(resultSet.getString("username"));
			employee.setPassword(resultSet.getString("password"));
			employee.setAddress(resultSet.getString("address"));
			employee.setEmail(resultSet.getString("email"));
			employee.setDob(resultSet.getString("dob"));
		}
		else {
			employee=null;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return employee;
}
}
