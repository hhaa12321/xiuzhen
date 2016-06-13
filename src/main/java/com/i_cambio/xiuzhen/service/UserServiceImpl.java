package com.i_cambio.xiuzhen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i_cambio.xiuzhen.dao.UserMapper;
import com.i_cambio.xiuzhen.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User save(User user) {
		user.setCreateDate(System.currentTimeMillis());
		user.setUpdateDate(System.currentTimeMillis());
//		user.setId(id);
		return user;
	}

	public User update(User user) {
		user.setUpdateDate(System.currentTimeMillis());
		userMapper.updateByPrimaryKey(user);
		return user;
	}

	public void delete(Long id) {
		userMapper.deleteByPrimaryKey(id);
	}

	public User findById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
