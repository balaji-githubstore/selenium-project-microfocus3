package com.microfocus.datatypes;

public class Demo2 {

    public static void main(String[] args) {

        //10 20 30 40 50
        int[] numbers = new int[5]; //5*32 bits of memory
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        //numbers[4] = 50;

        System.out.println(numbers);
        System.out.println(numbers[4]);
        System.out.println(numbers.length);


        int[] arr1 = {10, 20, 30};

        System.out.println(arr1);
        System.out.println(arr1[2]);

        double[] arr2=new double[2];
//        arr2[0]=89.5;
        arr2[1]=78;
        System.out.println(arr2[0]);

        char[] arr3=new char[3];
        arr3[0]='g';

        //create an array to store red, green, yellow
        String[] colors=new String[3];
//        colors[0]="red";
        colors[1]="green";
        colors[2]="yellow";

        System.out.println(colors);
        System.out.println(colors[0]);

        String[] colors1={"red","green","yellow"};
        System.out.println(colors1[0]);

    }
}
