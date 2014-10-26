/**
 * Program that allows user to pick random number selected by computer.
 *
 * @author William Isaac O'Hern
 * @version 4/25/2014
 **/

import java.util.Scanner;

public class GuessingGameV2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int rangeLow;
		int rangeHigh;
		int randNum;
		int chosenNum;
		
		System.out.println("Please select two numbers seperated by a" +
				"space low number first (eg: 10 60)");
		rangeLow = in.nextInt();
		rangeHigh = in.nextInt();

		randNum = rangeLow + (int)(Math.random() * ((rangeHigh -
						rangeLow) + 1));

		System.out.println("Please select a number in the range as " +
			"your guess for the guessing game");
		chosenNum = in.nextInt();

		while(chosenNum != randNum) {
			if(chosenNum < randNum) {
				System.out.println("Try higher next time!");
			} else if(chosenNum > randNum) {
				System.out.println("Try lower next time!");
			}
 
			System.out.println("Please try again");
			chosenNum = in.nextInt();
		}

		System.out.println("That's the correct number!");
	}
}
