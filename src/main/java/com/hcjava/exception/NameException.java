package com.hcjava.exception;
/**
 * 自定义账号和密码的异常
 * @author huachuang
 *
 */
public class NameException extends RuntimeException {

	public NameException(String message) {
		super(message);
	}
}
