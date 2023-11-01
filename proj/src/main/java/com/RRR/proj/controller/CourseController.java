package com.RRR.proj.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RRR.proj.model.Course;
import com.RRR.proj.model.Student;
import com.RRR.proj.repository.CourseRepository;
import com.RRR.proj.repository.StudentRepository;


@RestController
@RequestMapping("/project/")
public class CourseController {
@Autowired
@Qualifier("courseRepo")
CourseRepository courseRepo;

@RequestMapping("/courses")
public ArrayList<Course> getAll()
{
	ArrayList<Course> ls=(ArrayList<Course>)courseRepo.findAll();
	return ls;
}

@PostMapping("/courses")
public Course insertrecord(@RequestBody Course c)
{
	return courseRepo.save(c);
}
}
