package com.hust.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hust.dao.StudentDao;
import com.hust.entity.User;


@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void addStudent(User user) {
		sessionFactory.getCurrentSession().save(user);
	
	}

	public void updateStudent(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}

	public void deleteStudent(int id) {
		sessionFactory.getCurrentSession().delete(getStudentById(id));
	}

	public User getStudentById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
			}
			
		


	public List<User> getAllUsers() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		return criteria.list();
	}
	
	
}
