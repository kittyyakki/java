package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price,int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        //public void checkEnoughMoney(int price,int money) throws Exception 이렇게 제일큰 타입으로 써도 오류 안남.

        //예외사항을 if문으로 구현
        if (price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money <0){
            throw new MoneyNegativeException("가진 돈은 음수 일수 없습니다..");
        }
        if (money < price){
            throw new NotEnoughMoneyException("가지고 계신 돈이 부족합니다.");
        }

        System.out.println("가진 돈이 충분합니다...즐거운 쇼핑 되세요~");
    }
}
