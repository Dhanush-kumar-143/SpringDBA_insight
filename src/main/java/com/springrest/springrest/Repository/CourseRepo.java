package com.springrest.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.Course.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{

}
