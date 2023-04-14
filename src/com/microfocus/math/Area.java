package com.microfocus.math;

public class Area {
    //accessmodifier static returntype methodname()
    public double areaOfCircle(int rad) {
        double area = 3.14 * rad * rad;
        return area;
    }

   public static double areaOfRectangle(double length, double width) {

        return length * width;
    }

    //areaOfTriangle
    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static String getAuthorName() {

        return "Balaji Dinakaran";
    }

    public void quit(){

    }

    public static void printDescription(){
        System.out.println("Math Formulae!!!");
    }

}
