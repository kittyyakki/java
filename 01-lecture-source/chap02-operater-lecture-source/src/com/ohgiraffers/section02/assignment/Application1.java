package com.ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args){
        /*수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다.*/
        /*
        * 대인연사자와 산술복합 대입 연산자
        * '=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 대입함
        * '+=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽에 피연산자에 대입함
        * '-=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽이 피연산자에 대입함
        * '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽 피연산자에 대입함
        * */

        int num = 12;

        System.out.println("num :" + num);

        // 3증가시
        num = num + 3;  //대입연산자의 오른쪽은 값 왼쪽에는 공간의 의미이다.
        System.out.println("num :" + num);

        num += 3;      //num = num + 3; 와 같은 의미이다.
        System.out.println("num :" + num);

        num -= 5;     //num = num - 5;
        System.out.println("num :" + num);

        num *= 2;   //num = num * 2;
        System.out.println("num :" + num);

        num /= 2;  //num = num / 2;
        System.out.println("num :" + num);

        num %=3;   //num = num % 3; 2로 나눠서 0이 나오면 짝수 3으로 나와서 1 나오면 홀수.
        System.out.println("num :" + num);

        /* 주의사항
        *  산술 복합 대입연산자의 작성 순서에 주의해야한다.
        * */

        //num =- 5; 순서 조심 -= 이렇게.
        System.out.println("num :" + num);
    }
}
