package com.elearning.web.persistence.jparepositories;

import com.elearning.web.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findAll();

	List<Course> findByCourseTopic(String courseTopic);

	List<Course> findById(Long id);

}
