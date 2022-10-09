package com.satyam.javabasics;

public class Javacontrolstatementsdemo {

	public static void main(String[] args) {
		/*There two types of control statements in java:
		 * 1. Branching or Selective statements: Required to execute a block of statements when a condition is true 
		 * 		1.1 If construct syntax:
		 * 			if(condition)
		 * 			{ //begin block
		 * 				stmt1;
		 * 				stmt2;
		 * 				....
		 * 			}
		 * 		1.1.1
		 * 			if(condition)
		 * 			{ //begin block
		 * 				stmt1;
		 * 				stmt2;
		 * 				....
		 * 			}else
		 * 			{
		 * 
		 * 				stmt1;
		 * 				stmt2;
		 * 				...........
		 * 			}
		 * 
		 * 	1.1.2
		 * if(condition1)
		 * 			{ //begin block
		 * 				stmt1;
		 * 				stmt2;
		 * 				....
		 * 			}else if(condition2)
		 * 			{
		 * 
		 * 				stmt1;
		 * 				stmt2;
		 * 				...........
		 * 			}
		 * 			else
		 * 			{
		 * 
		 * 				stmt1;
		 * 				stmt2;
		 * 				...........
		 * 			}
		 * 
		 * 1.2 switch...case construct : When we need to check for an exact match in a variable, swith... case is used. It improves readability of program when
		 * 		compared with if construct.
		 * 		syntax:
		 * 		switch(variable)
		 * 		{
		 * 			case value1 : stmt1;
		 * 						  stmt2;
		 * 							break;
		 * 			case value2 : stmt1;
		 * 							stmt2;
		 * 							break;
		 * 			....
		 * 			default : stmt1;
		 * 						stmt2;
		 * 		}	
		 * 
		 * 			
		 * 2. Looping or Iterative statements: Whenever we need to execute a block of statements repeatedly until a condition is true
		 * 
		 * 		1. while
		 *      2. do..while
		 *      3. for
		 *      4. for each loop
		 *      
		 *    1.while loop syntax
		 *       while(condition)
		 *       {
		 *       	stmt1;
		 *       	stmt2;
		 *       	stmt3;
		 *       	....
		 *       }
		 *       
		 *    2. do...while loop
		 *    do{
		 *       	stmt1;
		 *       	stmt2;
		 *       	stmt3;
		 *       	....
		 *       }while(condition);
		 *       
		 *       
		 *    3. for loop
		 *    for( initialization; condition; increment/decrement)
		 *    	{
		 *       	stmt1;
		 *       	stmt2;
		 *       	stmt3;
		 *       	....
		 *       }
		 *      
		 */
		
		System.out.println("Demo for while loop:");
		System.out.println("Printing 10 even numbers");
		int evenNumber=2;
		while(evenNumber<=10)
		{
			System.out.println(evenNumber);
			evenNumber+=2;
		}
		
		System.out.println("\nPrinting odd numbers upto 10");
		
		int oddNumber=1;
		//an array declared to store odd numbers
		int odds[]=new int[5];
		int index=0;
		do {
			System.out.println(oddNumber);
			odds[index]=oddNumber;
			oddNumber+=2;
			index++;
			
		}while(oddNumber<=10);
		
		System.out.println("\nPrinting table of 2");
		
		for(int i=1;i<=10;i++)
		System.out.println("2 x "+i+" = "+2*i);
		
		System.out.println("\nPrinting odd array:");
		//display odd array
		for(int x : odds)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		

	}

}
