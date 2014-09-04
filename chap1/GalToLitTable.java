/* 
	Try This 1-2

	This program displays a conversion
	table of gallons to liters.

	Call this program "GalToLitTable.java".
*/
class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;
		int counter;

		counter = 0;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; //convert to liters
			System.out.println(gallons + " gallons is " +
								liters + " liters.");
			counter++;
			// every 10th line, print a blank line
			if(counter == 10) {
				System.out.println();
				counter = 0; // reset the line counter
			}
		}

		// the following code answer problem 11 on
		// the chapter 1 self test
		double inches, meters;
		for(inches = 1; inches <= 50; inches++) {
			meters = inches * 39.37;
			System.out.println(inches + " inches is " +
								meters + " meters.");
			counter++;
			// every 12th line/inches, print a blank line
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}