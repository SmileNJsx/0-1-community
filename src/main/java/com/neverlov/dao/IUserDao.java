package com.neverlov.dao;

import org.apache.ibatis.annotations.Param;

import com.neverlov.entity.User;

public interface IUserDao {
	User getUserById(@Param("id") long id);
	User getUserByUserEmail(@Param("useremail") String useremail);
	User getUserByPhoneNumber(@Param("phonenumber") String phonenumber);
	void insertUser(@Param("user") User user);
}
