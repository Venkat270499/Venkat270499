package com.nt.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SearchInputs {

	private String courseCategory;
	
	private String facultyName;
	
	private String trainingMode;
	
	private LocalDateTime courseStartDate;
}
