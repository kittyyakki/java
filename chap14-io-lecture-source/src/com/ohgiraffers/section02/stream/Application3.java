package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /*
        * FileOutputStream
        * 프로그램 데이터를 파일로 내보내기를 위한 용도의 스트림이다
        * 1바이트 단위로 데이터를 처리한다.
        * */

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/com/ohgiraffers/section02/stream/testOutputStream.txt");

            fos.write(97); //txt를 보면 a 로 바껴있음

            byte[] bar = new byte[]{98,99,100,101,102,10}; //아스키코드 , 10은 엔터기능을함
            fos.write(bar);

            fos.write(bar,1,3);


        } catch (FileNotFoundException e) {
            e.printStackTrace(); //에러를 보기위한 출력구문
        } catch (IOException e) {
            e.printStackTrace();  //에러를 보기위한 출력구문
        }finally {
            if (fos != null ){
            try {
                fos.close(); //오류가 나던 안나던 닫아주겠다.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            }
        }
    }
}
