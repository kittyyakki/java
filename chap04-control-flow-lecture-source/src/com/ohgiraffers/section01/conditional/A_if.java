package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {


    public void testSimpleIfStatement(){

        /* 수업목표. if 단독 사용에 대한 흐름을 이해하고 적용
         *  [if문 표현식]
         *  if(조건식){
         *        조건식이 true일 때 실행할 명령문;
         *  }*/

        /* 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
         *  if문은 조건식 결과 값이 참(true)이면 {}안에 코드를 실행하고,
         *  조건식의 결과 값이 거짓(false)이면 {}안에 코드를 무시하고 넘어감.
         * */

        /*
         *  정수 한 개를 입력 받아 그 수가 짝수이면 입력하신 숫자는 짝수입니다라고 출력하고,
         *  짝수가 아니면 출력하지 않는 구문을 만들어 보자
         *  단 조건과 관련없이 프로그램이 종료될 때 프로그램을 종료합니다 라고 출력되도록 하자.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        if ( num%2==0 ){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
       /* if ( num%2==1 ){
            System.out.println("입력하신 숫자는 홀수입니다.");
        }*/

        System.out.println("프로그램이 종료합니다.");


    }

    public void testNestedIfStatement(){

        /* If문 안에 If 문 사용 (중첩)
        *
        *  정수 한개를 입력 받아 그 수가 양수인 경우에만 짝수인지 확인하고
        *  짝수이면 "입력하신 숫자는 양수이면서 짝수입니다"라고 출력하고
        *  둘 중하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
        *  단,조건과 상관없이 프로그램이 종료될때 "프로그램을 중료합니다"라고 출력되도록 한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");

        int num = sc.nextInt();

        if( num >0 ){

            if ( num%2==0 ){

                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다");

    }

}


