package com.i_cambio.xiuzhen.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.i_cambio.xiuzhen.model.User;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})  
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testSave() throws Exception {
		User user = new User();
		user = userService.save(user );
		System.out.println(user.getId());
	}

	@Test
	public void testUpdate() throws Exception {
	}

	@Test
	public void testDelete() throws Exception {
	}

	@Test
	public void testFindById() throws Exception {
	}

}
