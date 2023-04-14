package com.microfocus.oops;

class Father {
    public int fAge = 60;

    public Father() {
        System.out.println("Father constructor");
    }

    public void fatherStyle() {
        System.out.println("father style");
    }

    public void somequality() {
        System.out.println("father quality");
    }
}

class Son extends Father {
    public int sAge = 20;

    public Son() {
        System.out.println("Son constructor");
    }

    public void sonStyle() {
        System.out.println("son style");
    }

    public void somequality() {
        System.out.println("son quality");
    }
}

class FatherY extends Father {
    public void fatherStyle() {
        System.out.println("fathery style");
    }

    public void somequality() {
        System.out.println("fathery quality");
    }
}

public class Demo1Test {
    public static void main(String[] args) {

        Father s = new FatherY();
        s.fatherStyle();
        s.somequality();


    }

}
