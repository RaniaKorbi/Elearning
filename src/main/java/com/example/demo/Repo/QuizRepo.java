package com.example.demo.Repo;

import com.example.demo.model.Cours;
import com.example.demo.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepo extends JpaRepository<Quiz, Long> {

      List<Quiz> findByCours(Cours cours);

}
