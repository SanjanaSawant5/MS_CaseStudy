package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@RestController //@Controller + @ResponseBody

//@Controller

@RequestMapping("/home")

public class StudentController {

 //@ResponseBody

 /*public String value() {

 return "Hello from spring boot!!!";

 }*/

 @Autowired

 StudentRepository repository;

 @GetMapping("/student")

 public List<Student> getStudents() {

 //crud method

 List<Student>studList = repository.findAll();

 return studList;

 /*List<Student> studList = new ArrayList<>();

 studList.add(new Student("Mohan", 121, "Pune"));

 studList.add(new Student("Sheetal", 122, "Pune"));

 studList.add(new Student("Meera", 123, "Pune"));

 return studList;*/

 }

 @PostMapping("/student/find/{id}")

 //@GetMapping("/student/find")

 public Student getStudentById(@PathVariable("id")int id) {

 //public Student getStudentById(@RequestParam("id")int id) {

 Optional<Student> stud = repository.findById(id);

 if(stud.isPresent()) {

  return stud.get();

 }

 else {

  return null;

 }

 }

}