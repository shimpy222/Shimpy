package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatesql {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String connectionString = "jdbc:mysql://localhost/school";
		String dbUserName = "root";
		String dbPassword = "shimpy";
		try {

			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(connectionString, dbUserName, dbPassword);
			Statement statement = connection.createStatement();
			StringBuffer query = new StringBuffer("update school.hello set ");
			query.append("Name=");
			query.append(new String("'Vinay'"));
			query.append(" where RollNo=");
			query.append(new Integer(2));
			System.out.println(query.toString());
			int executeUpdate = statement.executeUpdate(query.toString());
			if (executeUpdate > 0) {
				System.out.println("Record has been updated... :-)");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}

