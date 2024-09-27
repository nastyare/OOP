package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidDimensionException;
import exceptions.NegativeHeightException;

public class Geometry {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5);
            System.out.println(circle.toString() + ", area: " + circle.area());

            Circle invalidCircle = new Circle(-2);  // Это вызовет InvalidDimensionException
            System.out.println(invalidCircle.toString() + ", area: " + invalidCircle.area());
        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Rectangle rectangle = new Rectangle(4, 6);
            System.out.println(rectangle.toString() + ", area: " + rectangle.area());

            Rectangle invalidRectangle = new Rectangle(0, 5);  // Это вызовет InvalidDimensionException
            System.out.println(invalidRectangle.toString() + ", area: " + invalidRectangle.area());
        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Cylinder cylinder = new Cylinder(new Circle(3), 10);
            System.out.println(cylinder.toString() + ", volume: " + cylinder.volume());

            Cylinder invalidCylinder = new Cylinder(new Rectangle(2, 3), -5);  // Это вызовет NegativeHeightException
            System.out.println(invalidCylinder.toString() + ", volume: " + invalidCylinder.volume());
        } catch (NegativeHeightException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
