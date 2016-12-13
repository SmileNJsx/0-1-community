package com.neverlov.control;


import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControl {
	
    @RequestMapping("/")
    public String hello() {
		// TODO Auto-generated method stub
		return "login";
	}

    @RequestMapping(value="/login.do")
//    @ResponseBody
	public String userinfo(HttpServletRequest request) {
		// TODO Auto-generated method stub
    	
    	String userId = request.getParameter("box_name");
    	String password = request.getParameter("box_pass");
    	System.out.println(userId);
    	UsernamePasswordToken token = new UsernamePasswordToken(userId, password);
    	token.setRememberMe(true);
    	Subject subject = SecurityUtils.getSubject();
    	subject.login(token);
    	Session session = subject.getSession();
    	//TODO filter also do this, how to use shiro as a  filter
    	
    	if(subject.isAuthenticated()) {
    		session.setAttribute(userId,password);
    		return "index";
    	} else {
    		return "register";
    	}
	}
    
}
