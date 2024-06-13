package com.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="zp_Login")
public class login {
	@Id
    
	@Column(length = 15)
	private String username;
	@Column(length=20)
	private String password;
	@Column(length=20)
	private String role;
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "login [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
