package com.nt.service;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.entity.CourseDetailsTable;
import com.nt.model.SearchInputs;
import com.nt.model.SearchResults;
import com.nt.repo.CourseDetailsRepo;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class CourseDetailsServiImpl implements ICourseDetailsServi {
	
	@Autowired
	CourseDetailsRepo repo;
	
	

	@Override
	public Set<String> getAllCourseCategories() {
		// TODO Auto-generated method stub
		Set<String> courseCats=new HashSet<String>(repo.findUniqueCourseCategories());
		
		return courseCats;
	}

	@Override
	public Set<String> getAllFacultyNames() {
		// TODO Auto-generated method stub
		Set<String> facNames=new HashSet<String>(repo.findUniqueFacultyNames());
		return facNames;
	}

	@Override
	public Set<String> getAllTrainingModes() {
		// TODO Auto-generated method stub
		Set<String> trainMods=new HashSet<String>(repo.findUniqueTrainingModes());
		return trainMods;
	}

	@Override
	public List<SearchResults> getAllDetails(SearchInputs inputs) {
		// TODO Auto-generated method stub
		
		 
		CourseDetailsTable cdt=new CourseDetailsTable();
				
		BeanUtils.copyProperties(inputs, cdt);
		
		List<CourseDetailsTable> listResults=repo.findAll(Example.of(cdt));
		
		List<SearchResults> results=new ArrayList<>();
		
		listResults.forEach(data->{
			SearchResults res=new SearchResults();
			BeanUtils.copyProperties(data, res);
			results.add(res);
		});
		return results;
	}

	@Override
	public void getPdfReport(SearchInputs inputs, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getExcelReport(SearchInputs inputs, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

}
