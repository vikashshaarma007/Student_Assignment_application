package edu.qs.model;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_id_seq")
    @SequenceGenerator(name = "students_id_seq", sequenceName = "students_id_seq", allocationSize = 1)
    private Long id;

    

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
    
    /*@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
  		  CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name = "STUDENT_ASSIGNMENT_APPLICATION",joinColumns = @JoinColumn(name ="student_id"),
    inverseJoinColumns =  @JoinColumn(name ="assignment_id"))
    private List<Assignment> assignment;*/
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
    private List<Assignment> assignment;

    

	
	

	public List<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(List<Assignment> assignment) {
		this.assignment = assignment;
	}

	// Default constructor
    public Student() {
        this.createdAt = OffsetDateTime.now(); // Assuming UTC is the desired timezone
        this.updatedAt = OffsetDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(OffsetDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
    
    

}
