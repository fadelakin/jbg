// Demonstrate dynamic method dispatch

class Sup {
	void who() {
		System.out.println("who() in Sup");
	}
}

class Sub1 extends Sup {
	void who() {
		System.out.println("who() in Sub1");
	}
}