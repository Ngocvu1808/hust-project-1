package com.hust.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hust.model.Student;
import com.hust.service.StudentService;
import com.hust.validator.UserValidator;
import com.hust.model.Student;
import com.hust.entity.User;

@Controller
@RequestMapping("/admin")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	UserValidator userValidator;

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/list-student", method = RequestMethod.GET)
	public String getAllUser(HttpServletRequest request) {
		logger.info("Student Info");
		List<Student> users = studentService.getAllUsers();
		request.setAttribute("users", users);
		return "admin/listStudents";

	}

	@RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
	public String viewUser(HttpServletRequest request, @PathVariable(name = "id") int id) {
		request.setAttribute("user", studentService.getStudentById(id));
		return "admin/viewStudent";

	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		request.setAttribute("user", new Student());
		return "admin/add";

	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, @ModelAttribute("user") @Valid Student user,
			BindingResult bindingResult) {
//		userValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()) {
			return "admin/add";
		} else {
		studentService.addStudent(user);
		return "admin/viewStudent";
	}
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteUser(HttpServletRequest request, @PathVariable(name = "id") int id) {

		studentService.deleteStudent(id);
		return "admin/listStudents";

	}

	@RequestMapping(value = "/edit/{userId}", method = RequestMethod.GET)
	public String editUser(HttpServletRequest request, @PathVariable(name = "userId") int id) {

		request.setAttribute("user", studentService.getStudentById(id));
		return "admin/editStudent";

	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editUser(HttpServletRequest request, @ModelAttribute("user") @Valid Student user,
			BindingResult bindingResult) {
//		userValidator.validate(user, bindingResult);
//		if (bindingResult.hasErrors()) {
//			return "admin/editStudent";
//		} else {
		studentService.updateStudent(user);
		return "admin/viewStudent";
		}
//	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {

		return "index";

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(HttpServletRequest request) {
		request.setAttribute("user", new Student());
		return "students/register";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, @ModelAttribute("user") Student user,
			BindingResult bindingResult) {
		userValidator.validate(user, bindingResult);
//		if (bindingResult.hasErrors()) {
//			return "students/add";
//		} else {
		studentService.addStudent(user);
		return "registered";
	}
//	}

	@RequestMapping(value = "/registered", method = RequestMethod.GET)
	public String registered(HttpServletRequest request) {

		return "students/a";

	}
}
