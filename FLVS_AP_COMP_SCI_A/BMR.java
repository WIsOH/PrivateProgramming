/**
 * The purpose of this program is to determine a patients Basal Metabolic Rate
 * based on their input to the program
 *
 * @author William Isaac O"Hern
 * @version 10/16/2014
 **/

import java.util.Scanner;

public class BMR
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	double poundsToKg = 0.453592;
	double inchesToCm = 2.54;
	double weightInKg;
	double heightInCm;

	System.out.print("Enter your name: ");
	String name = in.nextLine();

	System.out.print("M or F: ");
	String gender = in.next();
	

	System.out.print("Please enter your age: ");
	int age = in.nextInt();
	
	System.out.print("Please enter your height in inches: ");
	int height = in.nextInt();
	
	System.out.print("Please enter your weight: ");
	int weight = in.nextInt();
	System.out.println();
	System.out.println();

	gender = gender.toUpperCase();
	weightInKg = weight * poundsToKg;
	heightInCm = height * inchesToCm;
	double basalMR;

	if(gender == "M")
	{
	    basalMR = 13.397 * weightInKg + 4.799 * heightInCm - 5.677 * age + 88.362;
	} else {
	    basalMR = 9.247 * weightInKg + 3.098 * heightInCm - 4.330 * age + 447.593;
	}
	basalMR *= 10;
	basalMR = (int) basalMR;
	basalMR = (double) basalMR / 10;
	
	System.out.println("Calculate your basal metabolism");
	System.out.println();
	System.out.println("Name: " + name);
	System.out.println("Gender: " + gender);
	System.out.println("Age: " + age);
	System.out.println("Weight (kg): " + weightInKg);
	System.out.println("Height (cm): " + heightInCm);
	System.out.println("Your Basal Metabolism Rate is " + basalMR + " calories a day");
    }
}
