package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Grade;
import com.OnlineEducation.OnlineEducation.REpositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

}
