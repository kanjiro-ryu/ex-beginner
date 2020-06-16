package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm( ) {
		return new UserForm();
	}
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/input-form")
	public String InputForm(@Validated UserForm userForm , BindingResult result, Model model ) {
		
		
		if (result.hasErrors()) {
			return index();
		}
		
		session.setAttribute("user", userForm);
		
		return "exam04-result";
	}
	
	

}
