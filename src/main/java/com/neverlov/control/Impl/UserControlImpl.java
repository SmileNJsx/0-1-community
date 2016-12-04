package com.neverlov.control.Impl;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neverlov.control.IUserControl;

@Controller
public class UserControlImpl implements IUserControl{
	
    @RequestMapping("/")
    public String hello() {
		// TODO Auto-generated method stub
		return "index";
	}

    @RequestMapping(value="/{userId}/{password}")
    @ResponseBody
	public String userinfo(@PathVariable String userId, @PathVariable String password) {
		// TODO Auto-generated method stub
    	UsernamePasswordToken token = new UsernamePasswordToken(userId, password);
    	token.setRememberMe(true);
    	System.out.println(String.valueOf("hi"+token.getCredentials()));
    	
    	Subject subject = SecurityUtils.getSubject();
    	subject.login(token);
    	
    	if(subject.isAuthenticated()) {
    		return "index";
    	} else {
    		return "none";
    	}
    	
	}

	public String userinfo(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
