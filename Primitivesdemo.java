package com.satyam.primitives;

import static java.lang.System.out;
public class Primitivesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte myInitial='D';
		char myNameStartswith='S';
		boolean myJobStatus=true;
		short myAge=25;
		int myLuckyNumber=123456789;
		float myPocketMoney=5230.00f;
		double distanceToMoon=384400000;
		long speedOfLight=3*10^8L;
		
		out.println("My initial:"+Byte.toString(myInitial));
		out.println("My name starts with "+myNameStartswith);
		out.println("I am in my dream job..."+myJobStatus);
		out.println("My age is "+myAge+" years");
		out.println("My lucky number is:"+myLuckyNumber);
		out.printf("I have pocket money Rs.%.2f",myPocketMoney);
		out.println("\nThe distance to moon from our motherpalnet is:"+distanceToMoon+ " meters");
		out.println("I will travel this distance with light speed of "+speedOfLight+" if I were the astronaut");
		
		
		
		
		
		

	}

}
