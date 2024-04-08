package com.ohgiraffers.section05;

import java.util.Comparator;

public class AbcTitle implements Comparator<MusicDTO> { //번복자를 통한 정렬식
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle()); //오름차순 정렬
    }
}
