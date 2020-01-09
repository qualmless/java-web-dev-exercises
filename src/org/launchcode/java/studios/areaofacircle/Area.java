package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        double radiusOfCircle;
        double areaOfCircle;
//        double pi = 3.14;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        radiusOfCircle = input.nextDouble();
        input.close();

        areaOfCircle = Circle.getArea(radiusOfCircle);
        System.out.println("The area of the circle with radius " + radiusOfCircle + " is " + areaOfCircle);
    }
}
