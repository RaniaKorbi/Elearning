package com.example.demo.Service;

import com.example.demo.Repo.QuizRepo;
import com.example.demo.model.Cours;
import com.example.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Exception.QuizNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service("QuizService")
@Transactional
public class QuizService {
    private QuizRepo quizRepo;
    @Autowired

    public QuizService(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }
    public Quiz findById(Long idQ) {
        return  quizRepo.findById(idQ).orElseThrow(() -> new QuizNotFoundException("Quiz not found!"));
    }

    public List<Quiz> findAll() {
        return quizRepo.findAll();
    }

    public List<Quiz> findByCours(Cours cours) {
        return quizRepo.findByCours(cours);
    }

    public Quiz save(Quiz quiz) {
        return quizRepo.save(quiz);
    }


    public void delete(Long idQ) {
        quizRepo.deleteById(idQ);
    }


    public Quiz update(Quiz quiz) {return quizRepo.save(quiz);
    }
}
