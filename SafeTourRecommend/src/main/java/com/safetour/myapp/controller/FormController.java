package com.safetour.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Form")
public class FormController {
	private static final Logger logger = LoggerFactory.getLogger(FormController.class);
	
	@RequestMapping("/")
	public String send() {
		return "Form/Label";
	}
	
	@RequestMapping("/Theme")
	public ModelAndView ThemeInsert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String Senstence =request.getParameter("Sentence");
		String gender = request.getParameter("Gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String partner = request.getParameter("partner");
		String address = request.getParameter("address");
		
		
		return null;
		
	}
	
	@RequestMapping("/Label")
	public ModelAndView LabelInsert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String[] Label = request.getParameterValues("Label");
		
		return null;
	}
	
	@RequestMapping("/")
	public ModelAndView tourRead(HttpServletRequest request, HttpServletResponse response) throws Exception{
		return null;
	}
	@RequestMapping("/")
	public ModelAndView 
}
