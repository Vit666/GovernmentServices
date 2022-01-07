package gov.allowance.childrenallowance.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	public static final String URL = "url";
	public static final String LOGIN = "login";
	public static final String PASSWORD = "password";

	private static Properties properties = new Properties();

	public static String getProperty(String name) {
		if (properties.isEmpty()) {
			try (InputStream inputStream = new FileInputStream("logindata.txt")) {

				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

		return properties.getProperty(name);
	}
}