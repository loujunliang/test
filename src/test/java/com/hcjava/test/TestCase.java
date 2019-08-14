package com.hcjava.test;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {

	// ≤‚ ‘¡¥Ω” ˝æ›ø‚
	@SuppressWarnings("resource")
	@Test
	public void testConn() throws Exception {
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		BasicDataSource bean = ac.getBean("dataSource", BasicDataSource.class);
		Connection conn = bean.getConnection();
		System.out.println(conn);
	}
	
}
