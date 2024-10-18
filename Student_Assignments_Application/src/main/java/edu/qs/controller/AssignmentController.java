package edu.qs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.model.Assignment;
import edu.qs.model.GradeEnum;
import edu.qs.repository.AssignmentRepository;
import edu.qs.service.AssignmentService;

@RestController
//@RequestMapping("/assignment")
public class AssignmentController {
	
	@Autowired
    private AssignmentService assignmentService;
	
	@Autowired
	private AssignmentRepository assignmentRepository;
	
	@PostMapping("/saveAssignment")
	public String saveAssignment(@RequestBody Assignment assignment) {
		assignmentRepository.save(assignment);
		return "success";
		
	}
	 @GetMapping("/getAssignment")
	  public List<Assignment> getAllAssignments() {
	  return assignmentRepository.findAll();
	 }
	
	
/*
    @PostMapping
    public Assignment upsertAssignment(@RequestBody Assignment assignment) {
        return assignmentService.upsertAssignment(assignment);
    }

    @PostMapping("/{id}/submit")
    public Assignment submit(@PathVariable Long id, @RequestParam Long teacherId, @RequestParam Long studentId) {
        return assignmentService.submitAssignment(id, teacherId, studentId);
    }

    @PostMapping("/{id}/grade")
    public Assignment markGrade(@PathVariable Long id, @RequestParam GradeEnum grade) {
        return assignmentService.markGrade(id, grade);
    }

    @GetMapping("/student/{studentId}")
    public List<Assignment> getAssignmentsByStudent(@PathVariable Long studentId) {
        return assignmentService.getAssignmentsByStudent(studentId);
    }*/
}


