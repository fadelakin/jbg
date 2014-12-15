// A multilevel hierarchy
class TwoDShape {
	private double width; // these are
	private double height; // now private

	// A default constructor.
	TwoDShape() {
		width = height = 0.0;
	}

	// Parameterized constructor.
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Construct ovject with equal width and height
	TwoDShape(double x) {
		width = height = x;
	}

	// Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

// Extend TwoDShape.
class Triangle extends TwoDShape {
	private String style;

	// A default constructor
	Triangle() {
		super();
		style = "none";
	}

	// Add a constructor to Triangle
	Triangle(String s, double w, double h) {
		super(w, h); // call superclass constructor

		style = s;
	}

	// One argument constructor
	Triangle(double x) {
		super(x); // call superclass constructor

		style = "filled";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

// Extend Triangle
class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle(String c, String s, double w, double b) {
		super(s, w, h);

		color = c;
	}

	String getColor() { return color; }

	void setColor() {
		System.out.println("Color is " + color);
	}
}