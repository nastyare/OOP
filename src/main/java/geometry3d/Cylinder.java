package geometry3d;

import geometry2d.Figure;
import exceptions.NegativeHeightException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new NegativeHeightException("The height must be greater than zero.");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with base: " + base.toString() + " and height: " + height;
    }
}
