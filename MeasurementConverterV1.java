/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 ******************************************************
 *PMR:
 *The assignment was fairly simple it was just slightly
 *tedious to write it out all the conversions when it 
 *was pretty much the same thing.
 ******************************************************
 * Modified by: Isaac O'Hern
 * Date: 10/11/14
 */

public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;
	double kilometers;
	double liters;
	double gallons;
	double pints;
	double kilograms;
	double pounds;

        double feetPerMile = 5280;
	double kilometersPerMile = 1.60934;
	double litersPerGallon = 3.78541;
	double kilogramsPerPound = 0.453592;
	double pintsPerGallon = 8;

	System.out.println("Conversion for various units of 1000");
	System.out.println("************************************");

    	System.out.println("Feet to Miles");
	feet = 1000;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

	System.out.println("\nMiles to Feet");
	miles = 1000;
	feet = miles * feetPerMile;
	System.out.println(miles + " mi. = " + feet + " ft.");
	
	System.out.println("\nKilometers to Miles");
	kilometers = 1000;
	miles = kilometers / kilometersPerMile;
	System.out.println(kilometers + " km. = " + miles + " mi.");
	
	System.out.println("\nMiles to Kilometers");
	miles = 1000;
	kilometers = miles *  kilometersPerMile;
	System.out.println(miles + " mi. = " + kilometers + " km.");
	
    	System.out.println("\nLiters to Gallons");
	liters = 1000;
	gallons = liters / litersPerGallon;
        System.out.println(liters + " L = " + gallons + " Gal.");

    	System.out.println("\nGallons to Liters");
	gallons = 1000;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " Gal. = " + liters + " L");

    	System.out.println("\nKilograms to Pounds");
	kilograms = 1000;
        pounds = kilograms / kilogramsPerPound;
        System.out.println(kilograms + " kg = " + pounds + " lbs.");

    	System.out.println("\nPounds to Kilograms");
	pounds = 1000;
        kilograms = pounds * kilogramsPerPound;
        System.out.println(pounds + " lbs. = " + kilograms + " kg");

	System.out.println("\nPints to Gallons");
	pints = 1000;
	gallons = pints / pintsPerGallon;
	System.out.println(pints + " pt. = " + gallons + "gal.");

	System.out.println("\nGallons to Pints");
	gallons = 1000;
	pints = gallons * pintsPerGallon;
	System.out.println(gallons + " gal. = " + pints + " pt.");
    }//end of main method
}//end of class
