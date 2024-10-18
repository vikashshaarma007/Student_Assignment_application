package edu.qs.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.qs.model.Assignment;
@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	

}
