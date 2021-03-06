package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue
    private Long idCr;
    private String titre;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_catégorie")
    private  Catégorie catégorie;

    @OneToMany(mappedBy = "cours")
    private List<Quiz> quizList;

    public Long getIdCr() {
        return idCr;
    }

    public void setIdCr(Long idCr) {
        this.idCr = idCr;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catégorie getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(Catégorie catégorie) {
        this.catégorie = catégorie;
    }

    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }

    public Cours() {
    }

    public Cours(Long idCr, String titre, String description, Catégorie catégorie) {
        this.idCr = idCr;
        this.titre = titre;
        this.description = description;
        this.catégorie = catégorie;
    }

    public Cours(Long idCr, String titre, String description) {
        this.idCr = idCr;
        this.titre = titre;
        this.description = description;
    }
}
