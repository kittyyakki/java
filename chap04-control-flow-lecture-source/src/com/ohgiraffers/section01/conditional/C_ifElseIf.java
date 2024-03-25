package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement(){

        /* 수업목표 if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
         * [if-else-if문 표현식]
         *  if(조건식1){
         *           조건식이1이 true일 때 실행할 명령문;
         * }else if(조건식2){
         *           조건식이2이 true일 때 실행할 명령문;
         * }else{
         *           위의 두 개의 조건이 모두가 거짓을 경우 실행할 명령문
         * }
         * */

        System.out.println("산 속에 나무를 하던 나무꾼이 연목에 도끼를 빠트리고 말았다");
        System.out.println("연목에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다");
        System.out.println("나무꾼한테 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.print("어느 도끼가 너의 도끼냐? (1.금도끼 2.은도끼 3.쇠도끼 :");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1){
            System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 욕심쟁이야!!");
        }else if(answer==2){
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라");
        }else{
            System.out.println("오호 정직하구나~ 여기 있는 금도끼,은도끼,쇠도끼 모두 가져가거라!!");
        }
        System.out.println("그렇게 산신령은 다시 연못속으로 사라졌다");
    }

}
