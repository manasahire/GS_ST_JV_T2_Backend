package com.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Service;



@Service
public class loginServiceImpl implements loginService {
	
	Connection connection;
	int flag = 0;
	
	public loginServiceImpl() throws SQLException {
		connection = com.DBUtil.DBUtil.getConnection();
	}
	
	public int loginValidation(String username, String password,String role) {
		try {
		PreparedStatement statement = connection.prepareStatement("select * from zp_login where username = '"+username+"', password = '"+password+"', role = '"+role+"'");
		ResultSet rs = statement.executeQuery();
			
		while(rs.next()) {
			if(rs.getString(1).equals(username) && rs.getString(2).equals(password) && rs.getString(3).equals(role)) {
				flag = 1;
			}else {
				System.out.println("Invalid Username/Password/Role");
				flag = 0;
			}
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
