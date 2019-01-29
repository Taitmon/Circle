package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Circle hugeCircle = new Circle();
        hugeCircle.radius = 3;
        System.out.println("The diameter is: " + hugeCircle.getDiameter());
        System.out.println("The radius is: " + hugeCircle.radius);
        System.out.println("The area is: " + hugeCircle.getArea());

        System.out.println("===============================");
        hugeCircle.radius = 4;
        System.out.println("The diameter is: " + hugeCircle.getDiameter());
        System.out.println("The radius is: " + hugeCircle.radius);
        System.out.println("The area is: " + hugeCircle.getArea());

    }
}
