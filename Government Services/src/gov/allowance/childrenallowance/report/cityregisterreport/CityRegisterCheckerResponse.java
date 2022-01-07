package gov.allowance.childrenallowance.report.cityregisterreport;

public class CityRegisterCheckerResponse {
	private boolean existing;
	private Boolean temporaryRegistration;

	public boolean isExisting() {
		return existing;
	}

	public void setExisting(boolean existing) {
		this.existing = existing;
	}

	public Boolean isTemporaryRegistration() {
		return temporaryRegistration;
	}

	public void setTemporaryRegistration(Boolean temporaryRegistration) {
		this.temporaryRegistration = temporaryRegistration;
	}
}