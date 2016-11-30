package com.neverlov.control.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neverlov.control.IUserControl;
import com.neverlov.entity.User;
import com.neverlov.service.Impl.UserServiceImpl;

@Controller
public class UserControlImpl implements IUserControl{

	@Autowired
    private UserServiceImpl userService;
	
    @RequestMapping("/")
    public String hello() {
		// TODO Auto-generated method stub
		return "index";
	}

    @RequestMapping(value="/{userId}")
    @ResponseBody
	public String userinfo(@PathVariable String userId) {
		// TODO Auto-generated method stub
    	long id = Long.parseLong(userId);
    	User user = userService.getUser(id);
		return user.toString();
	}
    
}
