package com.course.Course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Course {

 @Id

 @GeneratedValue(strategy=GenerationType.AUTO)

 private int courseid;

 private String courseName;

 private String duration;

 private int coursefee;

 public int getCourseid() {

 return courseid;

 }

 public void setCourseid(int courseid) {

 this.courseid = courseid;

 }

 public String getCourseName() {

 return courseName;

 }

 public void setCourseName(String courseName) {

 this.courseName = courseName;

 }

 public String getDuration() {

 return duration;

 }

 public void setDuration(String duration) {

 this.duration = duration;

 }

 public int getCoursefee() {

 return coursefee;

 }

 public void setCoursefee(int coursefee) {

 this.coursefee = coursefee;

 }

 public Course() {

 }

}


