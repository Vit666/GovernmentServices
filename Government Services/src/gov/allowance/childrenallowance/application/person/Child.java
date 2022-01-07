package gov.allowance.childrenallowance.application.person;

import gov.allowance.childrenallowance.application.office.RegisterOffice;

import java.time.LocalDate;

public class Child extends Person {
	private String certificateNumber;
	private LocalDate dateIssue;
	private RegisterOffice registerOffice;

	public Child() {

	}

	public Child(String surName, String givenName, String patronymicName, 
		LocalDate dateBirthday) {
		super(surName, givenName, patronymicName, dateBirthday);
		
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public LocalDate getDateIssue() {
		return dateIssue;
	}

	public void setDateIssue(LocalDate dateIssue) {
		this.dateIssue = dateIssue;
	}

	public RegisterOffice getRegisterOffice() {
		return registerOffice;
	}

	public void setRegisterOffice(RegisterOffice registerOffice) {
		this.registerOffice = registerOffice;
	}
}