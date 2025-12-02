import java.util.*;

// Custom Exception for negative diameter
class NegativeDiameterException extends Exception {
    public NegativeDiameterException(String msg) {
        super(msg);
    }
}

class Circle {
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor
    public Circle() {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }

    // Parameterized constructor
    public Circle(double x, double y, double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative!");
        }
        this.myX = x;
        this.myY = y;
        this.myDiameter = diameter;
    }

    // Getters
    public double getX() { return myX; }
    public double getY() { return myY; }
    public double getDiameter() { return myDiameter; }

    // Setter with validation
    public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative!");
        }
        this.myDiameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle [Center=(" + myX + ", " + myY + "), Diameter=" + myDiameter + "]";
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter X coordinate: ");
            double x = sc.nextDouble();
            System.out.print("Enter Y coordinate: ");
            double y = sc.nextDouble();
            System.out.print("Enter Diameter: ");
            double d = sc.nextDouble();

            Circle c = new Circle(x, y, d);
            System.out.println("Created: " + c);

            System.out.print("Enter new diameter: ");
            double newD = sc.nextDouble();
            c.setDiameter(newD);

            System.out.println("Updated Circle: " + c);

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
