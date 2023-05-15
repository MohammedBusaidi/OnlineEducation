package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Student;
import com.OnlineEducation.OnlineEducation.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value = "GetAll")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
