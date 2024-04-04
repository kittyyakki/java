package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* Stack에 대해 이해하고 사용할 수 있다.*/
        /*
        * Stack 메모리 구조는 선행 메모리 공간에 데이터를 저장하며
        * 후입선출(LIFO = Last input First Out) 방식의 자료 구조
        * 
        * */
        
        Stack<Integer> integerStack =  new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        //얘는 0부터 시작안하고 1부터 시작
        // 왜냐 밑에서 들어가고 위에가 없어지는에 위에가 빈공간일수 없다.

        System.out.println("integerStack = " + integerStack);
        System.out.println("integerStack.search(5) = " + integerStack.search(5)); //1
        
        /*
        * peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는 요소를 반환 후 제거
        * */
        System.out.println("integerStack.peek() = " + integerStack.peek());
        //제일 마지막에 있는 것을 꺼냄 
        System.out.println("integerStack = " + integerStack);//값은 그대로
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack); //값이 사라짐
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        //System.out.println("integerStack.pop() = " + integerStack.pop());
        //.EmptyStackException 꺼낼 값이 없어서 나오는 오류
        System.out.println("integerStack = " + integerStack);
        //다 꺼냈으니까 빈 공백 [] 공간



    }
}
