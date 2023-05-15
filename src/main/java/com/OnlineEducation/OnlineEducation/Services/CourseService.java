package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Course;
import com.OnlineEducation.OnlineEducation.REpositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
     CourseRepository courseRepository;
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
