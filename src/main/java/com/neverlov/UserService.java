package com.neverlov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User getUser(long id) {
		return userDao.getUser(id);
	}
}
