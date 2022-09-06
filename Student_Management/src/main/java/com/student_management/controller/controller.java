package com.student_management.controller;
import com.student_management.Api.Student;
import com.student_management.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class controller {
    @Autowired
    private StudentDAO studentDAO ;
    @GetMapping(value = "/showStudent")
    public ModelAndView showStudentList(Model model){

        ModelAndView modelAndView = new ModelAndView("show_studentList") ;
        modelAndView.addObject("Students",studentDAO.loadStudents()) ;
        return modelAndView ;
    }

    @GetMapping(value = "/showAddStudentPage")
    public ModelAndView addStudent(Model model){

        ModelAndView modelAndView = new ModelAndView("add-student");
        Student student = new Student() ;
        model.addAttribute("student", student) ;
        return modelAndView ;

    }

   
    @PostMapping(value = "/save-student")
    public ModelAndView saveStudent( Student student){

        Student student1 = studentDAO.findById(student.getId()).orElse(null);

        if (student1 == null) {
            studentDAO.save(student);
        }  else {
            student1.setContry(student.getContry());
            student1.setMobile(student.getMobile());
            student1.setName(student.getName());
            studentDAO.save(student1);
        }
        return new ModelAndView("redirect:/showStudent");
    }

    @GetMapping(value = "/updateStudent")
    public ModelAndView showUpdateStudent(@RequestParam("userId") int id){

        Student student = studentDAO.findById(id).orElse(null);
        ModelAndView modelAndView = new ModelAndView("add-student");
        modelAndView.addObject("student", student);
        return modelAndView ;

    }

    @GetMapping (value = "/deleteStudent")
    public ModelAndView deleteStudentRecord(@RequestParam("userId") int id){

        studentDAO.deleteById(id);
        return new ModelAndView("redirect:/showStudent") ;

    }





}

