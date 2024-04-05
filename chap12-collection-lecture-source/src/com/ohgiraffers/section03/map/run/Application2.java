package com.ohgiraffers.section03.map.run;

import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties란?
        * HashMap을 구현하여 사용 용법이 거의 유사하지만 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * 
        * */

        Properties prop = new Properties(); //객체 인스턴스 생성
        
        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user","student");
        prop.setProperty("password","student");

        System.out.println("prop = " + prop);

/*        Properties prop1 = new Properties();

        *//* properties의 모든 키값 목록 내보내기 한다.
        * *//*
        prop1.list(System.out); //out 밑에 println 있는것*/

        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password")); //key 값으로 값들 다 꺼내옴.
    }
}
