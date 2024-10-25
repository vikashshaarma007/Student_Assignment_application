package edu.qs.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.qs.model.Assignment;
import edu.qs.model.AssignmentStateEnum;
import edu.qs.model.GradeEnum;
import edu.qs.repository.AssignmentRepository;
import edu.qs.service.AssignmentService;

@Service
public class AssignmentServiceImpl implements AssignmentService {
	
	 @Autowired
	    private AssignmentRepository assignmentRepository;
	 
	 

	@Override
	public List<Assignment> getAllAssignment() {
		
		return  assignmentRepository.findAll();
	}



	@Override
	public List<Assignment> saveAssignment() {
		// TODO Auto-generated method stub
		return assignmentRepository.save(null);
	}
	 
	 

	/*
	 @Override
    public Assignment upsertAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

	@Override
    public Assignment submitAssignment(Long id, Long teacherId, Long studentId) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No assignment with this id was found"));
        
        if (!assignment.getStudentId().equals(studentId)) {
            throw new RuntimeException("This assignment belongs to some other student");
        }
        if (assignment.getContent() == null) {
            throw new RuntimeException("Assignment with empty content cannot be submitted");
        }

        assignment.setTeacherId(teacherId);
        return assignmentRepository.save(assignment);
    }

	 @Override
    public Assignment markGrade(Long id, GradeEnum grade) {
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No assignment with this id was found"));

        if (grade == null) {
            throw new RuntimeException("Assignment with empty grade cannot be graded");
        }

        assignment.setGrade(grade);
        assignment.setState(AssignmentStateEnum.GRADED);
        return assignmentRepository.save(assignment);
    }
	 */




	    

	

}
