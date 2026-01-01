package com.classandobjects.level1;
import java.util.Scanner;
public class circle {
	 
	 // Attribute
    double radius;

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle = " + area);
    }

    // Method to calculate circumference
    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the Circle = " + circumference);
    }
}

public class CircleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object of Circle
        circle c = new circle();

        // Take radius input
        System.out.print("Enter radius of the circle: ");
        c.radius = sc.nextDouble();

        // Call methods
        c.calculateArea();
        c.calculateCircumference();

        sc.close();
    }

}
