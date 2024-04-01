package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    } //매개변수 있는 생성자 생성

    public void deiverMaxSpeed(){
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed + "km/h로 달려갑니다.");
    } //메소드생성
}
