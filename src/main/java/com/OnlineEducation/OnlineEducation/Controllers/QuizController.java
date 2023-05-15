package com.OnlineEducation.OnlineEducation.Controllers;

import com.OnlineEducation.OnlineEducation.Models.Quiz;
import com.OnlineEducation.OnlineEducation.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @GetMapping(value = "getAll")
    public List<Quiz> getQuizzes() {
        return quizService.getAllQuizzes();
    }
}
