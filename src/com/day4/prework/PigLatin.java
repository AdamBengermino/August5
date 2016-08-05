package com.day4.prework;

import java.util.Scanner;

public class PigLatin 
{
	private static boolean piggyLatin = true; 
	
	public static void main(String[] args) 
	{
		while (piggyLatin == true) 
		{
			Scanner latin = new Scanner(System.in);
			System.out.println("Please type the word you want to translate to Pig Latin.");
			String userInput = latin.nextLine();
			userInput = userInput.toLowerCase();
			StringBuilder modUserInput = new StringBuilder(userInput);
			char firstLetter = modUserInput.charAt(0);
			if (isFirstLetterVowel(firstLetter)) {
				modUserInput.append("ay");
				System.out.println(modUserInput);
			} else {
				modUserInput.append(firstLetter);
				modUserInput.deleteCharAt(0);
				modUserInput.append("ay");
				System.out.println(modUserInput + "\n");
			} 
		}
	
	}

	public static boolean isFirstLetterVowel(char firstLetter)
	{
	char[] vowel = {'a', 'e', 'i', 'o', 'u'};
	boolean isThisAVowel = false;
		for(int i = 0; i < vowel.length; i++)
		{
			if(firstLetter == vowel[i])
			{
				isThisAVowel = true; 
			}
		}
		return isThisAVowel; 
	}
	
	
	
}
