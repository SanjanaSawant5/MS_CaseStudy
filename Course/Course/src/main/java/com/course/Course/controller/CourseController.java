package com.course.Course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.Course.intercomm.StudentClient;
import com.course.Course.model.Course;
import com.course.Course.model.Student;
import com.course.Course.repository.CourseRepository;

@RestController
@RequestMapping("/coursehome")
public class CourseController {

 @Autowired
 CourseRepository repository;
 
 @Autowired 
 StudentClient studClient;

 @GetMapping("service/stud/{studId}")
 public Student getStud(@PathVariable int studId) {
	 return studClient.getStudent(studId);
 }


 @GetMapping("/course")
 public List<Course> getCourse() {
 List<Course>courseList = repository.findAll();
 return courseList;
 }

 @GetMapping("/course/find/{id}")
 public Course getCourseById(@PathVariable("id")int id) {
 Optional<Course> cour = repository.findById(id);
 if(cour.isPresent()) {
  return cour.get();
 }
 else {
	  return null;
 }
 }
 
 
 

  

}