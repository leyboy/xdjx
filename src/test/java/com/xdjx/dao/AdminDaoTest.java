package com.xdjx.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xdjx.bean.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class AdminDaoTest {

	@Autowired
	AdminDao adminDao;
	
	@Test
	public void testGetAdminById(){
		System.out.println(adminDao.getAdminById(4));
	}
	
	@Test
	public void testInsertAdmin(){
		Admin admin=new Admin("寇奇", "kouqi");
		adminDao.insertAdmin(admin);
		System.out.println(adminDao.getAdminById(3));
	}
	
	
	@Test
	public void testListAllAdmins(){
		List<Admin> admins=adminDao.listAllAdmins();
		for (Admin admin : admins) {
			System.out.println(admin);
		}
	}
	
	
	@Test
	public void testDeleteAdminById(){
		adminDao.deleteAdminById(3);
		testListAllAdmins();
	}
	
	
	@Test
	public void testUpdateAdminById(){
		Admin admin=getAdminById(1);
		admin.setPassword("liu123456789");
		adminDao.updateAdminById(admin);
		System.out.println(getAdminById(1));
	}
	
	
	protected Admin getAdminById(int adminId) {
		return adminDao.getAdminById(adminId);
	}
}
