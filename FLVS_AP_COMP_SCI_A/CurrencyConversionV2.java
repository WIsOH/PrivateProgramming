/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 13.3705;          // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;  // local variable for dollars spent in Mexico
	double eurosSpent = 624.95;
	double euroExchangeRate = 0.789675;
	double dollarsSpentInFrance = 0.0;
	double yenSpent = 99939.75;
	double yenExchangeRate = 108.0338;
	double dollarsSpentInJapan = 0.0;
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
	dollarsSpentInMexico = pesosSpent / pesoExchangeRate;

        // convertion for Japanese yen
	dollarsSpentInJapan = yenSpent / yenExchangeRate;

        // convertion for Euros
	dollarsSpentInFrance = eurosSpent / euroExchangeRate;

	remainingUsDollars = startingUsDollars - dollarsSpentInFrance - dollarsSpentInJapan -
	dollarsSpentInMexico;

        //print output to the screen
	System.out.println("Starting US Dollars\t\t\t" + startingUsDollars);
	System.out.println("US Dollars Spent In Mexico \t\t" + dollarsSpentInMexico);
	System.out.println("US Dollars Spent In Japan  \t\t" + dollarsSpentInJapan);
	System.out.println("US Dollars Spent In France \t\t" + dollarsSpentInFrance);
	System.out.println("=================================================");
	System.out.println("US Dollars Remaining\t\t\t" + remainingUsDollars);
	
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = budget1 / costItem1; 		//how many items can be purchased
		double fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = budget2 / (int)costItem2; 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
