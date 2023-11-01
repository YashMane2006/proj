package com.RRR.proj.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RRR.proj.model.Student;
import com.RRR.proj.repository.StudentRepository;


@RestController
@RequestMapping("/project/")
public class StudentController {
@Autowired
@Qualifier("studentRepo")
//StudentServiceImpl sl;
StudentRepository studentRepo;
@RequestMapping("/")
public String hello()
{
		return "index";
}
@RequestMapping("/users")
public ArrayList<Student> getAll()
{
	ArrayList<Student> ls=(ArrayList<Student>)studentRepo.findAll();
	return ls;
}
@GetMapping("/users/{emailid}&{password}")
public ResponseEntity<Student> search(@PathVariable("emailid") String emailid,@PathVariable("password") String password)
{
	Student s=studentRepo.findByEmailIdAndPassword(emailid,password);
	return new ResponseEntity<Student>(s,HttpStatus.OK);
}

@PostMapping("/users")
public Student insertrecord(@RequestBody Student s)
{
	return studentRepo.save(s);
}

}
