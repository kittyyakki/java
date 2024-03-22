package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표 . 논리연결연산자의 진리표에 대해 이햐할 수 있다.
        *
        * AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 앞에의 false 이면 무조건 뒤에가 참이여도 false.
        * 예)false && num+3 앞에 false 실행 X
        *
        * 논리식 || 논리식 :  앞에 결과가 true 이면 뒤를 실행 안함.
        * 예)true || false 앞에 true이면 실행 X
        * */

        /*1. 논리식 && 논리식 : 앞에 결과가 false이면 뒤를 실행안함
        *
        * 조건식 두 개가 모두 만족되어야 true를 반환하지만 앞에 미리 false가 나오게 되면
        * 뒤에 조건을 확일할 필요없이 false를 반환한다
        * 따라서 !!연산 횟수를 줄이기 위해서는!! &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 것이 좋다.
        * ))false로 조건을 작성해서 연산횟수 줄이기 위함.
        * */

        int num1 = 10;

        int result = (false && ++num1 > 0) ? num1 : num1;
        //int result = (false && ++num1 > 0) ? true11 : false10;

        System.out.println("&&실행 확인 : " + result); //false값 반환

        /* 2. 논리식 || 논리식 : 앞에 결과가 true이면 뒤를 실행 안함 */
        /* 조건식 중 둘 중 하나라도 true를 변환하면 true를 변환하기 때문에 앞에서 미리 true가 나오게 되면
        *  뒤에 조건을 확인할 필요없이 true를 반환한다.
        *  따라서 연산의 횟수를 줄이기 위해서는 || 연산의 경우 true가 나올 가능성이 높은 조건을 작성하는 게 좋다.
        * */

        int num2 = 10;

        int result2 = (true || ++num2 > 0)? num2 : num2;

        System.out.println("||실행 확인 : " + result2); //앞에 true이기 때문에 뒤에 확인안함. true값 반환.

    }
}
