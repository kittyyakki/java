package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        BufferedReader in = null; //파일을 읽어오는 기능을 하는 클래스

        try {
            in = new BufferedReader(new FileReader("test.dat"));

            String s;
            while ((s = in.readLine()) != null) { //s가 null 이 아니면
                System.out.println(s);
            }

        } catch (FileNotFoundException e) { //좁은범위
            e.printStackTrace(); //stack쌓인대로 역순으로 출력해줘
        } catch (IOException e) { //넓은범위의 IOException으로 가게
            e.printStackTrace();
        } finally {       //성공하든 못하든 무조건 실행하는 문

            //.NullPointerException 이 발생한다.
            // null을 참조하는 상태에서 참조 연산자를 사용시 발생하는 예외이다.
            if (in != null) {//in close()
                try {
                    in.close(); //만족하면 실행
                } catch (IOException e) {  //아니면 밑으로 가서 에러발생
                    e.printStackTrace();
                }

            }
        }

    }
}
