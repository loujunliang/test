package com.hcjava.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcjava.dao.AdminDao;
import com.hcjava.entity.Admin;
import com.hcjava.exception.NameException;
import com.hcjava.exception.PasswordException;

@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;

	public Admin checkNamePwd(String name, String password) throws NameException, PasswordException {
		Admin admin = adminDao.findByName(name);
		if (admin == null) {
			throw new NameException("’À∫≈≤ª¥Ê‘⁄");
		} else if (!admin.getPassword().equals(password)) {
			throw new PasswordException("√‹¬Î¥ÌŒÛ");
		} else {
			return admin;
		}
	}

}
