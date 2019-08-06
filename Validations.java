package com.collabera.retailtester.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

//checkInt is for the integers
//CheckString is for the String values such as objects

public class Validations {
	
	public static int checkInt(String greetingMsg, String exceptionMsg) {
		Scanner scan = new Scanner(System.in);
		int val=0;
		
		while(true) {
		try {
			System.out.println(greetingMsg);
			val = scan.nextInt();
			if (val>0) {
				
				//scan.next();
				break;
			} else {
				System.out.println("bad int");
			//	scan.next();
			}
			}
			catch(InputMismatchException ex) {
				System.out.println(exceptionMsg);
			scan.next();
			//break;
				
			}
		}
		//scan.close();
		return val;
	}
	
	public static String CheckString(String greetingMsg, String exceptionMsg)
	{
		Scanner scanner = new Scanner(System.in);
		String strValue = null;
		while(true)
		{
			try {
				System.out.println(greetingMsg);
				strValue = scanner.nextLine();
				if (strValue.matches("[^\\d]+")) 
				{
				
				
				//scanner.next();
				break;
			}else 
			{
				System.out.println("Enter a valid word");
			}
			}
			catch(InputMismatchException ex)
			{
				System.out.println(exceptionMsg);
				break;
			}
		}
		//scanner.close();
		return strValue;

}
	
	public static String CheckDate(String greetingMsg, String exceptionMsg)
	{
		Scanner scanner = new Scanner(System.in);
		String Value = null;
		while(true)
		{
			try {
				System.out.println(greetingMsg);
				Value = scanner.nextLine();
				if (Value.matches("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")) {
				
				
				//scanner.next();
				break;
			}else 
			{
				System.out.println("Enter in the valid format.");
				
			}
			}
			catch(InputMismatchException ex)
			{
				System.out.println(exceptionMsg);
				
				break;
			}
		}
		//scanner.close();
		return Value;
	}
	
	
	}


