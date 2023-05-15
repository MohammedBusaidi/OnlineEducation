package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Grade;
import com.OnlineEducation.OnlineEducation.Services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "grade")
public class GradeController {
    @Autowired
    GradeService gradeService;
    public List<Grade> getGrades() {
        return gradeService.getAllGrades();
    }
}
