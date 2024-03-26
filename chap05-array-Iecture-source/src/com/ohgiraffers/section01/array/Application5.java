package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.
        *  랜덤한 카드를 한 장 뽑아서 출력해보자 */

        Random random = new Random();
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomIndex = (int)(Math.random()* cardNumbers.length);
        //Math.random()은 기본적으로 실수이기 때문에 int로 강제형변환 해줘야함!!

        System.out.println(cardNumbers[randomIndex] + " 카드 입니다.");
    }
}
