package com.ohgiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {
        /* String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다.
        *
        *  charAt(int index) : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
        *  인덱스를 0부터 시작하는 숫자체례를 의미하며
        *  인덱스를 벗어난 정수를 인자를 전달하는 경우 indexOutBoundsException이 발생한다.
        *
        * */

        String str = "apple";
        for (int i = 0; i<str.length();i++){
            System.out.println("charAt(" + i + " :" + str.charAt(i)) ;
        } //문자열의 인덱스를 for문으로 가져오기.

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를
        * 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA"; //아스키코드로 하면 소문자보다 작음?????
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3))); //0 문자값 같음
        System.out.println("compareTo() : " + (str4.compareTo(str2))); //-32 사전순으로 같지만 (작으면 음수)
        System.out.println("compareTo() : " + (str2.compareTo(str4))); //32 대문자 소문자 차이는 32만큼 차이가 남!! (크면 양수를반환)

        System.out.println("compareTo() : " + (str2.compareTo(str5))); //-5
        System.out.println("compareTo() : " + (str5.compareTo(str2))); //5  //음수인지 양수인지만 알면됨~

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열을 반환한다
        *  원본 문자열에는 영향을 주지 않는다.
        *  */

        System.out.println("concat() : " + (str2.concat(str5))); //java + oracle 합쳐서 나옴
        System.out.println("str2" + str2); //합치기 하고 다시 출력해도 원본에는 영향을 주지 않는다. 그대로 java.

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인데스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        String indexOF = "java oracle";
        System.out.println("indexOF('a') : " + indexOF.indexOf('a')); //0,1해서 a의 1이 나옴!
        System.out.println("indexOF('z') : " + indexOF.indexOf('z')); //-1을 반환 문자가 없자나요

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터하고 처음 일치하는 위치의 인덱스를 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        System.out.println("lastIndexOf('a') : " + indexOF.lastIndexOf('a')); //7을 반환 뒤에서부터~~~
        System.out.println("lastIndexOf('z') : " + indexOF.lastIndexOf('z')); //없자나요 -1반환~~

    }
}
