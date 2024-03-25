package com.ohgiraffers.section06.ternary;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표 . 삼항연산자에 대해 이해하고 활용할 수 있다.
        *  상항연산자
        *  자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *  항목이 3개임 > (조건식)? 참일때 사용할 값1 : 거짓일 때 사용할 값2
        *  조건식은 반드시 결과가 true 혹은 false가 나오게끔 작성해야 한다.
        *  비교/논리연산자 주로 사용된다.
        * */

        /* 상항연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;
        String result = (num1 > 0)? "양수입니다" : "양수가 아닙니다."; //조건식 true : false를 문자열로 할거라서 String받음.

        System.out.println("num1은" + result);

        //String result2 = (num2 >0)? "양수입니다" : "양수가 아닙니다";
        int result2 = (num2 >0)? 10 : 20; //정수로도 받는 방식 예시 )int

        System.out.println("num2는" + result2);
        System.out.println("num2는" + result2); //int

        /* 상항연산자의 중첩사용 */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 >0)? "양수입니다" : (num3==0)? "0이다" : "음수이다";
        String result4 = (num4 >0)? "양수입니다" : (num4==0)? "0이다" : "음수이다";
        String result5 = (num5 >0)? "양수입니다" : (num5==0)? "0이다" : "음수이다";

        System.out.println("num3은 " + result3);
        System.out.println("num4은 " + result4);
        System.out.println("num5은 " + result5);
    }
}
