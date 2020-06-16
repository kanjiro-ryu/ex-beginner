package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {

	
	@RequestMapping("")
	public String Index() {
		return "exam01";
		}
	
	
	@RequestMapping("/input-form")
	public String form(String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "exam01-result";
	}
}
