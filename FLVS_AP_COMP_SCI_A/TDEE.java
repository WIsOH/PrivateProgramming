/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @author William Isaac O'Hern
 * @version 10/24/2014
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next().toUpperCase();
        System.out.println();

        //Processing:
        // Activity Factor
        double activityFactor;

        // ********************** fill in code here ******************//
	if (gender.equals("M") && choice.equals("A")) {
	    activityFactor = 1.0;
	} else if (gender.equals("M") && choice.equals("B")) {
	    activityFactor = 1.3;
	} else if (gender.equals("M") && choice.equals("C")) {
	    activityFactor = 1.6;
	} else if (gender.equals("M") && choice.equals("D")) {
	    activityFactor = 1.7;
	} else if (gender.equals("M") && choice.equals("E")) {
	    activityFactor = 2.1;
	} else if (gender.equals("M") && choice.equals("F")) {
	    activityFactor = 2.4;
	} else if (gender.equals("F") && choice.equals("A")) {
	    activityFactor = 1.0;
	} else if (gender.equals("F") && choice.equals("B")) {
	    activityFactor = 1.3;
	} else if (gender.equals("F") && choice.equals("C")) {
	    activityFactor = 1.5;
	} else if (gender.equals("F") && choice.equals("D")) {
	    activityFactor = 1.6;
	} else if (gender.equals("F") && choice.equals("E")) {
	    activityFactor = 1.9;
	} else if (gender.equals("F") && choice.equals("F")) {
	    activityFactor = 2.2;
	} else {
	    System.out.println("Please put in valid options");
	    activityFactor = 0;
	};
        // **********************************************************//


        // Calculate TDEE
	double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    }
}
