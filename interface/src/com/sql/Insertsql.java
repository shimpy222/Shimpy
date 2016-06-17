package com.sql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertsql {

	public static void main(String[] args) 
	{
		String driverName="com.mysql.jdbc.Driver";
		String connectionString="jdbc:mysql://localhost/School";
		String dbuser ="root";
		String dbPassword="shimpy";
		
		try
		{
			Class.forName(driverName);
			Connection connection =DriverManager.getConnection(connectionString,dbuser,dbPassword);
			Statement statement=connection.createStatement();
			StringBuffer query=new StringBuffer("insert into school.hello");
			query.append("(RollNo,Name,Class)values");
			query.append(" (");
			query.append(new Integer(6));
			query.append(",");
			query.append("'Sachin'");
			query.append(",");
			query.append("'PHD'");
			//query.append(",");
			//query.append("'M'");
			query.append(" )");
			
			
			System.out.println(query.toString());
			int executeUpdate =statement.executeUpdate(query.toString());
			
			
			
			if(executeUpdate>0)
			{
				System.out.println("Record has been inserted");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
        catch(SQLException ex)
		{
        	ex.printStackTrace();
		}
	}

}

