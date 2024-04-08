package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> { //BookDTO 반복자 상속 클래스 생성
    @Override
    public int compare(BookDTO o1, BookDTO o2) { //getPrice를 하나씩 가져와서 정렬을 해준상태.
        int result = 0; //0으로 초기화

        if(o1.getPrice()> o2.getPrice()){
            result = 1; //양수
        } else if (o1.getPrice()< o2.getPrice()) {
            result = -1; //음수
        }else {
            result = 0; //같으면 0
        }
        return result; //result를 반환 이렇게 오름차순을 BookDTO를 오버라이딩해서 오름차순정리
    }
}
