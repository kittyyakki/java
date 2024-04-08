package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*collection 프레임워크에 대해 이해할 수 있다.*/
        /*
         * 컬렉션 프레임워크
         * 자바에서 컬렉션 프레임워크는 여러개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
         * 표준화된 방법을 제공하는 클래스 집합을 의미한다.
         *
         * 컬렉션 프레임워크는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해놓았다
         * 1. List 인터페이스
         * 2. Set 인터페이스
         * 3. Map 인터페이스
         * */

        /*
         * List 인터페이스의 특징
         * 1. 순서가 있는 데이터 집합으로 데이터 중복 저장을 허용한다.
         * 2. Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
         * 3. 요소의 저장 순서가 유지된다.
         * */

        /* ArrayList
         * 배열의 단점을 보완하기 위해 만들어졌다.
         * 배열은 크기를 변경할 수 없고 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
         * 이러한 배열의 단점을 보완하고자
         * 크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
         * */

        ArrayList arrayList = new ArrayList(); //내부적으로 10칸의 배열을 생성하게 된다.

        List list = new ArrayList(); //List안에

        Collection collection = new ArrayList<>(); //collection  이렇게 3개의 배열을 만듬

        arrayList.add("apple"); //0번째 배열
        arrayList.add(123);
        arrayList.add(1345);//값 > 객체로 오토박싱 처리 됨. //1번째 배열
        arrayList.add(new Date()); //Thu Apr 04 13:03:44 KST 2024 이것도 넣을수 있음

        System.out.println("arrayList = " + arrayList);
            /*arrayList = [apple, 123, Thu Apr 04 13:15:15 KST 2024]
            arrayList.size = 3
            0:apple
            1:123
            2:Thu Apr 04 13:15:15 KST 2024*/

        arrayList.size();
        System.out.println("arrayList.size = " + arrayList.size()); //이렇게도 불러올수 있다.

        /* ArrayList get()을 이용해서 꺼내며 sizq()로 요소의 갯수를 반환한다.*/
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ":" + arrayList.get(i));
        }
        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);//for문과 apple 추가된 구문

        arrayList.add(1, "banana");
        System.out.println("arrayList = " + arrayList); //banana 추가 이미 있기 때문에 변경안됨.

        arrayList.remove(2);
        System.out.println("arrayList = " + arrayList); //012번째 삭제

        arrayList.set(1, Boolean.valueOf(true)); //지정된 위치의 값을 수정할 때에도 인덱스를 활용할수 있으면 set()사용한다.
        System.out.println("arrayList = " + arrayList); //01번째 true로 변경
        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다.*/

        List<String> str = new ArrayList<>(); //제네릭 스트링 타입으로 다시 초기화

        /* 제네릭 타입을 지정하면 지정된 타입 외에는 인스턴스는 저장하지 못한다.*/
        str.add("apple");
        //str.add(123); 타입 안맞음 String
        str.add("banana");
        str.add("orange");
        str.add("mango");
        str.add("grape");
        System.out.println("str = " + str);

        /* Collection 인터페이스가 아니고 Collections 클래스이고 static 메소드이다.
         *  인터페이스명에 s가 붙은 클래스는 관례상 비슷한 방식으로 작성된 클래스를 의미한다.*/
        Collections.sort(str);
        System.out.println("str = " + str); //사전 순서되로 변경됨 알파벳 순서


        /*
         * 조금 복잡하지만 내림차순 정렬도 할 수 있다.
         * 하지만 기본적으로 ArrayList 는 내림 기능을 제공하지 않는다.
         * 역순 정렬기능은 LinkedList 에 포함되어 있는데, List로 공간을 선언했기 때문에
         * ArrayList에서 LinkedList로 변경할 수 있다.
         * */

        str = new LinkedList<>(str); //더 큰 자료형이기때문에 여기 안에 넣고 변경할수 있다.

        /*
         * Iterator 반복자 인터페이스를 활용해서 역순으로 정렬한다
         * LinkedList 타입으로 형변환 후 descendingIterator() 메소드를 사용하면
         * 내림차순으로 정렬된 타입의 목록으로 반환해준ㄷ다.
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false
         * next() :  다음 요소를 반환
         *
         * Collection 인터페이스의 Iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         * 인덱스로 관리되는 컬렉션이 아닌 경우에 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어 주는 역할이다.
         * */

        Iterator<String> dIter = ((LinkedList<String>) str).descendingIterator();

     /*   while (dIter.hasNext()) {
            System.out.println("dIter.next() = " + dIter.next());
        }
        System.out.println("====================================================");
        while (dIter.hasNext()) {
            System.out.println("dIter.next() = " + dIter.next());
        }*/ //한번 꺼내쓰면 저장할수 없음.

        List<String> decsList = new ArrayList<>();
        //collection 은 인덱스를 사용하지 않으니 반복자를 사용해서 목록을 만들어주는 역할을 함.

        while (dIter.hasNext()){
            decsList.add(dIter.next());
        }
        System.out.println("decsList = " + decsList); //역순으로 담김
    }
}
