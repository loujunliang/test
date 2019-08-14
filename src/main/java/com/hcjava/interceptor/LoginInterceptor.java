package com.hcjava.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hcjava.entity.Admin;

/**
 * ��¼���ص����壺
 * ֻ�е�¼����ܷ����ڲ���Դ������ֱ�ӷ����ڲ���Դ��ǿ�Ƶ�¼
 * ��¼����Ӧ�������س��˵�¼���������е�����
 * �ж���Session���Ƿ���User��������������ͨ�����أ�
 * ���û����ǿ�Ƶ�¼
 * @author huachuang
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	/**
	 * �����������ж��������д
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Admin admin = (Admin) session.getAttribute("admin");
		if(admin == null){
			//����û���Ϣ����session�У�ֱ���ض��򵽵�¼ҳ��
			response.sendRedirect(request.getContextPath()+"/login/toLogin.do");
			return false;
		}
		//����û���Ϣ���ڵĻ�������У����Է����ڲ���Դ
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
