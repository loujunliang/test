package com.hcjava.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcjava.dao.CostDao;
import com.hcjava.entity.Cost;

@Service
public class CostServiceImpl implements CostService {

	@Resource
	private CostDao costDao;

	public List<Cost> findAll() {
		List<Cost> list = new ArrayList<Cost>();
		for (Cost cost : costDao.findAll()) {
			list.add(cost);
		}
		return list;
	}

}
