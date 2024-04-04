package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다.*/

        //RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // Animal 타입 Interface 타입은 받을수 없다.

        //RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>(); //하위 종속자가 아니기때문에 불가

        //RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();  // 이하

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(); //가능~~
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry(); //작은거 에서 큰걸로 가니까 묵시적으로 가능하단 얘기
        farm4.getAnimal().cry(); //형변환 생략가능

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry(); //farm 의 후손까지 형변환 가능

        farm5.setAnimal(new DrunkenBunny());
        farm5.getAnimal().cry();  //farm 의 후손까지 형변환 가능

    }
}
