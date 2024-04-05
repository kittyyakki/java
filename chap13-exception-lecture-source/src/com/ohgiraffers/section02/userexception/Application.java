package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;

public class Application {
    public static void main(String[] args) {
         //우리가 만든 프로그램에 우리가 날수 있는 오류들을 넣어주는 것으로 프로그램을 업그레이드 시킬수 있음.
        ExceptionTest et = new ExceptionTest(); //try catch로 감싸줌
        try {
            et.checkEnoughMoney(-50000,100000);
            //et.checkEnoughMoney(50000,-60000);
            //et.checkEnoughMoney(5000,2000);
        } catch (Exception e) {
            e.printStackTrace(); //더 큰 Exception으로 타고 들어가서 찍어주겠다.
        }
    }
}
