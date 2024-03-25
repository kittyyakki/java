package com.ohgiraffers.section02;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. import 대해 이해할 수 있다. */
        /*
        *  임포트란?
        *  서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다,
        *  하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        *  그래서 패키지명을 생략하고 사용할 수 있도로 한 구문이 import 문이다.
        *  import는 package 선언문과 class선언문 사이에 작성하며
        *  어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
        * */

        Calculator cal = new Calculator();

        /* 1. non-static method 경우*/

            int min = cal.minNumberOf(30,50); //객체로 불러옴
            System.out.println("30과 50중 작은 값은? " + min);

        /* 2. static method 경우*/

            int max = maxNumberOf(30,50); //클래스로 불러옴
            System.out.println("30과 50중 큰 값은? " + max);

        /* 3. static 메소드를 호출할 때 클래스 명을 생략하고 사용할 수 있다.*/

            int max2 =maxNumberOf(100,200); //static method 수동 위에 추가.
            System.out.println("100과 200중 큰 값은? " + max2);

    }
}
