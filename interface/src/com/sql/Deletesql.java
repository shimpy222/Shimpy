package com.sql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletesql {

	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String connectionString = "jdbc:mysql://localhost/school";
		String dbUserName = "root";
		String dbPassword = "shimpy";
		try {

			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(connectionString, dbUserName, dbPassword);
			Statement statement = connection.createStatement();
			StringBuffer query = new StringBuffer("delete from school.hello ");
			query.append(" where RollNo=6");
			//query.append(new Integer(6));
			System.out.println(query.toString());
			int executeUpdate = statement.executeUpdate(query.toString());
			if (executeUpdate > 0) {
				System.out.println("Record has been deleted... :-)");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}

