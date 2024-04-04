package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 정렬 기능을 이해할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1,"홍길동","허균",5000));
        bookList.add(new BookDTO(2,"김알지","헛소리",200));
        bookList.add(new BookDTO(3,"오나라","하랑",300));
        bookList.add(new BookDTO(4,"박은빈","푸바오",10000));
        bookList.add(new BookDTO(5,"선우선","치약",2000));

        /*제레닉 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 가능하다.  */
        //Collections.sort(bookList); //제한되었기 때문에 불가능

        for(BookDTO book : bookList){
            System.out.println(book);
        } //출력만 할것이니 향상된 for문으로 출력

        bookList.sort(new AscendingPrice()); //getPrice의 AscendingPrice메소드 활용한 객체 생성
        System.out.println("==================가격 오름차순 정렬=====================");

        for(BookDTO book : bookList){
            System.out.println(book);
        }//출력만 할것이니 향상된 for문으로 출력

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() >= o2.getPrice()? -1 : 1;
            } //삼항연산자로 같으면 양수 음수로 정렬위치는 바꿔주는 것임!!
        }); //익명 클래스 BookDTO안에 있는 AscendingPrice안에 override 안하고 바로 가능

        System.out.println("가격 내림차순 정렬=====================");
        for (BookDTO book :  bookList){
            System.out.println(book); //가격이 내림차순으로 정렬됨
        }
    }
}
