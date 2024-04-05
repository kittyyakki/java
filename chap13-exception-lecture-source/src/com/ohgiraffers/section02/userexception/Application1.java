package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest(); //try는 무조건 실행하고 타고타고 내려가서 catch로 빠짐 마지막 finally

        try {
            et.checkEnoughMoney(-50000, 30000);
            System.out.println("정상동작 확인");
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());//메세지 불러오기
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
            e.printStackTrace(); //오류확인
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 블럭 발생");
        }
        System.out.println("프로그램 종료"); //순서를 작은쪽에서 큰쪽으로 임의 변경해줘야함 자동으로 안됨.
    }
}
