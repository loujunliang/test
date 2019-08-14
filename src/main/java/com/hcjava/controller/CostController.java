package com.hcjava.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcjava.entity.Cost;
import com.hcjava.service.CostService;

@Controller
@RequestMapping("/cost")
public class CostController {

	@Resource
	private CostService costService;
	@RequestMapping("/list.do")
	public String list(ModelMap model){
		List<Cost> costs = costService.findAll();
		model.addAttribute("costs", costs);
		return "main/cost";
	}
}
