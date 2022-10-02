package com.satyam.javabasics;

import java.util.Scanner;

/*check wheather the employee code is valid or not.*/

public class Ifdemo {

	public static void main(String[] args) {
		// Create input stream object to accept input from user
		Scanner sc=new Scanner(System.in);
		
		//prompt the user for employee code(numeric)
		System.out.println("Enter employee code(an integer):");
		int empCode=sc.nextInt();
		
		if(empCode==0)
		{
			System.out.println("Enter valid code! It can not be ZERO");
		}else if(empCode>=0)
		{
				System.out.println("Welcome prasad");
		}else
		{
			System.out.println("Valid employee code");
		}
		
		//close any stream objects you have opened before
		sc.close();
	}

}
