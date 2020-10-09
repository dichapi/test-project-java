/**
 * 
 */
package com.cmdm.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


/**
 * @author Michel Díaz
 *
 */
@Entity
@Table(name="db_question")
public class Question {
	
	@NotNull
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idQuestion")
	private int idQuestion;
	
	@NotNull
	@Max(256)
	@Column(name = "question")
	private String question;
	
	@NotNull
	@Max(256)
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "type")
	private String type;
	
	@NotNull
	@Column(name = "required")
	private boolean required;
	
	@NotNull
	@Column(name = "status")
	private boolean status;
	
	@NotNull
	@Column(name = "creation")
	private Date creation;
	
	public Question(int idQuestion, String question, String type, boolean required, boolean status, Date creation) {
		super();
		this.idQuestion = idQuestion;
		this.question = question;
		this.type = type;
		this.required = required;
		this.status = status;
		this.creation = creation;
	}
	
	public Question() {
		super();
	}

	/**
	 * @return the idQuestion
	 */
	public int getIdQuestion() {
		return idQuestion;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @return the creation
	 */
	public Date getCreation() {
		return creation;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
