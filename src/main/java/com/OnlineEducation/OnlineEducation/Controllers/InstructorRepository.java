package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Instructor;
import com.OnlineEducation.OnlineEducation.Services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "instructor")
public class InstructorRepository {
    @Autowired
    InstructorService instructorService;
    @GetMapping(value = "getAll")
    public List<Instructor> getInstructors() {
        return instructorService.getAllInstructors();
    }
}
