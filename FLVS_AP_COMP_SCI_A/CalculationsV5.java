// This is a Simple program uses the basic arithmatic functions in java

public class CalculationsV5
{
        public static void main(String[ ]args)
        {
        // Addition
        int iAdd1 = 1;
        int iAdd2 = 2;
        double dAdd3 = 3.45;
	double dAdd4 = 6.789;
        System.out.println("Addition");
        System.out.println("1. 1 + 2 = " + (iAdd1 + iAdd2));
        System.out.println("2. 3.45 + 6.789 = " + (dAdd3 + dAdd4));
                                     
        int iSub1 = 53;
        int iSub2 = 12;
        double dSub3 = 6.22;
        double dSub4 = 42.24;
        System.out.println("\nSubtraction");
        System.out.println("3. 53 - 12 = " + (iSub1 - iSub2));
        System.out.println("4. 6.22 - 42.24 = " + (dSub3 - dSub4));
                    
        int iMul1 = 18;
        int iMul2 = 0;
        int iMul3 = 831;
        double dMul4 = 3.14;
        double dMul5 = 2.43;
        System.out.println("\nMultiplication");
        System.out.println("5. 18 * 0 * 831 - " + (iMul1 * iMul2 * iMul3)); 
        System.out.println("6. 3.14 * 2.43 = " + (dMul4 * dMul5));
        }
}
