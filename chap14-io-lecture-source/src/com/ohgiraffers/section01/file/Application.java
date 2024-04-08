package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /*
        *  JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다
        *  대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등등의
        *  처리를 수행하는 기능을 제공하고 있다.
        * */

        File file = new File("src/com/ohgiraffers/section01/file/test.txt");

        /*boolean createSuccess;*/

        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess = " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + file.length()+ " byte "); //파일크기
        System.out.println("파일의 경로 : " + file.getPath()); //파일경로
        System.out.println("현재 파일의 상위경로 : " + file.getParent()); //상위경로
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath()); //절대경로

        //한번 더 run 돌리면 false 가 나옴 이 뜻은 한번만든 파일이기 때문에 
        
        
        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess = " + deleteSuccess); //true 파일삭제
        
        

    } 
    
    

}
