package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){} //생성자가질수만 잇으나 인스턴스는 불가

    public void nonStaticMethod(){
        System.out.println("Product class 의 nonStaticMethod 호출...");
    }

    public static void staticMethod(){
        System.out.println("Product class 의 staticMethod 호출...");
    }

    public abstract void absMethod();

}
