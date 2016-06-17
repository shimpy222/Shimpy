package com.sql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connection {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String connectionString = "jdbc:mysql://localhost/school";
		String dbuser = "root";
		String dbPassword = "shimpy";

		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(connectionString, dbuser, dbPassword);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from school.hello");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
