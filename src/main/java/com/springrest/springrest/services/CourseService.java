package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.Course.Course;

public interface CourseService {
	public List<Course> getAllCourses();
	
//	public Course getCourse(long CourseId);
//	
//	public Course addCourse(Course course);
//	
//	public Course updateCourse(Course course);
//	
//	public void deleteCourse(long parseLong);
//
//	public Course saveCourse(Course course);
	
	Course getCourse(Long id);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long id);
}
