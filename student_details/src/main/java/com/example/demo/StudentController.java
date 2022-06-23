package com.example.demo;

import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    ModelAndView getStudent(){
       Student student1= new Student("jhon",26 );
       Student student2= new Student("ram",20 );
       studentRepository.save(student1);
       studentRepository.save(student2);
       ModelAndView studentmodel= new ModelAndView();
       studentmodel.setViewName("studentDetail");
       studentmodel.addObject("studentDetail",studentRepository.findAll());
        return studentmodel;


    }



}
