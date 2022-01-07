package gov.allowance.childrenallowance.check.cityregistercheck;

import gov.allowance.childrenallowance.application.person.Person;
import gov.allowance.childrenallowance.exception.CityRegisterException;
import gov.allowance.childrenallowance.exception.TransportException;
import gov.allowance.childrenallowance.report.cityregisterreport.CityRegisterCheckerResponse;

public interface CityRegisterChecker {
	   CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException, 
	   	TransportException;
}