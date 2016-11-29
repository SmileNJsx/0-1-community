package com.neverlov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	@RequestMapping(value="/{userId}")
	@ResponseBody
	public String pepole(@PathVariable String userId) {
		long id = Long.parseLong(userId);
		User user = userService.getUser(id);
		return user.toString();
	} 
	
//	@RequestMapping("/")
//	public ModelAndView response() {
//		return new ModelAndView("index");
//	} 
}
