package com.hust.service;

import java.util.List;

import com.hust.model.Student;

public interface StudentService {

	public void addStudent(Student u);

	public void updateStudent(Student u);

	public void deleteStudent(int id);

	public Student getStudentById(int id);

	public List<Student> getAllUsers();
}
