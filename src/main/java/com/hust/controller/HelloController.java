package com.hust.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.hust.model.Student;
import com.hust.validator.UserValidator;

@Controller
@RequestMapping
public class HelloController {

	@Autowired
	private UserValidator userValidator;

	@RequestMapping("/hello1")
	public ModelAndView sayHello(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@RequestParam(name = "user", required = true) String username,
			@RequestHeader(name = "content-type", required = false) String contentType) {

		request.setAttribute("msg", contentType);

		return new ModelAndView("hello");
	}

	@RequestMapping("/hello/{name}")
	public String hello(HttpServletRequest request, 
			@PathVariable(name = "name") String name) {
		request.setAttribute("msg", name);

		return "hello";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request) {
		Student user = new Student();
		// user.setName("Vu");
		request.setAttribute("user", user);

		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String viewUser(HttpServletRequest request, @ModelAttribute("user") Student user, BindingResult bindingResult) {
		userValidator.validate(user, bindingResult);
		if (bindingResult.hasErrors()) {
			request.setAttribute("user", user);

			return "addUser";
		}
		request.setAttribute("user", user);

		return "viewUser";
	}

//	@RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
//	public String uploadFile(HttpServletRequest request) {
//		return "upload";
//	}

//	@RequestMapping(value = "/upload", method = RequestMethod.POST)
//	public String uploadFile(HttpServletRequest request, @RequestParam(name = "file") MultipartFile file) {
//		// file.getOriginalFilename()
//		// luu file xuong o cung
//		try {
//			File newFile = new File("G:\\Hoc tap" + file.getOriginalFilename());
//			FileOutputStream fileOutputStream;
//
//			fileOutputStream = new FileOutputStream(newFile);
//
//			fileOutputStream.write(file.getBytes());
//			fileOutputStream.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		request.setAttribute("file", file);
//		return "viewFile";
//	}
	
	@RequestMapping(value = "/downloadFile", method = RequestMethod.GET)
	public void downloadFile(HttpServletRequest request, HttpServletResponse response) {
		String dataDirectory = "G:\\Hoc tap\\PR1\\image";
		Path file = Paths.get(dataDirectory, "1.jpg");
		if(Files.exists(file)) {
			response.setContentType("image/jpg");
			response.addHeader("Content-Disposition", "attachment; filename = a.jpg");
			try {
				Files.copy(file, response.getOutputStream());
			
			response.getOutputStream().flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		
		return "index";
	}
	

}
