// Try This 4-2
// Demonstrate garbage collection and the finalize() method

class FDemo {
	int x;

	FDemo(int i) {
		x = i;
	}

	// called when obect is recycled
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}

	// generates an object that is immediately destroyed
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}