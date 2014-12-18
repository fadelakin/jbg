// Methods with differing signatures are overloaded and not overriden
class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// create a subclass by extending class A
class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}