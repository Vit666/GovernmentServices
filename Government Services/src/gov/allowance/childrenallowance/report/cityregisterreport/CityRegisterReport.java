package gov.allowance.childrenallowance.report.cityregisterreport;

import java.util.ArrayList;
import java.util.List;

public class CityRegisterReport {
	private List<CityRegisterReportItem> items;

	public List<CityRegisterReportItem> getItems() {
		return items;
	}

	public void addItem(CityRegisterReportItem item) {
		if (items == null) {
			items = new ArrayList<CityRegisterReportItem>();
		}

		items.add(item);
	}
}