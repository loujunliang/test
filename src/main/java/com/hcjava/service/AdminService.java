package com.hcjava.service;

import com.hcjava.entity.Admin;
import com.hcjava.exception.NameException;
import com.hcjava.exception.PasswordException;

public interface AdminService {

	//��¼���
	public Admin checkNamePwd(String name,String password) throws NameException, PasswordException;
	
}
