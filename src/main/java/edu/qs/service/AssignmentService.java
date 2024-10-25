package edu.qs.service;

import java.util.List;


import edu.qs.model.Assignment;
import edu.qs.model.GradeEnum;

public interface AssignmentService {
	List<Assignment> getAllAssignment();
	List<Assignment> saveAssignment();
	
	//List<Assignment> findByStudentId(Long studentId);
    //List<Assignment> findByTeacherId(Long teacherId);
	//Assignment upsertAssignment(Assignment assignment);
	/*
	Assignment submitAssignment(Long id, Long teacherId, Long studentId);
	Assignment markGrade(Long id, GradeEnum grade);
	List<Assignment> getAssignmentsByStudent(Long studentId);
	List<Assignment> getAssignmentsByTeacher(Long teacherId);
	
	*/

	
   

}
