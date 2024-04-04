package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*
        * LinkedList
        * ArrayList랑 방법은 비슷하나 내부적으로 요소를 저장하는 것에 차이점이 있다.
        * 내부는 이중 연결 리스트로 구현되어 있다.
        *
        * 단일 연결 리스트 : 저장한 요소가 순서를 유지하지 않고 저장되 이러한 요소사이를 링크로 연결하여 구성하며
        * 마치 연결된 리스트 형태인거처럼 만든 자료구조이다.
        *
        * 이중 연결 리스트 : 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
        * 이전 요소로 접근하기 쉽게 고안된 자료구조이다.
        *
        * */

        List<String> linkedlist = new ArrayList<>();

        linkedlist.add("apple");
        linkedlist.add("banana");
        linkedlist.add("orange");
        linkedlist.add("grape");
        linkedlist.add("cherry");

        System.out.println(linkedlist.size()); //size로 출력해서 5개를 출력해줌!!

        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(i + ":" + linkedlist.get(i));
        } //for문으로 size를 i번째 !! 인덱스 아님 걍 순서대로 size를 get으로 꺼내와줌 
        //배열처럼 각각 담긴 것이 아니니 주의.
        linkedlist.remove(1);
        System.out.println("linkedlist = " + linkedlist); //출력해보면 0,1번째 banana가 없어짐!
        System.out.println(linkedlist.isEmpty()); //list가 비어있는지 확인해봤으나 false출력
        linkedlist.clear(); //안에 있는 list 날려버리겟다
        System.out.println("linkedlist.isEmpty() = " + linkedlist.isEmpty()); //이제 true가 나옴.


    }
}
