class Vehicle {
	int passengers; // number of passengers
	int fuelcap;	// fuel capacity in gallons
	int mpg;		// fuel consumption in miles per gallon

	// add a constructor for Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

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

// Extend Vehicle to create a Truck specialization
class Truck extends Vehicle {
	private int cargocap; // cargo capacity in pounds

	// This is a constructor for Truck.
	Truck(int p, int f, int m, int c) {
		// Initialize Vehicle members using Vehicle's constructors
		super(p, f, m);

		cargocap = c;
	}

	// Accessor methods for cargocap.
	int getCargo() { return cargocap; }
	void putCargo(int c) { cargocap = c; }
}