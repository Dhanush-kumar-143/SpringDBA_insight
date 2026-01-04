package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Course.Course;
import com.springrest.springrest.services.CourseService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/courses")
public class MyController {
	
	// Variable declaration //Autowired will do create i need implementation of the object for CourseService and it will bring implementation of the object and inject in courseserviceCall. we are doing this with help of springwork framework

	@Autowired
	private CourseService courseserviceCall;
	
	@GetMapping("/api/home")
	public String home() {
		return "Welcome to the courses Application";
	}
	
	//get the courses
	
	@GetMapping
    public List<Course> getAllCourses() {
        return courseserviceCall.getAllCourses();
    }
	
	
//	@GetMapping("/courses/{CourseId}")
//	public Course getCorse(@PathVariable String CourseId){
//		return this.courseserviceCall.getCourse(Long.parseLong(CourseId));
//	}
	@GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        return courseserviceCall.getCourse(id);
    }
	
//	//Post Mapping
//	@PostMapping("/courses")
//	public Course addCourse(@RequestBody Course course) {
//		return this.courseserviceCall.addCourse(course);
//	}
	 
	 @PostMapping
	    public Course addCourse(@RequestBody Course course) {
	        return courseserviceCall.addCourse(course);
	    }
	 
	
//	//PUT 
//	@PutMapping("/courses")
//	public Course updateCourse(@RequestBody Course course) {
//		return this.courseserviceCall.updateCourse(course);
//	}
	 @PutMapping
	    public Course updateCourse(@RequestBody Course course) {
	        return courseserviceCall.updateCourse(course);
	  }
	
	// Delete the course 
//	@DeleteMapping("/courses/{CourseId}")
//	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String CourseId){
//		try {
//			this.courseserviceCall.deleteCourse(Long.parseLong(CourseId));
//			return new ResponseEntity<>(HttpStatus.OK);
//		}catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		
//	}
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long id) {
	        courseserviceCall.deleteCourse(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	
	 @PostConstruct
	 public void init() {
	     System.out.println("MyController GET endpoint loaded");
	 }

}
