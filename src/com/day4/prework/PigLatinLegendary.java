package com.day4.prework;

import java.util.Scanner;

public class PigLatinLegendary {
	private static boolean piggyLatin = true;

	public static void main(String[] args) 
	{
		while (piggyLatin == true) 
		{
			Scanner latin = new Scanner(System.in);

			System.out.println();
			System.out.println("\nPlease type the sentence you want to translate into Pig Latin.");
			String sentenceToTrans = latin.nextLine();
			String[] wordsInSentence = sentenceToTrans.split("\\s");

			for (int i = 0; i < wordsInSentence.length; i++) 
			{
				StringBuilder modWordsInSentence = new StringBuilder(wordsInSentence[i]);
				char firstLetter = modWordsInSentence.charAt(0);
				char secondLetter = modWordsInSentence.charAt(1);
				if (isFirstLetterVowel(firstLetter)) {
					modWordsInSentence.append("ay ");
					System.out.print(modWordsInSentence);
				} 
				
				else if (isACluster(secondLetter))
				{ 
					modWordsInSentence.append(firstLetter);
					modWordsInSentence.append(secondLetter);
					modWordsInSentence.deleteCharAt(0);
					modWordsInSentence.deleteCharAt(0);
					modWordsInSentence.append("ay "); 
					
					System.out.print(modWordsInSentence);
				}
				else 
				{
					modWordsInSentence.append(firstLetter);
					modWordsInSentence.deleteCharAt(0);
					modWordsInSentence.append("ay ");
					System.out.print(modWordsInSentence);

				}
			}
		}
	}

	public static boolean isFirstLetterVowel(char firstLetter) 
	{
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
		boolean isThisAVowel = false;
		for (int i = 0; i < vowel.length; i++) {
			if (firstLetter == vowel[i]) {
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
