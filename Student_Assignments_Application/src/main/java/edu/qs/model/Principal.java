package edu.qs.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "principals")
public class Principal {
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "principals_id_seq")
	 @SequenceGenerator(name = "principals_id_seq", sequenceName = "principals_id_seq", allocationSize = 1)
	 private Long id;

	    

	    @Column(name = "created_at", nullable = false)
	    private Instant createdAt;

	    @Column(name = "updated_at", nullable = false)
	    private Instant updatedAt;

	    public Principal() {
	        this.createdAt = Instant.now();
	        this.updatedAt = Instant.now();
	    }

	    
		@PreUpdate
	    public void preUpdate() {
	        this.updatedAt = Instant.now();
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Instant getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Instant createdAt) {
			this.createdAt = createdAt;
		}

		public Instant getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Instant updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
		@Override
	    public String toString() {
	        return "Principal{" +
	                "id=" + id +
	                '}';
	    }

	    
	

}
