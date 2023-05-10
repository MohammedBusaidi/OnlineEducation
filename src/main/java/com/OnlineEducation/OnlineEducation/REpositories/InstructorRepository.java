package com.OnlineEducation.OnlineEducation.REpositories;

import com.OnlineEducation.OnlineEducation.Models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
