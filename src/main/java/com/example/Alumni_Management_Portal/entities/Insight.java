package com.example.Alumni_Management_Portal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Insight {

    @Id
    private int id;

    private String title;
    private Boolean surveyStatus;
    private LocalDateTime openDate;
    private LocalDateTime closeDate;

    @ManyToOne
    private User insightCreator;



//    @OneToMany
//    private List<SurveyQuestion> surveyQuestionList;

}
