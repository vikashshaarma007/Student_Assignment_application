package edu.qs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.qs.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	

}
