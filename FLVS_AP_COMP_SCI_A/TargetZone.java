/**
 * This program takes user input and applies it to the Karvonen Formula using 
 * if statements.
 * @author William Isaac O'Hern
 * @version 10/16/2014
 **/

import java.util.Scanner;

public class TargetZone
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int maxHeartRate;
	int heartRateReserve;
	double upperRate;
	double lowerRate;
	
	System.out.print("Enter your age: ");
	int age = in.nextInt();
	System.out.println();
	
	System.out.print("Enter your heart rate: ");
	int restingRate = in.nextInt();
	System.out.println();
	
	System.out.print("Enter your heart rate after excercise: ");
	int exercisedRate = in.nextInt();
	System.out.println();
	
	maxHeartRate = 220 - restingRate;
	heartRateReserve = maxHeartRate - restingRate;
	upperRate = heartRateReserve * 0.85 + restingRate;
	lowerRate = heartRateReserve * 0.50 + restingRate;

	System.out.println("After exercising your target heart rate is between " +
			   lowerRate + " and " + upperRate);
			   
	if(exercisedRate > upperRate){
	    System.out.println("Slow down your exercising too intensly!");
	} else if(exercisedRate < lowerRate) {
	    System.out.println("You can work a little harder than that!");
	} else {
	    System.out.println("That's perfect, keep it up!");
	}
    }
}
