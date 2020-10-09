package com.cmdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cmdm.model.Question;
import com.cmdm.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionServices;
	
	private static final String QUESTION_VIEW = "/question";
	private static final String ADD_QUESTION_VIEW = "/add-question";
	
	@GetMapping("/")
	public ModelAndView question() {
		ModelAndView mav = new ModelAndView(QUESTION_VIEW);
		List<Question> questions = questionServices.getAll();
		mav.addObject("questions", questions);
		if(questions != null && questions.size() > 0) {
			System.out.println("questions -> " + questions.get(0).getQuestion());
		}
		return mav;
	}
	
	@GetMapping("/add")
	public ModelAndView addQuestionView() {
		ModelAndView mav = new ModelAndView(ADD_QUESTION_VIEW);
		mav.addObject("question", new Question());
		return mav;
	}
	
	@PostMapping("/addquestion") 
	public void addQuestion(){
		/**
		 * Method to add a question
		 */
	}
}
