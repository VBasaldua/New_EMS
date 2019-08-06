package com.collabera.retailtester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



import com.collabera.retailtester.Employee;

public class EmployeeDB {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		System.out.println();
		
		
	}
		
	public static boolean addEmployee(Employee emp)
	{
		// TODO Auto-generated method stub
		try {
			String s = null;
			Scanner scan = new Scanner(System.in);
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = CollectionsManager.getConnection();
			
			PreparedStatement statement = con.prepareStatement("insert into neoems.employee values(?,?,?,?)");
			statement.setInt(1, emp.getEmplid());
			statement.setString(2, emp.getName());
			statement.setInt(3, emp.getAge());
			statement.setString(4, emp.getTeam());
		
		//Checks on 
			
		
		
//Look Over Query Problems in mySQL and Java, ResultSet, PreparedStatements, and connections.
			int count = statement.executeUpdate();
			System.out.println("NO of records inserted: " + count);
			
			if(count>0)
				return true;

				

			statement.close();
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		

	}

}
