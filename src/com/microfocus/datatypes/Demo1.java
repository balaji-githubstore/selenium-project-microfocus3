package com.microfocus.datatypes;

public class Demo1 {

    public static void main(String[] args) {

        byte a=100;  //a is register for byte and occupy 8 bits of memory in RAM
        short b=100;  //16 bits
        int c=100;  //32 bits
        long d=100; //64 bits

        //percentage of 1000 students
        //byte - 8*1000 = 8000 bits of memory
        //int - 32*1000 = 32000 bits of memory

        float e=1.123456789f; //32 bits

        double f=1.123456789; //64 bits

        char letter='$';

        boolean check=true;

        System.out.println(a);
        System.out.println(e);
        System.out.println(f);

        String name="balaji"; //6*16 bits

        System.out.println(name);

        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.equals("Balaji"));

        int radius=10;
//        calculate area of circle for radius 10
        double result= 3.14*radius*radius;
        System.out.println("Area of circle for radius 10 is "+result);

        System.out.println( 22.0/7);

        System.out.println( (double)22/7);
    }
}
