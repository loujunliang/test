package com.hcjava.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcjava.entity.Mall;
import com.hcjava.service.MallService;

@Controller
@RequestMapping("/mall")
public class MallController {

	@Resource
	private MallService mallService;

	@RequestMapping("/list.do")
	public String showView(ModelMap model){
		List<Mall> list = mallService.showView();
		model.addAttribute("list", list);
		return "mall/list";
	}
}
