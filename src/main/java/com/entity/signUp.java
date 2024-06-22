package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="signupDB")
public class signUp {
	@Id
	private String empId;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String username;
	@Column(length=50)
	private String password;
	@Column(length=50)
	private String role;
	@Column(length=50)
	private String email;
	@Column(length=20)
	private String mobileNo;


}
