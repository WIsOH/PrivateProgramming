/**
*@author Isaac O'Hern
*version 10/17/2014
*The purpose of this program is to take a message and turn it in to "text 
*message speak" using string functions. Using a message given by the user.
**/

import java.util.Scanner;

public class TextMessageV2 
{
    public static void main(String arg[])
    {
	Scanner in = new Scanner(System.in);
	String textMessage;
	
	System.out.println("Enter your message");
	String message = in.nextLine();
	System.out.println("You put in: " + message);
	
	textMessage= message;
	textMessage= textMessage.replaceAll("laughing out loud", "lol");
	textMessage= textMessage.replaceAll("picture", "pic");
	textMessage= textMessage.replaceAll("got to go", "gtg");
	textMessage= textMessage.replaceAll("homework", "hw");
	textMessage= textMessage.replaceAll("because", "cuz");

	System.out.println("Original message:\n" + message);
	System.out.println("message length: " + message.length() + " characters");
	System.out.println();
	System.out.println("New message:\n" + textMessage);
	System.out.println("message length: " + textMessage.length() + " characters");
	System.out.println();

	System.out.println("String Method Samples");
	System.out.println("Index of \"P\":\t\t\t\t\t" + textMessage.indexOf('p'));

	int thirdPoint = textMessage.length() / 3;
	System.out.println("substring (two parameters) first third:\t\t" + textMessage.substring(0,thirdPoint));
	System.out.println("substring (one parameter) last third:\t\t" + textMessage.substring(2 * thirdPoint));
	System.out.println("replaceAll HTPICA\'s:\t\t\t\t" + textMessage.replaceAll("[htpica]",""));
    }
}
