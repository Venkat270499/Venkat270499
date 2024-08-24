package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.CourseDetailsTable;

public interface CourseDetailsRepo extends JpaRepository<CourseDetailsTable, Integer> {

	@Query("select courseCategory from CourseDetailsTable")
	public List<String> findUniqueCourseCategories();
	
	@Query("select facultyName from CourseDetailsTable")
	public List<String> findUniqueFacultyNames();
	
	@Query("select trainingMode from CourseDetailsTable")
	public List<String> findUniqueTrainingModes();
}
