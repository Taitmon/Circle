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
        Circle hugeHugeCircle = new Circle();
        hugeHugeCircle.radius = 4;
        System.out.println("The diameter is: " + hugeHugeCircle.getDiameter());
        System.out.println("The radius is: " + hugeHugeCircle.radius);
        System.out.println("The area is: " + hugeHugeCircle.getArea());

    }
}
