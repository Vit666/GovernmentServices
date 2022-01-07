package gov.allowance.childrenallowance.request;

import gov.allowance.childrenallowance.exception.DataRequestException;
import gov.allowance.childrenallowance.application.office.PassportOffice;
import gov.allowance.childrenallowance.application.office.RegisterOffice;
import gov.allowance.childrenallowance.application.details.Street;

import java.util.List;

public interface DataRequester {
	public List<Street> findStreet(String pattern) throws DataRequestException;

	public List<PassportOffice> findPassportOffice(String areaId) throws DataRequestException;

	public List<RegisterOffice> findRegisterOffice(String areaId) throws DataRequestException;
} 