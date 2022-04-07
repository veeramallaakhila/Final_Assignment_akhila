package com.example.survey.management.project;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SurveyRepository<Survey> extends JpaRepository <Survey,Long>{
}
