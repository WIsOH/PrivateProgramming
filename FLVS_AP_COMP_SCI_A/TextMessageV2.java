/**
*@author Isaac O'Hern
*@version 10/16/2014
*The purpose of this program is to take a message and turn it in to "text 
*message speak" using string functions.
**/

public class TextMessageV1 
{
    public static void main(String arg[])
    {
	String Message = "laughing out loud at that picture, ive gtg because I have a bunch of homework";
	String textMessage;
	
	textMessage = Message;
	textMessage = textMessage.replaceAll("laughing out loud", "lol");
	textMessage = textMessage.replaceAll("picture", "pic");
	textMessage = textMessage.replaceAll("homework", "hw");
	textMessage = textMessage.replaceAll("because", "cuz");

	System.out.println("Original Message:\n" + Message);
	System.out.println("message length: " + textMessage.length() + " characters");
	System.out.println();
	System.out.println("New Message:\n" + textMessage);
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
