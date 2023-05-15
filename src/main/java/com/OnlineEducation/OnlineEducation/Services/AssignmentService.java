package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Assignment;
import com.OnlineEducation.OnlineEducation.REpositories.AssignmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }
}
