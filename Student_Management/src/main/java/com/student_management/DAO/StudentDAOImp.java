/*
    package com.student_management.DAO;

    import com.student_management.Api.Student;
    import com.student_management.rowMapper.StudentRowMapper;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.jdbc.core.JdbcTemplate;
    import org.springframework.stereotype.Repository;

    import java.util.ArrayList;
    import java.util.List;


    //@Repository
    public class StudentDAOImp  {
    */
/*

        @Autowired
        private JdbcTemplate jdbcTemplate ;
        @Override
        public List<Student> loadStudents() {
            String sql = "SELECT * FROM students" ;

            List<Student> theListOfStudents = jdbcTemplate.query(sql, new StudentRowMapper());

            return theListOfStudents ;
        }

        @Override
        public void saveStudent(Student student) {
            //write logic to save data in databse
            Object[] sqlParameters = {student.getName(),student.getMobile(),student.getCountry()};

            String sql = "insert into students(name,mobile,country) values(?,?,?)" ;

            jdbcTemplate.update(sql,sqlParameters);

        }
    *//*


    }
*/
