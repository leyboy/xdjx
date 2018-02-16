package com.xdjx.bean;

import org.apache.ibatis.type.Alias;

@Alias("_admin")
public class Admin {

	private Integer id; //admin id
	private String name; //admin name
	private String password; //admin password
	private Boolean delete; //delete status

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Boolean getDelete() {
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", delete=" + delete + "]";
	}
	
}
