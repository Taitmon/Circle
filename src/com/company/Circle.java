package com.company;

public class Circle
{
    double radius;

    public double getDiameter()
    {
        double diameter = this.radius * 2;

        return diameter;
    }

    public double getArea()
    {
        double area = 3.14 * this.radius * this.radius;

        return area;
    }
}
