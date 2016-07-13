package com.yao.bean;

import java.io.Serializable;

public class TestBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3359642359491101862L;

	private String username;
	
	private String password;

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
	
	public void print() {
		TestBean tb = new TestBean();
		System.out.println(tb);
	}
	
}
