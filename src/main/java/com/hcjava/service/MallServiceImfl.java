package com.hcjava.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcjava.dao.MallDao;
import com.hcjava.entity.Mall;

@Service
public class MallServiceImfl implements MallService {

	@Resource
	private MallDao mallDao;

	public List<Mall> showView() {
		List<Mall> list = new ArrayList<Mall>();
		for (Mall mall : mallDao.findAll()) {
			list.add(mall);
		}
		return list;
	}

}
