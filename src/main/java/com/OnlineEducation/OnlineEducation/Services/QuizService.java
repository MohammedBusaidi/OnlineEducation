package com.OnlineEducation.OnlineEducation.Services;

import com.OnlineEducation.OnlineEducation.Models.Quiz;
import com.OnlineEducation.OnlineEducation.REpositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
}
