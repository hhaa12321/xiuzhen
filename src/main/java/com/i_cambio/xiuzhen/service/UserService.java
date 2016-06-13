package com.i_cambio.xiuzhen.service;

import com.i_cambio.xiuzhen.model.User;

public interface UserService {

	User save(User user);
	
	User update(User user);
	
	void delete(Long id);
	
	User findById(Long id);
}
