package com.udesk.service;

import java.util.List;

import com.udesk.dao.UserDao;
import com.udesk.entity.User;

public interface UserService{
	
	public List<User> findAll();
	
	public User findOne(Integer id);
	
	public Integer createUser(User user);
	
	public Integer saveUser(User user);

	public Integer deleteUser(Integer id);
	
}
