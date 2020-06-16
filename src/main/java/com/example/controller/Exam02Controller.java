package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

	@RequestMapping("")
	public String Index() {
		return "exam02";
		}
	
	
	@RequestMapping("/calc")
	public String form(String firstNum, String secondNum, Model model) {
		int  firstNumInt = Integer.parseInt(firstNum);
		int  secondNumInt = Integer.parseInt(secondNum);
		
		int calcAnswer = firstNumInt + secondNumInt;
		
		model.addAttribute("firstNum", firstNumInt );
		model.addAttribute("secondNum", firstNumInt );
		model.addAttribute("calcAnswer", calcAnswer );
		
		return "exam01-result";
	}
	
}
