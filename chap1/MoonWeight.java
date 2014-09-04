/*
	This is a program that answers
	problem 9 in the Chapter 1 Self Test

	Question:
	The moon's gravity is about 17 percent that of earth's.
	Write a program that computers your effective weight on the moon.
*/
class MoonWeight {
	public static void main(String args[]) {
		double earthWeight, moonWeight;

		earthWeight = 157.5;
		moonWeight = earthWeight * 0.17;

		System.out.println("My weight on the moon is: " + moonWeight + " pounds.");
	}
}