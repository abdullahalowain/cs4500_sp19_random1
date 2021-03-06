package com.example.cs4500_sp19_random1.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="service_questions")
public class ServiceQuestion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String question;
    private String type;
    private String choices;
    @OneToMany(mappedBy="serviceQuestion")
    private List<ServiceAnswer> serviceAnswers;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getChoices() {
        return choices;
    }
    public void setChoices(String choices) {
        this.choices = choices;
    }
}
