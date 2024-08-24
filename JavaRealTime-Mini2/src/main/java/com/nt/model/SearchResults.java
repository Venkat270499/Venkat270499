package com.nt.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SearchResults {
	
	
	private Integer courseId;
	
	private String courseName;
	
	private Double fee;
	
	private String facultyName;
	
	private String courseCategory;
	
	private String courseStatus;
	
	private LocalDateTime courseStartDate;
	
	private Long adminContact;
	
	private String trainingMode;
}
