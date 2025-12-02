// program1.java

package com.app.geometry;

public class Point2D {
    private double x;
    private double y;

    // Parameterized Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return point details
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check equality of two points
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) +
                         Math.pow(other.y - this.y, 2));
    }
}

// ========================== TestPoint.java ==========================

package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates for point 1
        System.out.print("Enter x and y for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Accept coordinates for point 2
        System.out.print("Enter x and y for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create Point objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if points are equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are different.");
            System.out.printf("Distance between p1 and p2: %.2f\n", p1.calculateDistance(p2));
        }

        sc.close();
    }
}
