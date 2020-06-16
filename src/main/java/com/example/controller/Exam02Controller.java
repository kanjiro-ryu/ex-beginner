package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String Index() {
		return "exam02";
		}
	
	
	@RequestMapping("/calc")
	public String form(Integer firstNum, Integer secondNum ) {
		
		int calcAnswer = firstNum + secondNum;
		
		
		session.setAttribute("firstNum", firstNum );
		session.setAttribute("secondNum", secondNum );
		session.setAttribute("calcAnswer", calcAnswer );
		
		return "exam02-result";
	}
	
	
	@RequestMapping("/toPage")
	public String toPage() {
		return "exam02-result2";
	}
	
}
