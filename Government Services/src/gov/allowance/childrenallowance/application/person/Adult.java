package gov.allowance.childrenallowance.application.person;

import gov.allowance.childrenallowance.application.office.PassportOffice;

import java.time.LocalDate;

public class Adult extends Person {
	private String passportSeria;
	private String passportNumber;
	private LocalDate dateIssue;
	private PassportOffice passportOffice;

	public Adult() {

	}

	public Adult(String surName, String givenName, String patronymicName, 
		LocalDate dateBirthday) {
		super(surName, givenName, patronymicName, dateBirthday);
		
	}

	public String getPassportSeria() {
		return passportSeria;
	}

	public void setPassportSeria(String passportSeria) {
		this.passportSeria = passportSeria;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public LocalDate getDateIssue() {
		return dateIssue;
	}

	public void setDateIssue(LocalDate dateIssue) {
		this.dateIssue = dateIssue;
	}

	public PassportOffice getPassportOffice() {
		return passportOffice;
	}

	public void setPassportOffice(PassportOffice passportOffice) {
		this.passportOffice = passportOffice;
	}
}