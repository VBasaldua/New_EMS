package com.collabera.retailtester;

public class Person
{
	private String name;
	private int emplid;
	private int age;
	private Address address;
	
	public Person(String name, int emplid, int age, Address address)
	{
		this.name=name;
		this.emplid=emplid;
		this.age=age;
		this.address=address;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmplid() {
		return emplid;
	}

	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", emplid=" + emplid + ", age=" + age + ", address=" + address.toString() + "]";
	}

}
