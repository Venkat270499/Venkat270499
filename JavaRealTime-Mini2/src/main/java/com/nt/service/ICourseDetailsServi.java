package com.nt.service;

import java.util.List;
import java.util.Set;

import com.nt.model.SearchInputs;
import com.nt.model.SearchResults;

import jakarta.servlet.http.HttpServletResponse;

public interface ICourseDetailsServi {
	
	public Set<String> getAllCourseCategories();
	
	public Set<String> getAllFacultyNames();
	
	public Set<String> getAllTrainingModes();
	
	public List<SearchResults> getAllDetails(SearchInputs inputs);
	
	public void getPdfReport(SearchInputs inputs,HttpServletResponse res );
	
	public void getExcelReport(SearchInputs inputs,HttpServletResponse res );
	

}
