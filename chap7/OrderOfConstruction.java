// Demonstrate when constructors are executed

// Create a super class
class A {
	A() {
		System.out.println("Constructing A.");
	}
}

// Create a subclass by extending class A.
class B extends A {
	B() {
		System.out.println("Constructing B.");
	}
}