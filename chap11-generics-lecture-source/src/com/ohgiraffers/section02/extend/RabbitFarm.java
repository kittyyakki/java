package com.ohgiraffers.section02.extend;

//public class RabbitFarm <T implements Animal> {} 에러남
//public class RabbitFarm <T extends Animal> { //Interface 상속 받을때 extends 로 받아줘야함!!} //정상 오류안남
//public class RabbitFarm <T extends Rabbit>{}
//public class RabbitFarm <T extends Rabbit & Animal>{}
//이것은 Animal 부모이면서 rabbit 인것을 말한다. //반드시 클래스가 앞에 인터페이스가 뒤로 와야 가능하다!!!
//public class RabbitFarm <T extends Rabbit ,Snake>{}
//이것은 Rabbit 이면서 Snake 인것을 말한다.

public class RabbitFarm <T extends Rabbit >{  //범위를 지정해서 상속관계에 있는 것들만 가져올수 있게 해줬음
    private T animal;

    public RabbitFarm(){} //기본생성자
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
