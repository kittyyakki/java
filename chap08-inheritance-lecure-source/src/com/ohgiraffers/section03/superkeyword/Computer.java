package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super(); //생성자 명시적 적어줌..
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }//computer 생성 매개변수 생성자

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함...");
    } //부모까지 모두 초기화하는 매개변수 생성자

    public String getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setCpu(String cpu) {

        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        return super.getInformation()
        + "Computer cpu = " + this.cpu +
                ", hdd" + this.hdd + ",ram"+this.ram +"operationSystem = " + this.operationSystem;
    } //부모것의 문자열 메소드 가져옴 + computer(자식것)에 있는 toString(문자열)을 가져온것.

    /*@Override*/
    /*public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem=" + operationSystem +
                '}';
    }*/ //computer(자식것)에 있는 toString(문자열)을 가져온것.
}
