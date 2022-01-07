package gov.allowance.childrenallowance.application.person;

import gov.allowance.childrenallowance.application.details.*;

import java.time.LocalDate;

public abstract class Person {
	private String surName;
	private String givenName;
	private String patronymicName;
	private LocalDate dateBirthday;
	private Address address;
	private String university;
	private String studentId;

	public Person() {

	}

	public Person(String surName, String givenName, String patronymicName, 
		LocalDate dateBirthday) {
		this.surName = surName;
		this.givenName = givenName;
		this.patronymicName = patronymicName;
		this.dateBirthday = dateBirthday;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getPatronymicName() {
		return patronymicName;
	}

	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}

	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBitrhdate(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}