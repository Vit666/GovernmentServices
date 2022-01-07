package gov.allowance.childrenallowance.application;

import gov.allowance.childrenallowance.application.person.*;
import gov.allowance.childrenallowance.application.office.*;
import gov.allowance.childrenallowance.application.details.*;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Application {
	private long applicationId;
	private Adult husband;
	private Adult wife;
	private List<Child> children;
	private String marriageCertificateId;
	private RegisterOffice marriageOffice;
	private LocalDate marriageDate;

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public Adult getHusband() {
		return husband;
	}

	public void setHusband(Adult husband) {
		this.husband = husband;
	}

	public Adult getWife() {
		return wife;
	}

	public void setWife(Adult wife) {
		this.wife = wife;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	public void addChild(Child child) {
		if (children == null) {
			children = new ArrayList<Child>();
		}

		children.add(child);
	}
}
