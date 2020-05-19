package com.hust.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hust.dao.StudentDao;
import com.hust.entity.User;
import com.hust.model.Student;
import com.hust.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	

	public void addStudent(Student student) {
		User user = new User();
		user.setTen(student.getName());
		user.setSo_DT(student.getTelephonr_number());
		user.setDate_of_birth(student.getDateOfBirth());
		user.setEmailAddress(student.getEmail());
		user.setGender(student.getGender());
		user.setUsername(student.getUsername());
		user.setPassword(student.getPassword());
		
		
		studentDao.addStudent(user);
		
		
	}

	public void updateStudent(Student student) {
		User user = studentDao.getStudentById(student.getId());
		if(user!=null) {
			user.setTen(student.getName());
			user.setSo_DT(student.getTelephonr_number());
			user.setDate_of_birth(student.getDateOfBirth());
			user.setEmailAddress(student.getEmail());
			user.setGender(student.getGender());
		
			studentDao.updateStudent(user);
		}
	}

	public void deleteStudent(int id) {
		User user = studentDao.getStudentById(id);
		if(user!=null) {
		studentDao.deleteStudent(id);
		}
	}

	public Student getStudentById(int id) {
		User user = studentDao.getStudentById(id);
		
		Student student = new Student();
		student.setId(user.getId());
		student.setName(user.getTen());
		student.setTelephonr_number(user.getSo_DT());
		student.setDateOfBirth(user.getDate_of_birth());
		student.setEmail(user.getEmailAddress());
		student.setGender(user.getGender());
		
		
		
		return student;
		
	}

	public List<Student> getAllUsers() {
		List<User> users = studentDao.getAllUsers();
		List<Student> students = new ArrayList<Student>();
		for(User user: users) {
			Student student = new Student();
			student.setId(user.getId());
			student.setName(user.getTen());
			student.setTelephonr_number(user.getSo_DT());
			student.setDateOfBirth(user.getDate_of_birth());
			student.setEmail(user.getEmailAddress());
			student.setGender(user.getGender());
			
			students.add(student);
		}
		
		return students;
	}
	
}
