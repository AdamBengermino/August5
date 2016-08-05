package com.day4.prework;

public class Scratch 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 110; i++) 
		{
			if(divisibleByAllThree(i)) 
			{
				System.out.println("FizzBuzzBang");
			}
			else if(divisibleByThreeAndFive(i))
			{
				System.out.println("FizzBuzz");
			}
			else if(divisibleByFiveAndSeven(i))
			{
				System.out.println("BuzzBang");
			}
			else if(divisibleByThreeAndSeven(i))
			{
				System.out.println("FizzBang");
			}
			else if(divisibleByThree(i))
			{
				System.out.println("Fizz");
			}
			else if(divisibleByFive(i))
			{
				System.out.println("Buzz");
			}
			else if(divisibleBySeven(i))
			{
				System.out.println("Bang");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static boolean divisibleByAllThree(int fromTheForLoop)
	{
		boolean howsThisMethod = false; 
		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) 
		{
			howsThisMethod = true; 
		}
		
		return howsThisMethod; 
	}
	public static boolean divisibleByThreeAndFive(int fromTheForLoop) 
	{
		boolean howsThis = false;
		if(((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0))
		{
			howsThis = true; 
		}
		return howsThis; 
	}
	public static boolean divisibleByFiveAndSeven(int fromTheForLoop)
	{
		boolean howAbout = false;
		if(((fromTheForLoop % 5) == 0) && (fromTheForLoop % 7) == 0)
		{
			howAbout = true; 
		}
			return howAbout; 
	}
	public static boolean divisibleByThreeAndSeven(int fromTheForLoop)
	{
		boolean blahBlah = false; 
		if(((fromTheForLoop % 3) == 0) && (fromTheForLoop % 7) == 0)
		{
			blahBlah = true; 
		}
		return blahBlah; 
	}
	public static boolean divisibleByThree(int fromTheForLoop)
	{
		boolean aces = false; 
		if(fromTheForLoop % 3 == 0)
		{
			aces = true; 
		}
		return aces; 
	}
	public static boolean divisibleByFive(int fromTheForLoop)
	{
		boolean soccerBall = false; 
		if(fromTheForLoop % 5 == 0)
		{
			soccerBall = true;
		}
		return soccerBall; 
	}
	public static boolean divisibleBySeven(int fromTheForLoop)
	{
		boolean basketWeaving = false;
		if(fromTheForLoop % 7 == 0)
		{
			basketWeaving = true; 
		}
		return basketWeaving; 
	}
	
}
