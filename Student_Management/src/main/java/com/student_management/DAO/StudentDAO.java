package com.student_management.DAO;


import com.student_management.Api.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer> {

    @Query(value = "SELECT * FROM students", nativeQuery = true)
    List<Student> loadStudents() ;

   /* @Query(value = "SELECT * FROM students where)
    Student getStudent(int Userid) ;*/

//    @Query(value = "insert into students(name,mobile,country) values(?,?,?)", nativeQuery = true)
//    void saveStudent(Student student) ;




}
