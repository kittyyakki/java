package com.ohgiraffers.section02.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. StringBuilder 의 자주 사용되는 메소드의 용법을 확인할 수 있다.*/
        StringBuilder s1 = new StringBuilder();
        
        /* capacity() : 용량(현재 버버의 크기)를 정수형으로 반환하는 메소드 (문자열길이 + 16 기본용량)*/
        System.out.println("s1.capacity() = " + s1.capacity());

        /*
        * append() : 인자로 전달한 값을 문자열로 변환 후 기본 문자의 추가한다.
        * 기본용량을 초과하는 경우(기존 문자열 +1) * 2를 하여 용량을 확장시킨다.
        * */

        /*for(int i = 0; i < 50; i++) {
            s1.append(i);

            System.out.println("sb1 : " + s1);
            System.out.println("capacity : " + s1.capacity());		//2n + 2씩 증가함
            System.out.println("hashcode : " + s1.hashCode());		//동일 인스턴스임
        } //특징은 용량이 증가되도 해쉬코드는 같음*/
        
        StringBuilder sb2 = new StringBuilder("javaoracle");
        
        /*
        * delete() : 시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거합ㄴ다
        * deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다
        * String이랑 다른점 !! 둘 다 원본에 영향을 미친다.
        * */

        System.out.println("sb2.delete(2,5) = " + sb2.delete(2,5)); //중간에 짤려서 jaracle출력 5전까지 짤림!!
        System.out.println("sb2.deleteCharAt(0) = " + sb2.deleteCharAt(0)); //aracle출력

        System.out.println("sb2 = " + sb2); //다시 출력하면 원본이 변해있음 영향을 줌!! aracle출력

        /* insert() : 인자로 전달된 값을 문자열로 변환 후 지정된 인덱스 위치에 추가한다.*/
        System.out.println("sb2.insert() = " + sb2.insert(1,"vao")); //avaoracle
        System.out.println("sb2.insert() = " + sb2.insert(0,"j"));  //javaoracle

        /* 인덱스 번호가 문자열 길이와 같은 경우 append()와 같은 역할을 한다.*/
        System.out.println("insert() : " + sb2.insert(sb2.length(),"jdbc")); //javaoraclejdbc 길이가 같을경우 문자열합치기가 됨!!

        System.out.println("sb2 = " + sb2); //다시 출력하면 원본에 영향을 줬음
        
        /*
        * reverse() : 문자열의 인덱스 순번을 역순으로 재배열한다.
        * */

        System.out.println("sb2.reverse() = " + sb2.reverse()); //cbdjelcaroavaj
        System.out.println("sb2 = " + sb2); //다시 출력하면 원본에 영향을 줬음

        /*
        * String 클래스와 동일한 메소드도 있다
        * charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
        * */
    }
}
