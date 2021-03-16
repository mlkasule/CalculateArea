
/**
* Write a class that has three overloaded static methods for calculating the areas of the
* following geometric shapes:
* - circles
* - rectangles
* - cylinders
* Here are the formulas for calculating the area of the shapes.
* Area of a circle: Area = π r2, where p is Math.PI and r is the circle's radius
* Area of a rectangle: Area = Width x Length
* Area of a cylinder: Area = π r2 h, where p is Math.PI, r is the radius of the cylinder's base, and h is the cylinder's height
* Because the three methods are to be overloaded, they should each have the same name, but different parameter lists.
* Demonstrate the class in a complete program.

**/

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius to calculate circle area: ");
		double radius = input.nextDouble();
		System.out.print("Enter width to calculate rectangle area: ");
		double width = input.nextDouble();
		System.out.print("Enter height to calculate rectangle area: ");
		double length = input.nextDouble();
		System.out.print("Enter base radius to calculate cylinder area: ");
		double radius1 = input.nextDouble();
		System.out.print("Enter height to calculate cylinder area: ");
		double height1 = input.nextDouble();

		// area of circle
		System.out.printf("Area of a the circle is:  %.2f\n", getArea(radius));

		// area of rectangle
		System.out.printf("Area of a the rectangle is:  %.2f\n", getArea(width, length));

		// area of cylinder
		System.out.printf("Area of the cylinder is: %.2f\n", getArea(radius1, height1));

	}

	public static double getArea(double radius) {
		return Math.PI * (Math.pow(radius, 2));
	}

	public static double getArea(int width, int length) {
		return length * width;
	}

	public static double getArea(double radius, double height) {
		return Math.PI * (Math.pow(radius, 2)) * height;
	}
}