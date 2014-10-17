/**
 * The purpose of this program is to use user input to calculate BMI.
 *
 * @author William Isaac O'Hern
 * @version 10/16/2014
 **/

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	double poundsToKg = 0.453592;
	double inchesToCm = 2.54;
	double weightInKg;
	double heightInCm;
	double heightInM;
	double bodyMI;

	System.out.print("Please enter your name: ");
	String name = in.nextLine();

	System.out.print("Please enter your weight in lbs.: ");
	int weight = in.nextInt();

	System.out.print("Please enter your height in feet inches with a " +
		"Space seperating (eg. 5 11): ");
	int feet = in.nextInt();
	int inches = in.nextInt();
	int height = feet * 12 + inches;
	System.out.println('\n');

	weightInKg = weight * poundsToKg;
	heightInCm = height * inchesToCm;
	heightInM = heightInCm / 100;

	bodyMI = weightInKg / (heightInM * heightInM);

	System.out.println("BMI Calculator");
	System.out.println("#################################################");
	System.out.println("Name: " + name);
	System.out.println("Height (m): " + heightInM);
	System.out.println("Weight (kg): " + weightInKg);
	System.out.println("BMI: " + bodyMI);

	if(bodyMI < 18.5) {
	    System.out.println("You are underweight");
	} else if(18.5 <= bodyMI && bodyMI < 25) {
	    System.out.println("You are in the normal weight range");
	} else if(25 <= bodyMI && bodyMI < 30) {
	    System.out.println("You are overweight");
	} else {
	    System.out.println("You are obese");
	}
    }
}
