package com.collabera.retailtester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Schedule 
{
	String day = null;
	String shiftStart = null;
	String shiftEnd = null;
	
	
	public String getDay() {
		return day;
	}



	public void setDay(String day) {
		this.day = day;
	}



	public String getShiftStart() {
		return shiftStart;
	}



	public void setShiftStart(String shiftStart) {
		this.shiftStart = shiftStart;
	}



	public String getShiftEnd() {
		return shiftEnd;
	}



	public void setShiftEnd(String shiftEnd) {
		this.shiftEnd = shiftEnd;
	}
	
	
	
	public static void schedule( ) throws FileNotFoundException
	{
		Map <String, String> schedule = new HashMap<String, String>();
		
		File infile = new File("C:\\Java_Workspace\\ProjectTester\\bin\\com\\collabera\\retailtester\\schedule.txt");
		Scanner scan = new Scanner(infile);
		
		//read in from file 
	//	FileInputStream inStream = new FileInputStream(infile);
		while (scan.hasNext()) {
			String[] work_times = scan.nextLine().split(" ");
			schedule.put(work_times[0], work_times[1]);
}
	}
}
