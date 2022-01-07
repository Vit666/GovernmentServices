package gov.allowance.childrenallowance.request;

import gov.allowance.childrenallowance.config.Config;
import gov.allowance.childrenallowance.exception.DataRequestException;
import gov.allowance.childrenallowance.application.details.Street;
import gov.allowance.childrenallowance.application.office.PassportOffice;
import gov.allowance.childrenallowance.application.office.RegisterOffice;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataRequest implements DataRequester {
	private static final String FIND_STREET_QUERY = "SELECT street_code, street_name " + 
		"FROM street WHERE LOWER(street_name) LIKE LOWER(?)";

	private static final String FIND_PASSPORT_OFFICE_QUERY = "SELECT id, name " + 
		"FROM passport_office WHERE LOWER(area) LIKE LOWER(?)";

	private static final String FIND_REGISTER_OFFICE_QUERY = "SELECT id, name " + 
		"FROM register_office WHERE LOWER(area) LIKE LOWER(?)";

	private Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(
			Config.getProperty(Config.URL),
			Config.getProperty(Config.LOGIN), 
			Config.getProperty(Config.PASSWORD));

		return connection;
	}

	public List<Street> findStreet(String pattern) throws DataRequestException {
		List<Street> streets = new ArrayList<>();

		try (Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(FIND_STREET_QUERY)) {

			statement.setString(1, "%" + pattern + "%");

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				streets.add(new Street(set.getInt(1), set.getString(2)));
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return streets;
	} 

	public List<PassportOffice> findPassportOffice(String areaId) throws DataRequestException {
		List<PassportOffice> offices = new ArrayList<>();

		try (Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(FIND_PASSPORT_OFFICE_QUERY)) {

			statement.setString(1, areaId);			

			System.out.println(statement);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				offices.add(new PassportOffice(set.getInt(1), set.getString(2), areaId));
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return offices;
	} 

	public List<RegisterOffice> findRegisterOffice(String areaId) throws DataRequestException {
		List<RegisterOffice> offices = new ArrayList<>();

		try (Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(FIND_REGISTER_OFFICE_QUERY)) {

			statement.setString(1, areaId);

			System.out.println(statement);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				offices.add(new RegisterOffice(set.getInt(1), set.getString(2), areaId));
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return offices;
	}
}