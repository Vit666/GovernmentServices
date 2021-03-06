package gov.allowance.childrenallowance.application.office;

public class PassportOffice {
	private int id;
	private String name;
	private String area;

	public PassportOffice() {

	}

	public PassportOffice(int id, String name, String area) {
		this.id = id;
		this.name = name;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s",
			id, name, area);
	}
}