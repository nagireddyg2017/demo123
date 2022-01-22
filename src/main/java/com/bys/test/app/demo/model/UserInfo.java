package com.bys.test.app.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInfo {

	
	@Id
	@GeneratedValue
	private  Long id;
	private String name;
	private String password;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public UserInfo()
	{
		super();
	}
	public UserInfo(Long id,String name,String password,String address)
	{
		this.id=id;
		this.name=name;
		this.password=password;
		this.address=address;
	}

	
}
