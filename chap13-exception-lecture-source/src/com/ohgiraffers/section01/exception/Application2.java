package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) { //try catch방법

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(10000,50000);
            et.checkEnoughMoney(50000,1000);

            System.out.println("=========== 상품 구입 가능 ===========");
        } catch (Exception e) {

            System.out.println("상품 구입 불가!!!");
            //throw new RuntimeException(e);
        }
        System.out.println("프로그램이 종료합니다....");//more options 에서 try catch로 받아주는 방법2.
    }
}
