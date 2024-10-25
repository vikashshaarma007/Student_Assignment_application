package edu.qs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.qs.model.Student;
import edu.qs.repository.StudentRepository;

@RestController
//@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/saveStudents")
	public String saveStudents(@RequestBody Student student ) {
		studentRepository.save(student);
		return "Success";
	}
	

	@GetMapping("/getallstudent")
	  public List<Student> getAllStudents() {
	  return studentRepository.findAll();
}
}
