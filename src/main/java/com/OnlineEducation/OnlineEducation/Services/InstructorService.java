package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Instructor;
import com.OnlineEducation.OnlineEducation.REpositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    @Autowired
    InstructorRepository instructorRepository;
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
}
