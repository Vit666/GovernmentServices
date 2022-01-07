package gov.allowance.childrenallowance.application.details;

public class Street {
	private int streetCode;
	private String streetName;

	public Street() {

	}

	public Street(int streetCode, String streetName) {
		this.streetCode = streetCode;
		this.streetName = streetName;
	}

	public int getStreetCode() {
		return streetCode;
	}

	public void setStreetCode(int streetCode) {
		this.streetCode = streetCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return String.format("%s : %s",
			streetCode, streetName);
	}
}