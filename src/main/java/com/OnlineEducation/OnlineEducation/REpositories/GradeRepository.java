package com.OnlineEducation.OnlineEducation.REpositories;

import com.OnlineEducation.OnlineEducation.Models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Long> {
}
