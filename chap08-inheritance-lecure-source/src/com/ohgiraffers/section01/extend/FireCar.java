package com.ohgiraffers.section01.extend;

public class FireCar extends Car{//부모의 private 와 생성자는 상속받을수 없다.

    public FireCar(){

        super();//부모상속자의 생성자 상속 없어도 작동은하나, 명시적으로 명시해줘야함!!
        System.out.println("FireCar 클래스의 기본 생성자 호출됨");
    }

    @Override //메소드의 재정의 (상속) //isRunning 으로 호출
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빵빵빵빵빵빵!!!빵빠아앙ㅇ아아아아앙!!!!!!!!!");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다 비켜주세요 비키세요~~~.");
        }
    }
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다 물을 뿌립니다===================");
    }
}
