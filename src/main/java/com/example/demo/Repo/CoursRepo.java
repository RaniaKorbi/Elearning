package com.example.demo.Repo;


import com.example.demo.model.Catégorie;
import com.example.demo.model.Cours;
import com.example.demo.model.Quiz;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CoursRepo extends JpaRepository<Cours,Long> {


    void deleteCoursByIdCr(Long id);

    List<Cours> findByCatégorie(Catégorie catégorie);

    Optional<Cours> findCoursByIdCr(Long idCr);
    @Modifying
    @Query("delete from Cours where Name=?1")
    void deleteCoursByName(String Name);


    Optional<Cours> findCoursByTitre(String titre);
}
