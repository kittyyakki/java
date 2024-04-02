package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {

        /* Object 클래스의 hashcode() 메소드의 오버라이딩 목적을 이해하고 활용할 수 있다.*/
        /*
        *  equals() 메소드를 재정의하는 경우 반드시 hashcode()메소드도 재정의 하도록 되어있다.
        *  만약에 hashcode()를 재정의 하지 않으면 같은 값을 가지게 되는 동등객체는
        *  같은 코드값을 가져야 한다는 규약에 위반되게 된다(강제성은 없지만 규약대로 작성하는게 좋음)
        *
        * */

        Book book1 = new Book(1,"선덕여왕","이순신",40000);
        Book book2 = new Book(1,"선덕여왕","이순신",40000);

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        //재정의 안했을 때의 문제점은 map 이라는 collection 에서 다룰것이다.

        Map<Book,String> map = new HashMap<>(); //Book 인스턴스와 String 이라는 두개의 자료타입 가져옴
        map.put((new Book(1,"선덕여왕","이순신",40000)),"selled");

        String str = map.get((new Book(1,"선덕여왕","이순신",40000)));

        System.out.println("String key의 값은 : "+ str); //Override hashCode로 재정의해줘서 값이 null>selled로 나오게됨!!

    }
}
