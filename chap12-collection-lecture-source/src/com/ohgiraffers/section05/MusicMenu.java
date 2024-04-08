package com.ohgiraffers.section05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicMenu {
   private MusicManager musicManager = new MusicManager(); //MusicManger연결
   private Scanner sc = new Scanner(System.in); //스캐너 생성

   public void mainMenu(){

      mainMenu:

      while (true){
         System.out.println("========== 메뉴 ==========");
         System.out.println("1. 곡 추가");
         System.out.println("2. 곡 전체 조회");
         System.out.println("3. 정렬하여 조회");
         System.out.println("4. 가수명으로 검색");
         System.out.println("5. 곡명으로 검색");
         System.out.println("6. 곡 정보 수정");
         System.out.println("7. 곡 삭제");
         System.out.println("0. 프로그램 종료");

         System.out.println("메뉴 선택 : ");
         int menu = sc.nextInt();
         sc.nextLine();

         switch (menu){
            case 1:
               addList();
               break ;
            case 2:
               selectList();
               break ;
            case 3:
               sortMenu();
               break ;
            case 4:
               searchArtist();
               break ;
            case 5:
               searchTitle();
               break ;
            case 6:
               updateMusic();
               break ;
            case 7:
               removeMusic();
               break ;
            case 0:
               System.out.println("프로그램을 종료합니다.");
               break mainMenu;
            default:
               System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
               break ;
         }

      }
   }
   public void addList(){

      System.out.println("==== 곡 추가 ====");
      System.out.println("가수 입력 : ");
      String artist = sc.nextLine();
      System.out.println("제목 입력 :");
      String title = sc.nextLine();

      musicManager.addList(new MusicDTO(artist,title));
   }
   public void selectList(){

      System.out.println("==== 곡 젠체 조회 ====");
      List<MusicDTO> musicList = musicManager.selectList();
      if (!musicList.isEmpty()){
         for (MusicDTO music : musicList){
            System.out.println(music);
         }
         }else {
         System.out.println("목록이 존재하지 않습니다.");
      }
   }
   public void sortMenu(){
      System.out.println("==== 정렬 메뉴 ====");
      System.out.println("1. 가수명 오름차순 정렬");
      System.out.println("2. 곡명 오름차순 정렬");
      System.out.println("3. 가수명 내림차순 정렬");
      System.out.println("4. 곡명 내림차순 정렬");
      System.out.println("메뉴 선책 :");

      int menu = sc. nextInt();
      abcDsc(menu);

   }
   public void abcDsc(int menu){

      System.out.println("==== 정렬하여 조회 ====");
      List<MusicDTO> musicList = MusicManager.selectList();

      if (musicList.isEmpty()){
         System.out.println("목록이 존재하지 않습니다.");
         return;
      }

      List<MusicDTO> sortList = new ArrayList<>();
      sortList.addAll(musicList);

      if (menu == 1){
         sortList.sort(new Comparator<MusicDTO>() {
            @Override
            public int compare(MusicDTO o1, MusicDTO o2) {
               return o1.getArtist().compareTo(o2.getArtist());
            }
         });
      } else if (menu == 2) {
         sortList.sort(new AbcTitle());
      } else if (menu == 3) {
         sortList.sort(new FullArtist());
      }else {
         sortList.sort(new DceTitle());
      }
      for (int i = 0; i<sortList.size(); i++){
         System.out.println(sortList.get(i));
      }
   }


   public void searchArtist(){
      System.out.println("==== 가수명으로 검색 ====");
      System.out.println("가수명 입력 : ");


   }
   public void searchTitle(){

   }
   public void updateMusic(){

   }
   public void removeMusic(){

   }

}
