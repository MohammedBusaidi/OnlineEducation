package com.OnlineEducation.OnlineEducation.REpositories;

import com.OnlineEducation.OnlineEducation.Models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Long> {
}
