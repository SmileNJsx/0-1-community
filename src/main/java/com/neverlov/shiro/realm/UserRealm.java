package com.neverlov.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.neverlov.entity.User;
import com.neverlov.service.Impl.UserServiceImpl;

public class UserRealm extends AuthorizingRealm{

	@Autowired
	private UserServiceImpl userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		long userId = Long.parseLong(String.valueOf(token.getPrincipal()));
		String password = String.valueOf((char[]) token.getCredentials());
		
		User user = userService.getUserById(userId);
				
		if(user.getPassword().equals(password)) {
			return new SimpleAuthenticationInfo(userId,password,getName());
		} else {
			return null;
		}
	}
}
