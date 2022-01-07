package gov.allowance.childrenallowance;

import gov.allowance.childrenallowance.application.*;
import gov.allowance.childrenallowance.application.office.*;
import gov.allowance.childrenallowance.request.DataRequest;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SaveNewApplication {
	public static int saveNewApplication(Application application) {
		return 0;
	}

	public static Application createApplication(int id) {
		Application application = new Application();

		application.setApplicationId(id);
		

		return application;
	}

	public static void main(String[] args) {
		DataRequest request = new DataRequest();

		try {

			for (PassportOffice office : request.findPassportOffice("011001000001")) {
				System.out.println(office);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			
			for (RegisterOffice office : request.findRegisterOffice("041004000001")) {
				System.out.println(office);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
