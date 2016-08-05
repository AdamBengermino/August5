package com.day4.prework;

import java.util.Scanner;

public class StringEquality 
{
	public static void main(String[] args) 
	{
		Scanner alien = new Scanner(System.in); 
		
		System.out.println("How is your day?");
		
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase()) 
		{
		case "great":
			System.out.println("Great to hear!");
			break;
		case "bad":
			System.out.println("I'm sorry.");
			break; 
		default:
			System.out.println("What?");
			break;
		}
	}
}
