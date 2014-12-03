// A simple class hireachy
// 
// A class for two dimensional objects
class TwoDShape {
	double width;
	double height;

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}