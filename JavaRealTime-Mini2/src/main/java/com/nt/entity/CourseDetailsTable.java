package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetailsTable {

	@Id
	@GeneratedValue
	private Integer courseId;
	
	private String courseName;
	
	private Double fee;
	
	private String facultyName;
	
	private String courseCategory;
	
	private String courseStatus;
	
	private LocalDateTime courseStartDate;
	
	private Long adminContact;
	
	private String trainingMode;
	
	@CreationTimestamp
	private LocalDateTime creationDate;
	
	@UpdateTimestamp
	private LocalDateTime updationDate;
	
	private String createdBy;
	
	private String updatedBy;
}
