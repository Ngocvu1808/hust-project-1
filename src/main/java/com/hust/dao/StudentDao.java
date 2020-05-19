package com.hust.dao;

import java.util.List;

import com.hust.entity.User;

public interface StudentDao {
	public void addStudent(User user);

	public void updateStudent(User user);

	public void deleteStudent(int id);

	public User getStudentById(int id);

	public List<User> getAllUsers();
}
