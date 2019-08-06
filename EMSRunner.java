package com.collabera.retailtester;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.collabera.retailtester.utilities.Validations;


public class EMSRunner {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	// sets information for employee. Uses Person, Address, and Employee classes
	public static void person() {
		
		Address address;
		Employee employee;

		int apartment;
		address = new Address();
		employee = new Employee();

		employee.setName(Validations.CheckString("Please enter a name: ", "Enter a valid name in letters only"));
		employee.setEmplid(Validations.checkInt("Please enter Employee ID#:  ", "Employee id only with numbers"));
		employee.setAge(Validations.checkInt("Please enter Employee age:  ","Age should be numbers only"));
		address.setDoorNumber(Validations.checkInt("Please enter street number: ", "Street Number should be numbers only"));
		address.setStreet(Validations.CheckString("Please enter Street Name: ", "Street should be letters only"));
		address.setCity(Validations.CheckString("Please enter city: ", "City should be letters only"));
		address.setState(Validations.CheckString("Please enter State Name: ", "It should be a valid state; letters only"));
		address.setZip(Validations.checkInt("Please enter your ZIP Code: ", "ZIP code should be numbers only"));

		
		System.out.print("Do you have an apartment number? Enter (Yes/No). ");
		String apt = scan.next();
		if (apt.equals("yes")) {
			System.out.print("Please enter your apartment number: ");
			apartment = scan.nextInt();
			address.setApartment(apartment);

		} else {
			apartment = 0;
			address.setApartment(apartment);
		}
		
		employee.setRank(Validations.checkInt("Please enter Employee's rank: ", "Employee Rank should be numbers only"));
		employee.setOffice_number(Validations.checkInt("Please enter your office number: ", "Office Number should be numbers only"));

		employee.setTeam(Validations.CheckString("Enter Team Name: ", "Team Name needs to be valid; letters only"));
		
		employee.setHire_date(Validations.CheckDate("Enter Hire Date (YYYY-MM-DD):" , "Date needs to be valid in Month/Day/Year format."));

		System.out.print("Is the employee active (Yes/No)");
		String var = scan.next();
	//	scan.next();
		if (var.equals("Yes") || var.equals("yes")) {
			employee.setActive(true);
		scan.nextLine();

		} else if (var.equals("No")||var.equals("no")) {
		
			employee.setExit_date(Validations.CheckDate("Enter Exit Date  (YYYY-MM-DD): ", "Exit Date needs to be letter format."));
			employee.setActive(false);
			scan.nextLine();
		
		}
		employee.setAddress(address);

		employeeList.add(employee);
		EmployeeDB.addEmployee(employee);
		// for debugging
		System.out.println("Employee name: " + employee.getName() + "Employee ID Number: " + employee.getEmplid()
				+ "Employee age: " + employee.getAge() + " ");
		System.out.println("Address: " + "Number: " + address.getDoorNumber() + "Street Name: " + address.getStreet()
				+ "City: " + address.getCity() + "State:  " + address.getState() + "Zipcode: " + address.getZip()
				+ "Apartment Number: " + address.getApartment() + " ");
		System.out.println("Internal Information: " + "Rank: " + employee.getRank() + "Extension: "
				+ employee.getOffice_number() + "Team Name: " + employee.getTeam() + "Start Date: "
				+ employee.getHire_date() + "Current or Former employee: " + employee.getActive() + "Exit Date:  "
				+ employee.getExit_date() + " ");
		System.out.println("Press enter to continue");
		//scan.nextLine();
		
		for (int j = 0; j < employeeList.size(); j++) {

			System.out.println(employeeList.get(j).toString());
			
			
		}
		
		

	}
		
		public static void viewEmployee() {
			for (int i = 0; i < employeeList.size(); i++) {
				System.out.println(employeeList.get(i).toString());
			}

		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		int i = 0;
		Person person = new Person();
		Address address = new Address();
		Employee employee = new Employee();
		Salary salary = new Salary();
		Taxes taxes = new Taxes();
		taxes.getFederaltax();
		taxes.getStatetax();
		Schedule schedule = new Schedule();

		int hours = 0;
		double rate = 0;
		double pay = 0;

		boolean IsInputValid = false;
		// actual menu
		while (!IsInputValid) {
			System.out.println("Select your option: ");
			System.out.println("1.Employee");
			System.out.println("2.Add Employee");
			System.out.println("3.Exit");

			boolean check = true;
			try {
				option = scan.nextInt();
				
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				// e2.printStackTrace();
				System.out.println("Please enter number only");
				check = false;
			}
			scan.nextLine();
			if ((option <= 0 || option > 3) && check) {
				System.out.println("Please enter number from 1 to 3 only");
			}
			if (option == 1) {

				while (true) {

					System.out.println("1.View Schedule");
					// TODO create a calendar that allows for hours calculation
					System.out.println("2.View hours");
					// TODO create method to allow for hours worked so far
					System.out.println("3.View pay");
					int sub_option = 0;
					boolean check1 = true;
					try {
						sub_option = scan.nextInt();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(" ERROR : Please enter number only");
						check1 = false;

					}
					scan.nextLine();
					if ((sub_option <= 0 || sub_option > 3) && check1) {
						System.out.println("Please enter number from 1 to 3 only");
					}
					if (sub_option == 3) {
						IsInputValid = true;
						salary.CalcSalary(hours, rate, pay);
					}

				}

			} else if (option == 2) {

				while (true) {

					System.out.println("1.Enter Employee");
					System.out.println("2.View Employee");
					System.out.println("3.Change employee status");

					int sub_option = 0;
					boolean check2 = true;
					try {
						sub_option = scan.nextInt();
					} catch (Exception e) {
						System.out.println("ERROR : Please enter number only");
						check2 = false;
					}
					Employee e1 = new Employee();
					if (sub_option == 1) {
						//scan.nextLine();
						person();
					}

					if (sub_option == 2) {
						scan.nextLine();
						viewEmployee();
					}
				//	scan.next();
					if ((sub_option <= 0 || sub_option > 3) && check2) {
						System.out.println("Please enter number from 1 to 3 only");
					}

				}

			} else if (option == 3) {
				System.out.println("Thank you for using our EMS");
				break;
			}
		
			
	
		

		}

	}

}


