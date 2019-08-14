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
			// ҵ���߼��Լ�����
			req.setAttribute("message", e.getMessage());
			req.setAttribute("name", req.getParameter("name"));
			req.setAttribute("password", req.getParameter("password"));
			return "main/login";
		} else {
			// ϵͳ�쳣�׳�������Spring��������
			throw e;
		}
	}

	@Resource
	private AdminService adminService;

	// ͨ������������ת����¼ҳ��
	@RequestMapping("/toLogin.do")
	public String tologin() {
		return "main/login";
	}

	// ͨ��������ҳ��
	@RequestMapping("/toIndex.do")
	public String toIndex() {
		return "main/index";
	}

	// ��¼���
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
		 * ����ϵͳ�쳣���� String a = null; a.charAt(0);
		 */
		
		Admin admin = adminService.checkNamePwd(name, password);
		session.setAttribute("admin", admin);
		// �ɹ���¼
		System.out.println();
		return "redirect:../cost/list.do1111111111";
	}
}
