/**
 * The purpose of this program is to take user input and calcuate a fine for a 
 * late book and create an email format message to inform the person who has the
 * book out.
 *
 * @author William Isaac O'Hern
 * @version 10/16/2014
 **/

import java.util.Scanner;

public class 
Fines
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	double totalFine;
	String userName;

	System.out.println("Welcome to the Media Center fine assesment Program");

	System.out.print("Please type your last name followed by your first" +
			 " name and then your SSN in ###-##-#### format " +
			 "seperated by spaces: ");

	String lastName = in.next();
	String firstName = in.next();
	String socialSecurityNumber = in.next();
	System.out.println();

	System.out.print("Please enter the book that is overdue: ");
	in.next();
	String overdueBook = in.nextLine();
	System.out.println();

	System.out.print("Please enter the date the book was checked out in " +
		"mm/dd/yyyy format: ");
	String dateCheckedOut = in.nextLine();
	System.out.println();

	System.out.print("Please enter the number of days the book is late: ");
	int daysLate = Integer.parseInt(in.nextLine());
	System.out.println();

	System.out.print("Please enter the daily fine rate as a string in x.xx format: ");
	double dailyRate = Double.parseDouble(in.nextLine());
	System.out.println();
	System.out.println();

	totalFine = daysLate * dailyRate;
	userName = firstName + '-' + socialSecurityNumber.substring(7);
	
	System.out.println("To: " + lastName + ", " + firstName + "\t\t\t" +
			   userName);
	System.out.println("From: Mona");
	System.out.println("Subject: Overdue Charge");
	System.out.println("#################################################");
	System.out.println("The book " + overdueBook + " was checked out on " +
			    dateCheckedOut);
	System.out.println("The book is currently " + daysLate + " days late");
	System.out.println("You owe $" + totalFine); 
    }
}
