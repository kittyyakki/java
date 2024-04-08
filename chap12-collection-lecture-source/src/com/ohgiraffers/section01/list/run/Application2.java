package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//그냥 우리가 BookDTO를 DATA타입을 가져올수 없으니 멀 쓰고 멀 정할지 모른단 말이다
//그래서 우리는 compare라는 인터페이스를 통해서 가져오는 것이다.
public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 정렬 기능을 이해할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>(); //<>생성자 생성

        bookList.add(new BookDTO(1,"홍길동","허균",5000));
        bookList.add(new BookDTO(2,"김알지","헛소리",200));
        bookList.add(new BookDTO(3,"오나라","하랑",300));
        bookList.add(new BookDTO(4,"박은빈","푸바오",10000));
        bookList.add(new BookDTO(5,"선우선","치약",2000));
        //add 객체 list만들어줌

        /*제레닉 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 가능하다.  */
        //Collections.sort(bookList); //제한되었기 때문에 불가능

        for(BookDTO book : bookList){
            System.out.println(book);
        } //출력만 할것이니 향상된 for문으로 출력

        bookList.sort(new AscendingPrice()); //sort로 이제 객체 생성가능
        //getPrice의 AscendingPrice메소드 활용한 객체 생성
        System.out.println("==================가격 오름차순 정렬=====================");

        for(BookDTO book : bookList){
            System.out.println(book);
        }//출력만 할것이니 향상된 for문으로 출력 //오버라이딩한것 나옴

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice()? -1 : 1;
            } //삼항연산자로 같으면 양수 음수로 정렬위치는 바꿔주는 것임!!
        }); //익명 클래스 BookDTO안에 있는 AscendingPrice안에 override 안하고 바로 가능
        //익명 클래스는 뒤에 {}를 만들어서 인터페이스를 상속 받는 클래스인데
        //이름이 없다고 생각하고 사용하는 것이다.

        System.out.println("가격 내림차순 정렬=====================");
        for (BookDTO book :  bookList){
            System.out.println(book); //가격이 내림차순으로 정렬됨
        }

        /*
        * Comparator 인터페이스 : List 에 default 메소드인 sort()메소드 인자로
        * 정렬의 기준이 되는 인스턴스를 넣어주게 되면 우리가 오버라이딩한 메소드가 동작하게 되며
        * 그걸 기준으로 삼는다.
        * */
        bookList.sort(new Comparator<BookDTO>() { //자 다시 해보자 익명클래스 생성!!
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            } //양수 음수 0으로 해서 정렬을 한다는 것임. o1 o2비교 (getPrice를 비교)
        });
        System.out.println("제목 오름차순 정렬=====================");
        for (BookDTO book :  bookList){
            System.out.println(book); //제목 오름차순으로 정렬됨
        }
    }
}
