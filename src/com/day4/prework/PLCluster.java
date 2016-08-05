package com.day4.prework;

import java.util.Scanner;

public class PLCluster 
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
				char secondLetter = modUserInput.charAt(1);
				if (isFirstLetterVowel(firstLetter)) 
				{
					modUserInput.append("ay");
					System.out.println(modUserInput);
	 
				} 
				else if (isACluster(secondLetter))
				{ 
					modUserInput.append(firstLetter);
					modUserInput.append(secondLetter);
					modUserInput.deleteCharAt(0);
					modUserInput.deleteCharAt(0);
					modUserInput.append("ay"); 
					
					System.out.println(modUserInput);
				}
				else
				{
					modUserInput.append(firstLetter + "ay"); 
					modUserInput.deleteCharAt(0); 
					
					System.out.println(modUserInput);
					System.out.println();
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
		
		public static boolean isACluster(char secondLetter)
		{
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		boolean isACluster = true;
		for(int i = 0; i < vowel.length; i++)
		 {
			 if(secondLetter == vowel[i])
			 {
				 isACluster = false; 
			 }
		}
			return isACluster;
			
		}
		
		
}


