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
	double pound;

        double feetPerMile = 5280;
	double kilometersPerMile = 1.60934;
	double litersPerGallon = 3.78541;
	double kilogramsPerPound = 0.453592;
	double pintsPerGallon = 8;

    	System.out.println("Feet to Miles");
	feet = 1000;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

	System.out.println("\nMiles to Feet");
	miles = 1000;
	feet = miles * feetPerMile;
	System.out.println(miles + " mi. = " + feet + " ft.");
    }//end of main method
}//end of class
