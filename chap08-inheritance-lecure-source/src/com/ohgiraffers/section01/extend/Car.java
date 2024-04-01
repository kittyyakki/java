package com.ohgiraffers.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car(){
        /*super(); //명시적 묵시적 상속구문 //javaclass */
        System.out.println("Car class 기본 생성자 호출함...");
    }
    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다~");
    }
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵!!!!!!빵!!!!!!!!");
        }else {
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    //private boolean isRunning(){
    // private 이라 못 가져오니 protected 로 가져옴!

        protected boolean isRunning(){
        return runningStatus;

    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
