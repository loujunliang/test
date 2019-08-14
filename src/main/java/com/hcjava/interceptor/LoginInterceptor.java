package com.hcjava.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hcjava.entity.Admin;

/**
 * 登录拦截的意义：
 * 只有登录后才能访问内部资源，否则直接访问内部资源会强制登录
 * 登录拦截应该是拦截除了登录请求外所有的请求，
 * 判断其Session中是否有User对象，如果有则可以通过拦截，
 * 如果没有则强制登录
 * @author huachuang
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	/**
	 * 拦截请求做判断在这里编写
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null){
			//如果用户信息不在session中，直接重定向到登录页面
			response.sendRedirect(request.getContextPath()+"/login/toLogin.do");
			return false;
		}
		//如果用户信息存在的话，则放行，可以访问内部资源
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
