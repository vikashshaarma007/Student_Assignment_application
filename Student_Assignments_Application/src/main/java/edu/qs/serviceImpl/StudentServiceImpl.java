package edu.qs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.model.Student;
import edu.qs.repository.StudentRepository;
import edu.qs.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
	}

	@Override
	public List<Student> saveStudent() {
		// TODO Auto-generated method stub
		return studentRepository.save(null);
	}

}
