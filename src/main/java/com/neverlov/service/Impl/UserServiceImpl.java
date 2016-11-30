package com.neverlov.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neverlov.dao.IUserDao;
import com.neverlov.entity.User;
import com.neverlov.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

}
