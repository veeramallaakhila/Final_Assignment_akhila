package com.example.survey.management.project;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Properties;

public class Survey_Management<id, survey, Survey> {
    @Service
    @Transactional
    public class surveyManagement {
        @Autowired
        private SurveyRepository repo;

        void findAll() {

        }

    }
    public void save (survey survey) {
        Properties repo = new Properties();
    }
    public Survey get(Long id) {
        return null;
    }


    }
