package com.collabera.retailtester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollectionsManager {

	static final String URL = "jdbc:mysql://localhost:3306/neoems";
	static final String USERNAME = "root";
	static final String PASSWORD = "Kaioh%Hanma$75";
	
	public static Connection getConnection() throws Exception
	{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}

}
