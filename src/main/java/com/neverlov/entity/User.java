package com.neverlov.entity;

import java.sql.Timestamp;

public class User {
	
	private static final long serialVersionUID = 1486527381274204384L;
	
	private long id;
	private String username;
	private String password;
	private Timestamp add_time;
	private Timestamp modify_time;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
	
	public Timestamp getAdd_time() {
		return add_time;
	}
	
	public void setAdd_time(Timestamp add_time) {
		this.add_time = add_time;
	}
	
	public Timestamp getModify_time() {
		return modify_time;
	}
	
	public void setModify_time(Timestamp modify_time) {
		this.modify_time = modify_time;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserId :" + this.getId() + "UserName :" +this.getUsername();
	}
}
