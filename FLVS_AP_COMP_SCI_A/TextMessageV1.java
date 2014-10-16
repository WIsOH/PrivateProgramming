/**
*@author Isaac O'Hern
*@version 10/16/2014
**/

public class TextMessageV1 
{
    public static void main(String arg[])
    {
	String Message = "laughing out loud at that picture, ive got to go because I have a bunch of homework";
	String textMessage;
	
	textMessage = Message;
	textMessage = textMessage.replaceAll("laughing out loud", "lol");
	textMessage = textMessage.replaceAll("got to go", "gtg");
	textMessage = textMessage.replaceAll("picture", "pic");
	textMessage = textMessage.replaceAll("homework", "hw");
	textMessage = textMessage.replaceAll("because", "cuz");

	System.out.println("Original Message:\n" + Message);
	System.out.println();
	System.out.println("New Message:\n" + textMessage);
	System.out.println();

	System.out.println("String Method Samples");
	System.out.println("Index of \"P\": " + textMessage.indexOf('p'));
    }
}
