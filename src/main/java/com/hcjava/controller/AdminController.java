package com.hcjava.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcjava.entity.Admin;
import com.hcjava.exception.NameException;
import com.hcjava.exception.PasswordException;
import com.hcjava.service.AdminService;

@Controller
@RequestMapping("/login")
public class AdminController {

	@ExceptionHandler
	public String handlerException(HttpServletRequest req, HttpServletResponse resp, Exception e) throws Exception {
		if (e instanceof NameException || e instanceof PasswordException) {
			// 业务逻辑自己处理
			req.setAttribute("message", e.getMessage());
			req.setAttribute("name", req.getParameter("name"));
			req.setAttribute("password", req.getParameter("password"));
			return "main/login";
		} else {
			// 系统异常抛出，交给Spring容器处理
			throw e;
		}
	}

	@Resource
	private AdminService adminService;

	// 通过发送请求跳转到登录页面
	@RequestMapping("/toLogin.do")
	public String tologin() {
		return "main/login";
	}

	// 通过请求到主页面
	@RequestMapping("/toIndex.do")
	public String toIndex() {
		return "main/index";
	}

	// 登录检查
	@RequestMapping("/checkLogin.do")
	public String checkLogin(String name, String password, ModelMap model, HttpSession session) {
		/*
		 * try { 
		 * 		Admin admin = adminService.checkNamePwd(name, password);
		 * 		session.setAttribute("admin", admin); 
		 * } catch (NameException e) {
		 * 		model.addAttribute("message", e.getMessage());
		 * 		model.addAttribute("name", name); 
		 * 		model.addAttribute("password",password); 
		 * 		return "main/login"; 
		 * } catch (PasswordException e) {
		 * 		model.addAttribute("message", e.getMessage());
		 *		model.addAttribute("name", name); 
		 *		model.addAttribute("password",
		 * 		password); return "main/login"; 
		 * }
		 */
		
		/*
		 * 测试系统异常捕获 String a = null; a.charAt(0);
		 */
		
		Admin admin = adminService.checkNamePwd(name, password);
		session.setAttribute("admin", admin);
		// 成功登录
		System.out.println();
		return "redirect:../cost/list.do1111111111";
	}
}
