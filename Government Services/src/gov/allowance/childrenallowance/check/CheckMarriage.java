package gov.allowance.childrenallowance.check;

import gov.allowance.childrenallowance.report.MarriageReport;
import gov.allowance.childrenallowance.application.Application;

public class CheckMarriage {
	private String hostName;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public MarriageReport checkMarriage(Application application) {
		MarriageReport report = new MarriageReport();
		return report;
	}
}