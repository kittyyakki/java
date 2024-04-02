package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product/*, java.util.Scanner*/{
    public SmartPhone(){} //생성자 생성시 overriding 필수 동적바인딩이라고함.
    @Override  //추상클래스는 extends할때 모조건 overriding해야 하고 scanner 불가
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메소드 호출함...");

    }

    public void printSmartPhone(){
        System.out.println("Smartphone 클래스의 printSmartPhone 메소드 호출함...");
    } //메소드도 가능
}
