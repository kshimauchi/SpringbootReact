package com.springbootreactapi.SpringBootReact.Repository;

import com.springbootreactapi.SpringBootReact.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    //Select * from student where email = ?  JBQL
    @Query("SELECT s FROM Student s Where s.email =?1")
    Optional<Student> findStudentByEmail(String email);

}

