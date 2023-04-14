package com.microfocus.variable;

public class Demo1Var {
    public static int aS = 10;
    public static int bS = 20;
    public int aNS = 10;
    public int bNS = 20;

    public static void main(String[] args) {

        System.out.println(Demo1Var.aS);
        System.out.println(Demo1Var.bS);

        Demo1Var.bS=200;

        System.out.println(Demo1Var.aS);
        System.out.println(Demo1Var.bS);

        Demo1Var obj1=new Demo1Var();
        Demo1Var obj2=new Demo1Var();

        obj2.bNS=5000;
        obj2=obj1;

        System.out.println(obj1);
        System.out.println(obj1.aNS);
        System.out.println(obj1.bNS);

        System.out.println(obj2);
        System.out.println(obj2.aNS);
        System.out.println(obj2.bNS);


    }
}
