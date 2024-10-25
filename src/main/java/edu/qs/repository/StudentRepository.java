package edu.qs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.qs.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	 

}
