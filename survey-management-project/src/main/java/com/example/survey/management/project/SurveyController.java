package com.example.survey.management.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class SurveyController<SurveyService> {
    @Autowired
        private SurveyService service;

        @RequestMapping("/")
        public String viewHomePage(Model model) {
            Class<?> listSurveyDetails = service.getClass();
            model.addAttribute("listSurveyDetails", listSurveyDetails );

            return "index";
        }

        @RequestMapping("/new")
        public String showNewProductPage(Model model) {
            Survey surveyDetails = new Survey();
            model.addAttribute("surveyDetails", surveyDetails );

            return "new_surveyDetails";
        }

        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String saveProduct(@ModelAttribute("product") Survey surveyDetails) {
            Object survey = new Object();
            Object survey1 = survey;

            return "redirect:/";
        }

        @RequestMapping("/edit/{id}")
        public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
            ModelAndView mav = new ModelAndView("edit_product");
            Class<?> surveyDetails = service.getClass();
            mav.addObject("surveyDetails", surveyDetails);

            return mav;
        }

        @RequestMapping("/delete/{id}")
        public String deleteSurveyDetails(@PathVariable(name = "id") int id) {
            return "redirect:/";
        }
    }

