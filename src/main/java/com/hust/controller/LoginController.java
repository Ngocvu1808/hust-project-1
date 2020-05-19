package com.hust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hust.model.Student;
import com.hust.service.StudentService;

@Controller
public class LoginController {

	
	StudentService studentService;
	/*
	 * private static Logger logger= Logger.getLogger(LoginController.class);
	 * 
	 * @RequestMapping("/login") public String login(@RequestParam(name="error")
	 * String error) { logger.error(error); return "students/login"; }
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {

		return "students/home";

	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		request.setAttribute("user", new Student());
		return "students/add";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, @ModelAttribute("user") @Valid Student user,
			BindingResult bindingResult) {
//		userValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()) {
			return "students/add";
		} else {
		studentService.addStudent(user);
		return "students/viewStudent";
	}
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {

		return "students/login";

	}
	
	@RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
	public String viewUser(HttpServletRequest request, @PathVariable(name = "id") int id) {
		request.setAttribute("user", studentService.getStudentById(id));
		return "students/viewStudent";

	}
	
	@RequestMapping(value = "/registered", method = RequestMethod.GET)
	public String registered(HttpServletRequest request) {

		return "students/registered";

	}
	
	
	
	
	

}
