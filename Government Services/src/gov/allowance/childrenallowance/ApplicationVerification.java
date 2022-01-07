package gov.allowance.childrenallowance;

import gov.allowance.childrenallowance.mail.*;
import gov.allowance.childrenallowance.application.*;
import gov.allowance.childrenallowance.report.*;
import gov.allowance.childrenallowance.report.cityregisterreport.*;
import gov.allowance.childrenallowance.check.*;
import gov.allowance.childrenallowance.check.cityregistercheck.*;

import java.util.ArrayList;
import java.util.List;

public class ApplicationVerification {
	private CityRegisterCheck cityRegisterCheck;	
	private CheckMarriage checkMarriage;
	private CheckChildren checkChildren;
	private CheckStudent checkStudent;
	private MailSender mailSender;

	public ApplicationVerification() {
		cityRegisterCheck = new CityRegisterCheck();
		checkMarriage = new CheckMarriage();
		checkChildren = new CheckChildren();
		checkStudent = new CheckStudent();
		mailSender = new MailSender(); 
	}

	public CityRegisterReport checkCityRegister(Application application) {
		return cityRegisterCheck.checkCityRegister(application);
	}

	public MarriageReport checkMarriage(Application application) {
		return checkMarriage.checkMarriage(application);
	}

	public ChildrenReport checkChildren(Application application) {
		return checkChildren.checkChildren(application);
	}

	public StudentReport checkStudent(Application application) {
		return checkStudent.checkStudent(application);
	}

	public List<Application> readApplications() {
		List<Application> applications = new ArrayList<Application>();

		for (int i = 0; i < applications.size(); i++) {
			applications.add(SaveNewApplication.createApplication(i));
		}

		return applications;
	}

	public void sendMail(Application application) {
		mailSender.sendMail();
	}

	public void checkAll() {
		List<Application> application = readApplications();

		if (application == null) {
			return;
		} else {
			
		}
	}

	public static void main(String[] args) {
		ApplicationVerification verification = new ApplicationVerification();
		verification.checkAll();
	}
}
