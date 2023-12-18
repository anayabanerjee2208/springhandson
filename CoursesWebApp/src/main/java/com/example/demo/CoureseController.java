package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CoureseController {
	
	@RequestMapping("/course")
	//@ResponseBody
	public ModelAndView Course(@RequestParam("courseName")String cname) {
		System.out.println("Welcome to Course" + cname);	
		//session.setAttribute("cname", cname);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", cname);
		mv.setViewName("Courses");
		return mv;
	}

}
