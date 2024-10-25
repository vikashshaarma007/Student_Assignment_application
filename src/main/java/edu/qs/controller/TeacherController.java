package edu.qs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.qs.model.Teacher;
import edu.qs.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping("/saveTeachers")
	public String saveTeacner(@RequestBody Teacher teacher ) {
		teacherRepository.save(teacher);
		return "Success";
	}
	@GetMapping("/getteacher")
	  public List<Teacher> getAllTeachers() {
	  return teacherRepository.findAll();
	}

}
