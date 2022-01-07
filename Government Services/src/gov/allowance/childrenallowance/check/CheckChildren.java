package gov.allowance.childrenallowance.check;

import gov.allowance.childrenallowance.report.ChildrenReport;
import gov.allowance.childrenallowance.application.Application;

public class CheckChildren {
	private String hostName;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public ChildrenReport checkChildren(Application application) {
		ChildrenReport report = new ChildrenReport();
		return report;
	}
}