package com.RRR.proj.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RRR.proj.model.Course;
import com.RRR.proj.model.Student;
@Repository
@Qualifier("courseRepo")

public interface CourseRepository extends JpaRepository<Course,Long> {
	
}
