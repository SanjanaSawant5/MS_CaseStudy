package com.course.Course.intercomm;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.course.Course.model.Student;

@FeignClient(name="student", url="http://localhost:8080")
public interface StudentClient {
	@PostMapping(value="/home/student/find", consumes="application/json")
	Student getStudent(@RequestBody int studId);

}
