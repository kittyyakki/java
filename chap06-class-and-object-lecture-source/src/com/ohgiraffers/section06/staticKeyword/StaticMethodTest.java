package com.ohgiraffers.section06.staticKeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출함...");
    }

    public static void staticMethod(){
        //this.count++; //new 객체를 사용안하니 this 에러발생.
        System.out.println("StaticMethod 호출함...");
    }
}
