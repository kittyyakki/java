package com.ohgiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표. 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.
        *  논리 연산자의 우선순위와 활용
        *  논리 and 연산자와 논리 or 연산자의 우선순위
        *  && :  11순위
        *  || :  12순위
        *  논리 and 연산자 우선순위가 논리 or 우선순위보다 높다
        * */

        /* 1. 1부터 100 사이의 값인지 확인
        *  1<= 변수 <= 100 이렇게는 사용 못함 --> 변수 >=1 && 변수 <=100 이렇게 사용해야 한다.*/

        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >=1 && num1<=100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 2. 영어의 대문자인지 확인
        *  영어 대문자냐? --> 문자변수>='A' && 문자변수<='Z' >=*/

        char ch = 'G';
        System.out.println("영어의 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z')); //아스키코드로 내부적으로 변환해서 구분해서 반환.

        char ch1 = 'g';
        System.out.println("영어의 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));


        /* 3. 대소문자와 상관없이 영문자 y인지 확인 */
        /* 문자 변수 == 'y' || 문자변수 == 'Y' */

        char ch2 = 'y';
        System.out.println("영문자 y인지 확인" + (ch2 =='y' || ch2 == 'Y'));

        char ch3 = 'Y';
        System.out.println("영문자 Y인지 확인" + (ch3 =='y' || ch3 == 'Y'));

        /* 4. 영문자 인지 확인*/
        /* A : 65, Z : 90, a : 97, z : 122 (중간의 91~96까지는 영문자가 아님)*/

        //논리적으로 먼저 실행하는 연산을 묶어주는 갓이 코드이해에 더 쉽다.and 연산자는 먼저 실행되기때무네 묶을 필요 X

        char ch4 = 'F';
        System.out.println("영문자인지 확인 : "+ ((ch4>='A' && ch4<='Z')||(ch4>='a' && ch4<='z')));
        System.out.println("영문자인지 확인 : "+ ((ch4>=65 && ch4<=90)||(ch4>=97 && ch4<=122)));
    }
}
