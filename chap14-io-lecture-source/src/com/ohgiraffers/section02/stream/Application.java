package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        /*
         *  입출력 스트림 개요
         *  우리는 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
         *  하지만 데이터는 프로그램 내부에 있을 수 도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
         *  또한 프로그램에서 생성한 데이터를 외부로 출력할 수 도있다.
         *
         *
         *  외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
         *  외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수 도 있다.
         *  외부 데이터를 대상으로 작업할 때 가장 먼저 해야 할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다.
         *  프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
         *  스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력스트림 이라고 부른다.
         *
         *
         *  입출력과 관련된 API는 java.io 패키지에서 제공하고 있다.
         *  API 문서에서 목록을 확인해보면 대부분 InputStream/OutputStream, Reader/Writer 로 끝난다.
         *  이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
         *
         *
         *  그 중 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고
         *  OutputStream과 Writer는 데이터를 내보내는 출력스트림이다.
         *  또한 InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
         *  Reader와 Writer계열은 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
         *  참고로 MS949 인코딩에서는 한글 한 글자를 2바이트로 취급하지만 UTF-8에서는 한글 한 글자를 3바이트로 취급한다.
         *
         *
         *  자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
         *  InputStream/OuputStream/Reader/Writer를 빼고 남은 단어가 바로 외부 데이터의 타입이다.
         *  예) FileInputStream은 InputStream을 제거하고 남은 단어가 File이므로 외부 데이터는 File임을 알 수 있다.
         * */


        /*
         *  예외처리
         *  자바 프로그램 작성 시 자바 문법에 맞지 않는 경우
         *  코드를 컴파일 하려고 할 때 컴파일 에러를 발생시킨다. 엄밀히 말하면 문법상의 오류 (Syntax Error)이다.
         *  혹은 자바 문법에 맞게 작성하여 컴파일에 문제가 없더라도, 실행되면서 예상치 못하게 오류가 발생할 수 있다.
         *  컴퓨터 프로그램이 동작하는 도중에 예상치 못한 사태가 발생하여
         *  실행중인 프로그램이 영향을 받는 것을 오류(Error)와 예외(Exception) 두 가지로 구분할 수 있다.
         *
         *  오류(Error)
         *  시스템 상에서 프로그램에 심각한 문제를 발생하여 실행중인 프로그램이 종료되는 것을 말한다.
         *  이러한 오류는 개발자가 미리 예측하여 처리하는 것이 불가능하며, 오류에 대한 처리는 할 수 없다.
         *
         *  예외(Exception)
         *  오류와 마찬가지로 실행중인 프로그램을 비정상적으로 종료시키지만
         *  발생할 수 있는 상황을 미리 예측하고 처리할 수 있는 미약한 오류를 말한다.
         *  개발자는 이러한 예외에 대해 예외처리를 통해 예외 상황을 적절히 처리하여 코드의 흐름을 컨트롤 할 수 있다.
         * */

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;
            /* read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1을 반환 */

            while (true){ //입출력에 대한 오류도 감싸줌
                try {
                    if (((value = fin.read())!= -1)) {

                        System.out.println("value = " + value);
                        System.out.println((char)value); //정수로 읽어옴 int를 올렸으니까

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        } catch (FileNotFoundException e) {
            if (fin != null) {
                try {
                    fin.close();

                    /*
                    * 자원 반납을 해야하는 이유
                    * 1. 장기간 실행 중인 프로그램에서 스트림을 닫지 않는 경우 데이터 누수가 발생
                    * 2. 잔류 데이터가 남은 경우 추가로 스트림을 사용하면 의도치 않는 상태에서 오류가 난다.
                      close() 메소드는 자원을 반납하고 flush() 해주기 때문에 close() 만 제대로 해줘도 된다.
                      * 외부자원을 사용하는 경우 마지막에 호출해줘야 한다.
                      *
                    * */

                } catch (IOException ex) {

                    throw new RuntimeException(ex);
                }finally {

                }
            } //오류는 위임해주는것보다 try catch 로 감싸주는 것이 좋다. 자원을 반납해주기 위해서, 연결통로를 열었으면 닫아줘야함
        }
    }
}
