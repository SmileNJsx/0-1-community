package com.neverlov.util;

import javax.servlet.http.HttpServletRequest;

public class CommonUtilAjax {
	public static boolean userAjax(HttpServletRequest request) {
		return "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"));
    }

	
	
	
	
}
