package edu.qs.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.model.Teacher;
import edu.qs.repository.TeacherRepository;
import edu.qs.service.TeacherService;

@Service
public class TeacherServiceImpl  implements TeacherService {
	@Autowired
	private TeacherRepository  teacherRepository;
	

	@Override
	public List<Teacher> getAllTeacher() {
		
		return teacherRepository.findAll();
	}


	@Override
	public List<Teacher> saveteacher() {
		// TODO Auto-generated method stub
		return teacherRepository.save(null);
	}
	
	

}
