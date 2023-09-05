package com.course.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.Course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
