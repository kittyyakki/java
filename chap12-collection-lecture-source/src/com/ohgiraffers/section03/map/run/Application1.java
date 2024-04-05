package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map 인터페이스의 특징
        * Collection 인터페이스와 다른 저장방식을 가진다.
        * Collection인데 컬렉션인터페이스와 다른 저장방식을 가진다.
        * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        * */
        
        /*
        * 키(key)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다
        * 1. 요소의 저장순서를 유지하지 않는다
        * 2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다
        * */
        
        /*
        * HashMap 검색속도가 매우 빠르다.
        * */

        HashMap hashMap = new HashMap(); //안에 요소를 안넣어준 경우
        
        hashMap.put("one", new Date());
        hashMap.put(12,"red apple"); //안에 객체만 들어갈수 있음 알아서 wrapping을 해주기 때문에 
        hashMap.put(33,123);
        System.out.println("hashMap = " + hashMap); //=을 넣어주지 않아도 알아서 값이 들어가있음.
        
        hashMap.put(12,"banana");
        System.out.println("hashMap = " + hashMap); //키 값이 다르니 중복 저장가능
        
        hashMap.put(11,"banana");
        hashMap.put(9,"banana");
        System.out.println("hashMap = " + hashMap); //9,11의 키값 추가

        System.out.println("키 9의 객체 값 = " + hashMap.get(9)); //9의 바나나값 출력
        
        hashMap.remove(9);
        System.out.println("hashMap = " + hashMap); //9의 바나나값 제거

        System.out.println("hashMap.size() = " + hashMap.size()); //저장된 객체의 값의 갯수가 나옴.
    }
}
