package com.zmk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zmk.bean.Categ;
import com.zmk.service.BlogService;

@Controller
public class BlogController {
	@Resource
	private BlogService blogService;
	
	
	@RequestMapping("clist")
	public String selc(Model model) {
		List<Categ> list = blogService.selc();
		model.addAttribute("list",list);
		return "clist";
	}
}
