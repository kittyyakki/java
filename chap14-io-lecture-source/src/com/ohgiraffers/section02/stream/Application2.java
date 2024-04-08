package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /*
        * FileReader
        * FileInputStream 과 사용하는 방법이 거의 동일하다
        * 단 byte 단위가 아니라 character 단위로 읽어드리는 부분이 차이점이다
        * 따라서 2바이트던 3바이트던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
        *
        * */

        FileReader fr = null;
        try {
            fr = new FileReader("src/com/ohgiraffers/section02/stream/testReader.txt");

            /*int value;

            while ((value = fr.read()) != -1){
                System.out.print((char) value);
            }*/


            char[] carr = new char[(int) new File("src/com/ohgiraffers/section02/stream/testReader.txt").length()];

            fr.read(carr);

            for (int i = 0; i< carr.length; i++){
                System.out.println(carr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace(); //오류가 났을때 보기 위한 구문
        } catch (IOException e) {
            e.printStackTrace();  //add catch만 해주면 맨밑에 catch 추가 되면서 무한루프가 안됨 더 큰 범위로 감싸서 예외처리하기때문.

        }finally {
            if (fr != null) { //if로 처리해주면 쉽게 처리됨.
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
