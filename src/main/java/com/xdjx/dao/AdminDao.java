package com.xdjx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xdjx.bean.Admin;

@Repository
public interface AdminDao {

	/**
	 * Inserts admin 
	 * @return Returns <code>true</code> when insert success
	 * **/
	boolean insertAdmin(Admin admin);
	
	/**
	 * Deletes admin by id
	 * @return Returns <code>true</code> when delete success
	 * **/
	boolean deleteAdminById(Integer adminId);
	
	/**
	 * Updates admin by id
	 * @return Returns <code>true</code> when update success
	 * **/
	boolean updateAdminById(Admin admin);
	
	/**
	 * Gets admin by id
	 * @return Returns <code>null</code> when get failure
	 * **/
	Admin getAdminById(Integer adminId);
	
	
	/**
	 * Lists all admins 
	 * @return Returns <code>null</code> when get failure
	 * **/
	List<Admin> listAllAdmins();
}
