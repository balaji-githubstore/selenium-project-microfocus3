package com.microfocus.oops;

class Father1 {
    public int fAge = 60;

    public Father1(int a) {
        System.out.println("Father constructor");
    }

    public void fatherStyle() {
        System.out.println("father style");
    }

}

class Son1 extends Father1 {
    public int sAge = 20;

    public Son1(int a,int b) {
        super(a);
        System.out.println("Son constructor");
    }

    public void sonStyle() {
        System.out.println("son style");
    }

}


public class Demo4Test {
    public static void main(String[] args) {

        Son1 s=new Son1(60,25);
        s.fatherStyle();
//        s.somequality();



    }

}
