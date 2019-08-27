package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("!! JDBC Driver load ¿À·ù : " + e.getMessage());
			e.printStackTrace();
		}
		try {
			String dbURL = "jdbc:mysql://localhost:3306/LectureEvaluation?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "qhfka102938!";
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}