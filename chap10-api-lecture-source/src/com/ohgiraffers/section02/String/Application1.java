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

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */

        String trimStr = "   java   "; //앞 뒤 공백 3칸
        System.out.println("trimStr. = # " + trimStr+"#");
        System.out.println("trim(). = # " + trimStr.trim() + "#"); //공백제거되어 출력
        System.out.println("trim(). = # " + trimStr + "#"); //다시 출력해도 원본에 영향을 주지 않음.

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        * */

        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase()); //소문자로 변경됨
        System.out.println("toUpperCase() : " + caseStr.toUpperCase()); //대문자로 변경됨

        System.out.println("caseStr = " + caseStr); //원본은 그대로!!

        /*
        * subString() :  문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * */

        String javaoracle = "javaoracle";
        System.out.println("subString(3,6) : " + javaoracle.substring(3,6)); //345까지만 나옴 6전까지가 포인트
        System.out.println("subString(3)" + javaoracle.substring(3)); //3번째부터 끝까지 나옴

        System.out.println("javaoracle" + javaoracle); //원본은 그대로!!

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다.*/
        System.out.println("replace() : " + javaoracle.replace("java","python"));
        System.out.println("replace() : " + javaoracle); //원본은 그대로!!

        /* length() : 문자열의 길이를 정수형으로 반환한다.*/
        System.out.println("length() : " + javaoracle.length());
        System.out.println("빈 문자열의 길이 " + (" ja".length())); //문자와 공백까지 합쳐서 체크해줌

        /* isEmpty() : 문자열의 길이가 0이면 true 를 아니면 false 를 반환*/
        System.out.println("isEmpty() : " + "".isEmpty()); //없으면 true
        System.out.println("isEmpty() : " + "    ".isEmpty()); //문자열의 길이가 있을때 false

        /* 길이가 0인 문자열은 null 과는 다르다.*/
        String str6 = null;
        String str7 = ""; //얘는 길이가 0임 위에랑 완전다름~


    }
}
