package com.hust.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hust.model.Student;
@Component
public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Student.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Student u = (Student) target;
		
		if (u.getName()==null|| u.getName().length()==0) {
			errors.rejectValue("name", "field.required");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephonr_number", "field.required");
		
		if (u.getPassword().length()<6||u.getPassword().length()>15) {
			errors.rejectValue("password", "password.invalid");
		}
	}

}
