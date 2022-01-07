package gov.allowance.childrenallowance.check.cityregistercheck;

import gov.allowance.childrenallowance.application.*;
import gov.allowance.childrenallowance.application.person.*;
import gov.allowance.childrenallowance.exception.*;
import gov.allowance.childrenallowance.report.cityregisterreport.CityRegisterReport;
import gov.allowance.childrenallowance.report.cityregisterreport.CityRegisterReportItem;
import gov.allowance.childrenallowance.report.cityregisterreport.CityRegisterCheckerResponse;

import java.util.List;

public class CityRegisterCheck {
	private String hostName;
	protected int port;
	private String login;
	private String password;

	private CityRegisterChecker personCheck;

	public static final String IN_CODE = "No city register exception!";

	public CityRegisterCheck() {
		this.personCheck = new FakeCityRegisterCheck();
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	private CityRegisterReportItem checkPerson(Person person) {
		CityRegisterReportItem.CityStatus status = null;
		CityRegisterReportItem.CityError error = null;

		try {
			CityRegisterCheckerResponse response = 
				personCheck.checkPerson(person);

			status = response.isExisting() ? 
				CityRegisterReportItem.CityStatus.YES : CityRegisterReportItem.CityStatus.NO;

		} catch (CityRegisterException e) {
			System.out.println(e);
			e.printStackTrace();

			status = CityRegisterReportItem.CityStatus.ERROR;	

			error = new CityRegisterReportItem.CityError(e.getCode(), e.getMessage());

		} catch (TransportException e) {
			System.out.println(e);
			e.printStackTrace();

			status = CityRegisterReportItem.CityStatus.ERROR;

			error = new CityRegisterReportItem.CityError(IN_CODE, e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		CityRegisterReportItem item = new CityRegisterReportItem(person, status, error);

		return item;
	}

	public CityRegisterReport checkCityRegister(Application application) {
		CityRegisterReport report = new CityRegisterReport();

		report.addItem(checkPerson(application.getHusband()));	

		report.addItem(checkPerson(application.getWife()));

		for (Child child : application.getChildren()) {
			report.addItem(checkPerson(child));
		}

		return report;
	}
}