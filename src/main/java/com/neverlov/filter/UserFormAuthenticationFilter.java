package com.neverlov.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class UserFormAuthenticationFilter extends FormAuthenticationFilter{
	public UserFormAuthenticationFilter() {
		// TODO Auto-generated constructor stub
		System.out.println("UserFormAuthenticationFilter !");
	}
}
