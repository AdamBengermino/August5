package com.day4.prework;

import java.util.Scanner;

public class WorkingWithCharArrays 
{
	public static void main(String[] args) 
	{
	StringBuilder stuffNThings = new StringBuilder("Hi Jason"); 	
	
	char[] sayHiClass = {'H', 'i', ' ', 'C', 'l', 'a', 's', 's'}; 
	
	String sayingHiClass = new String(sayHiClass);
			
	System.out.println(sayingHiClass);
	
	String stuff = "SUPER";
			
	System.out.println(stuff.toLowerCase());
	System.out.println(stuffNThings.deleteCharAt(0));
	System.out.println(stuffNThings.deleteCharAt(2));
	System.out.println(stuffNThings.deleteCharAt(2));
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("What is your name?");
	String userInput = sc.nextLine(); 
	System.out.println(userInput);
	StringBuilder modUserInput = new StringBuilder(userInput); 
	char firstLetter = modUserInput.charAt(0); 
	
	System.out.println(firstLetter);
	
	modUserInput.deleteCharAt(0); 
	System.out.println(modUserInput);
	modUserInput.insert(0, 'x');
	System.out.println(modUserInput);
	
	char[] hi = {'h', 'i', ' '};
	modUserInput.insert(0, hi); 
	System.out.println(modUserInput);
	
	System.out.println(modUserInput.append(hi));
	
//	for(int day = 0; day <= 8; day ++)
//	{
//	switch (day) {
//	case 1: 
//		happyDay(day);
//		break;
//	case 2:
//		happyDay(day);
//		break;
//	default:
//		thatsNotADay(day);
//		break;
//	}
//	}
//	private static void happyDay(int day)
	{
		System.out.println("Have a great day!");
	}
	}

	private static void thatsNotADay(int day) 
	{
		System.out.println("There are only 7 days in a week.");		
	}
}
