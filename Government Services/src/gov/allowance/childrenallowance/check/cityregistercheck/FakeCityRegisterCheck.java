package gov.allowance.childrenallowance.check.cityregistercheck;

import gov.allowance.childrenallowance.exception.*;	
import gov.allowance.childrenallowance.application.person.*;
import gov.allowance.childrenallowance.report.cityregisterreport.CityRegisterCheckerResponse;

public class FakeCityRegisterCheck implements CityRegisterChecker {
	public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException, 
			TransportException {
				
		CityRegisterCheckerResponse response = new CityRegisterCheckerResponse();

		if (person instanceof Adult) {
			Adult adult = (Adult) person;
			
		} else if (person instanceof Child) {
			Child child = (Child) person;
		}

		return response;
	}
}