package com.ohgiraffers.section05;

public class MusicDTO {
   private static int nextId = 1; //static int 선언. Id 1번째부터 시작.

   private int id;
   private String artist;
   private String title;

    public MusicDTO(String artist, String title) { //Id빼고 불러와서
        this.id = MusicDTO.nextId++; // 따로 DTO 아이디 증감식으로 초기화
        this.artist = artist;
        this.title = title;
    }

    public MusicDTO(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MusicDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
