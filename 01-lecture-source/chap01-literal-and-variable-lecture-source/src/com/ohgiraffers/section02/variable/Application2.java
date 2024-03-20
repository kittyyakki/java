package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args){

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다 */
        /* 변수를 사용하는 방법
        * 1. 변수를 준비한다(선언)
        * 2. 변수의 값을 대입한다(값 대입 및 초기화)
        * 3. 변수를 사용한다.
        * */

        /* 자료형이란?
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다
        *     이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다
        *     그 중 기본자료형 8가지부터 살펴보기로 한다.
        * */

        /* 목차 1-1-1 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형에는 4가지가 있다 */

        byte bnum ;    //1byte
        short snum ;  //2byte
        int inum;  //4byte
        long lnum;  //8byte

        /* 실수를 취급하는 자료형은 2가지가 있다 */
        float fnum;  //4byte
        double dnum;  //8byte

        /* 목차 1-1-2. 문자를 취급하는 지료형 */
        /* 문자를 취급하는 자료형은 한 가지가 있다.*/

        char ch;  //2byte 프로젝트에서 성별을 지정할때 선언해준다.
        char ch2;

        /* 목차 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue;  //1byte 이게 값이 맞으면 프로그램을 돌려주세요 할때 많이 씀

        /* 이상 8가지를 기본자료형이라고 한다.*/

        /* 1-1-4 문자열을 취급하는 자료형*/
        String str;  //4byte(엄밀히 이야기하면 주소값(메모리값)은 4byte 정수값)

        /* 2. 변수의 값을 대입한다.(값 대입 및 초기화) */ //오른쪽 >>왼쪽 대입

        /* 목차 2-1. 정수를 취급하는 자료형에 값 대입 */
        bnum = 1;  //-128~ +127 //이 범위 안에서 숫자를 받을수 있다
        snum = 2;  // -32768 ~ 32767
        inum = 3;  // -2147483648~2147483647 //3은 변수명에 값을 넣어준 것 뿐임.
        //lnum = 8;  // -9223342036854775808 ~ 92233372036854775807
        //아무 문제 없을 것 같지만 뒤에 대문자 L을 붙여야합니다. 그 이유는 형변환에서 알려드립니다~
        lnum = 8L;

        /* 2-2. 실수를 취급하는 자료형 값 대입*/
        //fnum = 4.0;
        fnum = 4.0f; //f를 소문자로 꼭 붙여줘야 오류가 안남
        dnum = 8.0;

        /* 2-3 문자 를 취급하는 자료형 값 대입 */
        ch = 'a'; //문자 형태의 값을 저장할 수 있다
        ch2 = 97; //'a'는 '97'이라는 숫자였지? 그래서 숫자로도 저장할 수 있다.

        /*2-4 논리를 취급하는 자료형에 값 대입 */
        isTrue = true;
        isTrue = false; //true와 false만 넣을 수 있다. //밑에가 최신형값이라 출력하면 최신형값으로 나옴

        /*2-5 문자열을 취급하는 자료형에 값 대입*/
        str = "안녕하세요";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
        * 정수는 int 실수는 double이 대표 자료형이다
        * */

        /* 목차 3 변수를 사용한다 */
        /* 변수에 저장한 값을 출력 */
        System.out.println("==========변수에 저장한 값을 출력===========");
        System.out.println("bnum의 값 출력 : " + bnum);
        System.out.println("snum의 값 출력 : " + snum);
        System.out.println("inum의 값 출력 : " + inum);
        System.out.println("lnum의 값 출력 : " + lnum);

        System.out.println("fnum의 값 출력" + fnum);
        System.out.println("dnum의 값 출력" + dnum);

        System.out.println("ch의 값 출력" + ch);
        System.out.println("ch2의 값 출력" + ch2);

        System.out.println("isTrue의 값 출력" + isTrue);

        System.out.println("str의 값 출력" + str);






    }
}
