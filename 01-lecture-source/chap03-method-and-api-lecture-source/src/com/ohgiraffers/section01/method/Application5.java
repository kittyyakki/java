package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다.*/
        /* return이란?
        *  모든 메소드 내부에는 return이 존재한다.
        *  void 메소드의 경우는 리턴을 명시적으로 작성하지 않아도, 마지막 줄에 컴파일러가 자동으로 추가를 해준다.
        *  return은 현재 메소드를 강제 종료하고 호출한 구분으로 다시 돌아가는 명령어 이다.
        * */


        System.out.println("main method 시작함");

        /* 1. 메소드 리턴 테스트 */
        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main method 종료함");

    }

    public void testMethod(){

        System.out.println("테스트 메소드 동작 확인....");

        /* 컴파일러에 의해 자동으로 추가되는 구문이다.
        *  가장 마지막에 작성하고, 마지막에 작성되지 않을 경우는 컴파일 에러를 발생시킨다. */

        return;

        //System.out.println();  //에러 발생. return을 가장 마지막에 해야함.
    }
}
