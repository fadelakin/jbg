class Vehicle {
	int passengers; // number of passengers
	int fuelcap;	// fuel capacity in gallons
	int mpg;		// fuel consumption in miles per gallon

	// Display the range.
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}

	int returnRange() {
		return mpg * fuelcap;
	}	

	// add parameterized method that computes
	// the fuel required for a given distance
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}