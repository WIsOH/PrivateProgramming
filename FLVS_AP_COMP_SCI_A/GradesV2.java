/**
*GradesV2
*@Author Isaac O'Hern
*/

public class GradesV2 {
    static int numTests = 0;
    static int testGrade = 0;
    static int totalPoints = 0;
    static double average = 0.0;

    public static void printGrades(int newGr)
    {
	testGrade = newGr;
	numTests++;
	totalPoints += testGrade;
	average = (double)totalPoints / numTests;

	System.out.println("n = " + numTests + 
	" New Test Grade: " + testGrade + 
	" Total Points: " + totalPoints +
	"\tAverage Score: " + average);
    }

    public static void main(String args[])
    {
	printGrades(97);
	printGrades(96);
	printGrades(98);
	printGrades(57);
    }
}
