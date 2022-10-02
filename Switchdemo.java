package com.satyam.javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*check if the employee belongs to 
any of the follwing departments:
	1. O for Operations
	2. M for Marketing
	3. H for HR
	4. I For IT
*/
public class Switchdemo {

	public static void main(String[] args) throws IOException {

		//display a menu
		System.out.println("\t\tMenu");
		System.out.println("1.Operations(O)");
		System.out.println("2.Marketing(M)");
		System.out.println("3.Humanresources(H)");
		System.out.println("4.InformationTechnology(I)");
		//prompt the user to input starting letter of department
		System.out.println("Choose o or m or h or i:");
		//create input stream reader object
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//reads a line as a string, converting it into lower case, getting first character
		char choice=br.readLine().toLowerCase().charAt(0);
		
		System.out.println("The employee belongs to department:");
		switch(choice)
		{
		case 'o' : System.out.println("Operations");break;
		case 'm' : System.out.println("Marketing");break;
		case 'h' : System.out.println("Humanresources");break;
		case 'i' : System.out.println("Information technology");break;
		default  : System.out.println("Invalid choice!");
		}
		
	}

}
