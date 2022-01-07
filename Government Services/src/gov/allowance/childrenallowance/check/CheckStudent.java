package gov.allowance.childrenallowance.check;

import gov.allowance.childrenallowance.report.StudentReport;
import gov.allowance.childrenallowance.application.Application;

public class CheckStudent {
	private String hostName;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public StudentReport checkStudent(Application application) {
		StudentReport report = new StudentReport();
		return report;
	}
}