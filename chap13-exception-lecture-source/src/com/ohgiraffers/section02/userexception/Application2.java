package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest(); //try catch로 가져옴.

        try {
            et.checkEnoughMoney(20000,10000);
        } catch (PriceNegativeException |MoneyNegativeException e) { // |하이픈으로 두개한번에 처리가능.
            //뜻은 (A | B) A이거나 B이거나 if문으로 들어가서 조건에 맞는경우 출력되는식임.

            /* 예외가 발생한 클래스의 이름을 알수 있다.*/
            System.out.println(e.getClass() + "발생!!");
            System.out.println(e.getMessage()); //메시지 가져옴

        } catch (NotEnoughMoneyException e) {
            /*예외 클래스명, 예외 발생 위치, 예외 메시지를 stack 호출 역순으로
            * 빨간색 글씨를 이용해서 로그 형태로 출력해주는 기능
            * */
            e.printStackTrace(); //오류확인
        }finally {
            System.out.println("finally 블럭 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
