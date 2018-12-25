package com.rest.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class UserRegistration {

	@Id
	@GeneratedValue
	@Column(name="R_ID")
	private Integer registationId;
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	@Column(name="password")
	private String pwd;
	
	@Column(name="cpassword")
	private String cpwd;
	
	@Column(name="role")
	private String role;

	public Integer getRegistationId() {
		return registationId;
	}

	public void setRegistationId(Integer registationId) {
		this.registationId = registationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
