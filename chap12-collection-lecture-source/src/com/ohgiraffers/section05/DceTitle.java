package com.ohgiraffers.section05;

import java.util.Comparator;

public class DceTitle implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
