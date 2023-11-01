package com.RRR.proj.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RRR.proj.model.Student;

@Repository
@Qualifier("studentRepo")
public interface StudentRepository extends JpaRepository<Student,Long>
{
@Query(nativeQuery= true,value="select * from student where emailid=:emailid and password=:password")

Student findByEmailIdAndPassword(@Param("emailid") String emailid,@Param("password") String password);
}