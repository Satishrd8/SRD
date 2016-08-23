package com.elearning.web.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.elearning.web.model.Course;
import com.elearning.web.exception.CourseTopicAlreadyExistException;

public interface CourseService {

	Course addCourse(Course input) throws CourseTopicAlreadyExistException;

	// FINDERS
	List<Course> findAll();
	
	Page<Course> findAll(Pageable pageable);
	
	Course findById(Long courseId);

}
