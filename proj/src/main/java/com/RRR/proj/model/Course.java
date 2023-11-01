package com.RRR.proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
	private String course_code,coursename;
	public Course(String course_code, String coursename) {
		super();
		this.course_code = course_code;
		this.coursename = coursename;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course_code=" + course_code + ", coursename=" + coursename + "]";
	}
	
}
