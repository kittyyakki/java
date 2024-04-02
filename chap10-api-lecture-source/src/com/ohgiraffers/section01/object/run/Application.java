package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application{
    public static void main(String[] args) {
        /* 수업목표. Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할수 있다.*/
        /*
        *  모든 클래스는 Object 클래스의 후손이다
        *  따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        *  또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용하는 것도 가능하다.
        * */

        /*
        * Object 클래스의 메소드 중 관례상 많이 오버라이딩해서 사용하는 메소드들이 있다.
        * toString(), equals(), hashcode()이다.
        * */

        Book book1 = new Book(1,"선덕여왕","이순신",40000);
        Book book2 = new Book(2,"김알지","루이하오",60000);
        Book book3 = new Book(3,"푸바오","바오바오",20000);

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book3.toString() = " + book3.toString());

        System.out.println("book1 = " + book1); //자동으로 toString 을 호출해줌
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);

    }
}
