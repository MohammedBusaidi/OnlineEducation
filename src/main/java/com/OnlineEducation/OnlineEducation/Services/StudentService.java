package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Student;
import com.OnlineEducation.OnlineEducation.REpositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
