package com.microfocus.methods;


import com.microfocus.math.Area;

public class Demo1 {

    public static void main(String[] args) {

        int radius = 10;

        //will start at 4:05 PM IST
        //allocate memory for all non-static variable and methods
        Area obj=new Area();

//        Area obj1;
//        obj1.areaOfRectangle(10,50);

        double result = obj.areaOfCircle(10);
        System.out.println(result);

        System.out.println(obj.areaOfCircle(20));

        double res=Area.areaOfRectangle(10.2,10);
        System.out.println(res);

        res=Area.areaOfTriangle(10,10);
        System.out.println(res);

        String authorName=Area.getAuthorName();
        System.out.println(authorName);

        obj.quit();

       Area.printDescription();
    }
}
