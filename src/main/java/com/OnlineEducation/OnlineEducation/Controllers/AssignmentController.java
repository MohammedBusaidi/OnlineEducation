package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Assignment;
import com.OnlineEducation.OnlineEducation.Services.AssignmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "assignment")
public class AssignmentController {
    AssignmentService assignmentService;
    @GetMapping(value = "getAll")
    public List<Assignment> getAssignments() {
        return assignmentService.getAllAssignments();
    }
}
