package edu.qs.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assignments_id_seq")
    @SequenceGenerator(name = "assignments_id_seq", sequenceName = "assignments_id_seq", allocationSize = 1)
    private Long id;
    /*
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
    		  CascadeType.DETACH,CascadeType.REFRESH})
      @JoinTable(name = "STUDENT_ASSIGNMENT_APPLICATION",joinColumns = @JoinColumn(name ="student_id"),
      inverseJoinColumns =  @JoinColumn(name ="assignment_id"))
      private List<Student> student ;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
      
     
     /*@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE,
      CascadeType.DETACH,CascadeType.REFRESH})
      @JoinTable(name = "STUDENT_ASSIGNMENT_APPLICATION",joinColumns = @JoinColumn(name ="teacher_id"),
      inverseJoinColumns =  @JoinColumn(name ="assignment_id"))
     private List<Teacher> teacher ;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Enumerated(EnumType.STRING)
    private GradeEnum grade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssignmentStateEnum state = AssignmentStateEnum.DRAFT;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    
    public Assignment() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public GradeEnum getGrade() {
		return grade;
	}

	public void setGrade(GradeEnum grade) {
		this.grade = grade;
	}

	public AssignmentStateEnum getState() {
		return state;
	}

	public void setState(AssignmentStateEnum state) {
		this.state = state;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}  

}
