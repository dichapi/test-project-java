/**
 * 
 */
package com.cmdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cmdm.model.Question;
import com.cmdm.repository.QuestionRepository;

/**
 * @author Michel Díaz
 *
 */
@Service("questionServiceImpl")
public class QuestionService {

	@Autowired
	@Qualifier("questionJpaRepository")
	private QuestionRepository questionJpaRepository;
	
	public Question addQuestion(Question question) {
		return questionJpaRepository.save(question);
	}
	
	public List<Question> getAll() {
		return questionJpaRepository.findAll();
	}
}
