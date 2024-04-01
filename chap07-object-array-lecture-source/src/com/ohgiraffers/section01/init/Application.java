package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {
        /*
         * 객체 배열에 대해 이해할 수 있다.
         *
         * 객체배열은 레퍼런스 변수에 대한 배열이다.
         * 생성한 인스턴스도 배열을 이용해서 관리하면
         * 동일한 타입 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다
         * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
         * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 이용할 수 있다.
         * */

        Car car1 = new Car("페라리",300); //선언과 동시에 초기화
        Car car2 = new Car("람보리기니",350);
        Car car3 = new Car("부가티",400);
        Car car4 = new Car("롤스로이스",450);
        Car car5 = new Car("포터",500);


        car1.deiverMaxSpeed(); //객체에 대한 메소드 호출
        car2.deiverMaxSpeed();
        car3.deiverMaxSpeed();
        car4.deiverMaxSpeed();
        car5.deiverMaxSpeed();
        System.out.println("=============================================");

        Car[] carArray = new Car[5]; //객체배열 생성
        carArray[0] = new Car("페라리",300);
        carArray[1] = new Car("람보리기니",350);
        carArray[2] = new Car("부가티",400);
        carArray[3] = new Car("롤스로이스",450);
        carArray[4] = new Car("포터",500);

        for(int i=0; i< carArray.length; i++){
            carArray[i].deiverMaxSpeed();
        } //반복문으로 객체 관리

        System.out.println("=============================================");

        Car[] carArray1 = {
                new Car("페라리",300),
                new Car("람보리기니",350),
                new Car("부가티",400),
                new Car("롤스로이스",450),
                new Car("포터",500)

        }; //객체배열로 값 초기화 후 반복문으로 메소드 호출
        for (Car c : carArray1){
            c.deiverMaxSpeed();//할당과 동시에 객체관리
        }

    }


}
