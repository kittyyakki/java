package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else {

            throw new Exception(); //more options 에 모든 예외를 받아주는것으로 throws 추가.
        }
        System.out.println("즐거운 쇼핑 하세요...."); //Exception으로 받아주는 방법1
    }
}
