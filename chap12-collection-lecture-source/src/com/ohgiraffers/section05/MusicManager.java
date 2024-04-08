package com.ohgiraffers.section05;

import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private static List<MusicDTO> musicList = new ArrayList<>();

    public void addList(MusicDTO music){
        musicList.add(music);
    }
    public static List<MusicDTO> selectList(){
        return musicList;
    }

    public List<MusicDTO> searchArtist(String artist){

    }

    public List<MusicDTO> searchTitle(String title){

    }

    public boolean updateMusic(MusicDTO updateMusic){

    }

    public boolean removeMusic(int id){

    }
}

