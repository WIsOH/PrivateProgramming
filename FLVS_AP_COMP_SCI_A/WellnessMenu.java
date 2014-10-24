/*
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author William Isaac O"Hern 
 * @version 10/24/2014
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

	String selection;
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.println();
        
	selection = in.next().toUpperCase();
	System.out.println(selection);

        if(selection.equals("A"))
	{
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if(selection.equals("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
            System.out.println("Testing: You chose B for BMR");
        }
        else if (selection.equals("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("Testing: You chose C for Healthy Eating");
        }
        else if (selection.equals("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("Testing: You chose D for Food Pyramid");
        }
        else if (selection.equals("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("Testing: You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
            System.out.println("Testing: You chose an incorrect option");
        }
    }
}
