package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Course;
import com.OnlineEducation.OnlineEducation.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping(value = "getAll")
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }
}
