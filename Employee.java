package com.collabera.retailtester;

public class Employee extends Person
{
	private int rank, office_number;
	private String team, hire_date, exit_date;
	private Boolean active = true;
	Schedule schedule;
	//Department department;
	
	
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	//public Schedule getSchedule() {
		//return schedule;
	//}
	 
	public Employee(int rank, int office_number, String team, String hire_date, String exit_date, Boolean active, String name, int emplid, int age, Address address) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
		this.office_number=office_number;
		this.team=team;
		this.hire_date=hire_date;
		this.exit_date=exit_date;
		this.active=active;
	
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	//Getters/Setters
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getOffice_number() {
		return office_number;
	}
	public void setOffice_number(int office_number) {
		this.office_number = office_number;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getExit_date() {
		return exit_date;
	}
	public void setExit_date(String exit_date) {
		this.exit_date = exit_date;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [rank=" + rank + ", office_number=" + office_number + ", team=" + team + ", hire_date="
				+ hire_date + ", exit_date=" + exit_date + ", active=" + active + "  ]";
	}
}
