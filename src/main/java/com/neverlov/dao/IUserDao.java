package com.neverlov.dao;

import org.apache.ibatis.annotations.Param;

import com.neverlov.entity.User;

public interface IUserDao {
	User getUser(@Param("id") long id);
}
