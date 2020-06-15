package com.udesk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udesk.dao.UserDao;
import com.udesk.entity.User;
import com.udesk.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public List<User> findAll() {
		List<User> userList = userDao.findAll();
		return userList;
	}

	public Integer createUser(User user) {
		Integer rows = userDao.createUser(user);
		return rows;
	}

	public User findOne(Integer id) {
		User user = userDao.findOne(id);
		return user;
	}

	public Integer saveUser(User user) {
		Integer user_id = user.getId();
		if (user_id == null){
			return 0;
		}
		
		Integer rows = userDao.updateUser(user);
		return rows;
	}

	public Integer deleteUser(Integer id) {
		Integer rows = userDao.deleteUser(id);
		return rows;
	}
}
