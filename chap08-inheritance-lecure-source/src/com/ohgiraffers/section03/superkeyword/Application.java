package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. super와 super()에 대해 이해할 수 있다.
        *
        * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의
        *         인스턴스도 함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는
        *         래퍼런스 변수로 자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는
        *         래퍼런스 변수이다.
        * super():부모 생성자를 호출하는 구문으로 인자와 매개변수 타입, 갯수, 순서가 일치하는
        *         부모생성자를 호출하게 된다. this()가 해당 클래스 내에 다른 생성자를 호출하는
        *         구문이라면 super()는 부모클래스가 가지는 private 생성자를 제외한 나머지
        *         생성자를 호출할 수 있도록 하는 구문이다.
        *
        * */
        Product product = new Product();
        System.out.println("product.getInformation = " + product.getInformation());

        Product product1 = new Product("S-01234","애플","아이폰29",5000000,new Date());
        System.out.println("product1.getInformation() = " + product1.getInformation()); //자식 생성자 매개변수 호출
        
        Computer computer = new Computer();
        System.out.println("computer.getInformation() = " + computer.getInformation());
        
        Computer computer1 = new Computer("퀼컵 스냅드래곤",544,12,"안드로이드");
        System.out.println("computer1.getInformation() = " + computer1.getInformation()); //부모 생성자 매개변수호출

        Computer computer2 = new Computer("S-2394","apple","Mac",5000,new Date(),"퀼컵 스냅드래곤",544,12,"안드로이드");
        System.out.println("computer2.getInformation() = " + computer2.getInformation());// 부모 자식까지 합쳐서 나오는 매개변수 생성자 호출
    }
}
