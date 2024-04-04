package com.ohgiraffers.section02.extend;

public class WildCardFarm {
/* 매개변수로 전달받는 토끼농장을 구현할 때 사용한 타입 변수에 대해 제한할 수 있다.*/

    public void anyType(RabbitFarm<?> farm){
        //토끼농장의 토끼가 어느타입이든 상관이 없다 ?이거 확인
        farm.getAnimal().cry();
    }
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        //토끼농장의 버니이거나 그 후손타입만 매개변수로 사용하겠다.
        farm.getAnimal().cry();
    }
    public void superType(RabbitFarm <? super Bunny> farm){
        farm.getAnimal().cry();
        //토끼농장의 버니이거나 그 부모타입만 매개변수로 사용하겠다.후손은 안됨
    }
}
