package com.ohgiraffers.section05;

import java.util.Comparator;

public class FullArtist implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}
