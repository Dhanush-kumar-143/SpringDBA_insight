//package com.springrest.springrest.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.springrest.springrest.Course.Course;
//import com.springrest.springrest.Repository.CourseRepo;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//	
//	@Autowired
//	private CourseRepo courseRepo;
//
//	// creating temporary list
////	List<Course> list;
//	
//	//creating constructor
//	public CourseServiceImpl() {
//		
////		list = new ArrayList<>();
////		list.add(new Course(145,"Java Core Course","This Course contains basics of java"));
////		list.add(new Course(4343,"Spring boot course", "Creating rest api using Spring boot"));
//	}
//	
//	
//	
////	@Override
////	public List<Course> getCourses() {
////		// TODO Auto-generated method stub
////		//return list; 
////		return courseRepo.findAll();
////	}
//
//	 @Override
//	  public List<Course> getCourses() {
//	        return courseRepo.findAll();
//	  }
//	 
//	public Course getCourses(Long id) {
//	    return courseRepo.findById(id).orElse(null);
//	}
//
//	
////	@SuppressWarnings("deprecation")
////	@Override
////	public Course getCourse(long CourseId) {
////		// TODO Auto-generated method stub
//////		Course C=null;
//////		for(Course course : list) {
//////			if(course.getId() == CourseId) {
//////				C = course;
//////				break;
//////			}
//////		}
////		
//////		return C;
////		return courseRepo.getOne(CourseId);
////	}
//
//
//	@Override
//	public Course addCourse(Course course) {
//		// TODO Auto-generated method stub
////		list.add(course);
//		courseRepo.save(course);
//		return course;
//	}
//	
//	
//	@Override
//	public Course updateCourse(Course course) {
//		// TODO Auto-generated method stub
///*		for(int i=0;i<list.size();i++) {
//			//Variable declared here
//			Course existingCourse = list.get(i);
//			
//			//check if ID's matches
//			if(existingCourse.getId() == course.getId()) {
//				//update fields
//				existingCourse.setTitle(course.getTitle());
//				existingCourse.setDescription(course.getDescription());
//				
//				// update list
//				list.set(i, existingCourse);
//				
//				return existingCourse;
//			}
//		}	*/
//		courseRepo.save(course);
//		return course;
//	}
//
//// Old method 
////	@SuppressWarnings("deprecation")
////	@Override
////	public void deleteCourse(long parseLong) {
//////		list= this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
////		Course entity = courseRepo.getOne(parseLong);
////		courseRepo.delete(entity);
////	}
//	
//	public void deleteCourse(Long id) {
//	    courseRepo.deleteById(id);
//	}
//
//
//
//	
//
//
//
//}










// ======================================================================

package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Course.Course;
import com.springrest.springrest.Repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;
    
    @Override
    public List<Course> getAllCourses() {
        return this.courseRepo.findAll(); // or whatever your repo uses
    }


//    @Override
//    public List<Course> getCourses() {
//        return courseRepo.findAll();
//    }

    @Override
    public Course getCourse(Long id) {
        return courseRepo.findById(id).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }
}

