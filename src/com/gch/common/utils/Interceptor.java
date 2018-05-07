package com.gch.common.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg0) throws Exception {
		HttpSession session=request.getSession();
		Object icman = session.getAttribute("icman");
		Object icTeacher = session.getAttribute("icTeacher");
		Object icStudent = session.getAttribute("icStudent");
		if (icman != null || icTeacher !=null || icStudent !=null) {
			// 如果不为空则放行
			return true;
		} else {
			// 如果为空则跳转到登录页面
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		
		return false;
	}

	}


