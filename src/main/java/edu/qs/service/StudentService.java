package edu.qs.service;

import java.util.List;


import edu.qs.model.Student;

public interface StudentService  {
	public List<Student> findAll();
	 List<Student> saveStudent();

}
