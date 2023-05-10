package com.OnlineEducation.OnlineEducation.REpositories;

import com.OnlineEducation.OnlineEducation.Models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
