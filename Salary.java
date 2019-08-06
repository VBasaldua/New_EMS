package com.collabera.retailtester;

import java.util.Scanner;

public class Salary 
{
	private String employeeName;
	private int hour;
	private double rate;
	private double pay;
	private int overtime;
	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public double CalcSalary(int hours, double rate, double pay) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many hours have you worked this week?");
		hours = scan.nextInt();
		System.out.println(hours);
		Taxes taxes = new Taxes();
	
		taxes.getStatetax();
		taxes.getFederaltax();
		System.out.println("Enter your pay rate: ");
		rate = scan.nextDouble();
		System.out.println(rate);
		if (hours > 40) {
			int overTime = hours - 40;
			pay = (40 * rate) + (overTime * rate * 1.5);
		} else {
			pay = hours * rate;
		}
		System.out.println("You have a gross salary of: " + pay);
		System.out.println("Taxes Applied: " + (pay-taxes.getFederaltax()-taxes.getStatetax()));
		return pay;
	}
	
	


	public void DisplayEmployeeName() {
		// TODO Auto-generated method stub
		System.out.printf("Enter Employee's Name: %s", getEmployeeName());
		System.out.printf("\nGross Salary: %2f", +pay);
	
		
	}
}
