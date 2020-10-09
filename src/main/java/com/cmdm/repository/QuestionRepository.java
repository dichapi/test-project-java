package com.cmdm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmdm.model.Question;

/**
 * 
 * @author Michel Díaz
 *
 */
@Repository("questionJpaRepository")
public interface QuestionRepository extends JpaRepository<Question, Serializable> {

}