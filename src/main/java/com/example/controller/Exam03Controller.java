package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String Index() {
		return "exam03";
	}

	@RequestMapping("/calcGoods")
	public String calcGoods(Integer goods1, Integer goods2, Integer goods3) {
		
		int total = goods1 + goods2 + goods3;
		int totalInclude = (int) (total * 1.10);
		
		
		application.setAttribute("total", total);
		application.setAttribute("totalInclude", totalInclude);
		
		return "exam03-result";
	}

}
