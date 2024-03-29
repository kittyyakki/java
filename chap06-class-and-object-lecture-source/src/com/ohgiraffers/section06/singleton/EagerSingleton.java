package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();
    private EagerSingleton(){} //외부에서 접근못하게

    public static EagerSingleton getInstance(){return eager;}//get이니까 반환값으로 넣어줌
}
