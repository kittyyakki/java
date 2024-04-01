package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
        * 상속에 대해 이해할 수 있다.
        * 상속은 현실 세계 상속과 비슷한 개념이다.
        * 부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미이다.
        * 클래스 또한 부모클래스와 자식클래스로 역할을 나누어서 부모가 가지는 멤버를 자식이 물려받아
        * 자기의 멤버인 거처럼 사용할 수 있도록 만든 기술이다.
        *
        * 단순 물려받는 개념보다 조금 더 나아간다면 자바에서의 상속은
        * 부모클래스의 확장(extend)의 개념을 가진다.
        * 물려 받아서 자신의 것처럼 사용하는 것 뿐만 아니라 추가적인 멤버도 작성이 가능하다.
        * 특히 메소드 재정의(overriding)라는 기술을 이용해서 부모가 가진 메소드를 재정의하는 것도 가능하다.
        * */

        /*
        * 메소드 재정의(overriding)이란?
        * 부모가 가지는 메소드 선언부를 그대로 사용하면서 자식 클래스가 정의한 메소드대로 동작하도록
        * 구현 몸체 부분을 새롭게 다시 작성하는 기술이다.
        * 메소드 재정의를 하면 메소드를 호출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
        * */

        /*
        * 이러한 상속이라는 기술을 사용하게 되면 얻게 되는 이점은 두 가지가 있다.
        * 1. 새로운 클래스를 작성시 기존에 작성한 클래스를 재사용할 수 있다.
        * 1-1 재사용 시 생산성을 크게 향상시킬수 있다.(새롭게 작성하는 거보다 빠르다)
        * 1-2 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항이 생길 시 부모 클래스만 수정해도 전체적으로
        *     적용된다(유지 보수성 증가)
        * 2. 클래스간의 계층 관계가 형성되며 다형성의 문법적인 토대가 된다.
        * */

        /*
        * 상속으로 인한 단점
        * 1. 부모클래스의 기능을 추가/변경시에 자식클래스가 정상 동작하는지 예측이 힘들다.
        *    상속구조가 복잡해질 수록 그 영향에 대한 예측이 힘들어 이런 단점이 유지보수성이 증가한다는 장점과는 반대로
        *    유지보수에 악영향을 미친다.
        * 2. 또한 부모클래스 변경 또한 쉽지 않다. 자식 클래스에서 중요하게 사용하는 기능인 경우 부모클래스 변경할 시
        *    자식 클래스에 모두 영향을 줄 수 있다. 역시 유지보수에 악영향을 미친다.
        * 3. 부모클래스에서는 의미있었던 기능들이 자식 클래스에서는 무의미할 수 있다.(불필요한 기능이 추가됨)
        *
        * */

        /*
        * 장점과 단점을 고려했을 때 상속은 재사용이라는 장점만을 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에
        * 좋지 않은 코드를 작성할 확률이 높다.
        * 상속은 IS-A 관례로 구분되는 경우에만 사용해야 한다.
        * */

        /*
        * 객체지향 설계 관점에서 바라보는 상속
        * 모든 객체는 자신이 수신한 메세지에 대한 응담을 해야하는 책임을 가지고, 그 책임의 규모는 적절해야한다.
        * 적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응담)을 통해 프로그램이 동작하는 것을
        * 객체지향 프로그램이라고 한다.
        * */

        /*
        * 적절한 책임을 수행하는 객체 또한 그 객체만 수행할 수 있는 기능이라기 보다 역할의 관점으로 바라봐야한다.
        * 역할이란 동일한 동작을 수행하는 것을 정의한 것이며, 대체 가능성을 의미한다.
        * 부모 클래스를 추강화하는 경우 역할의 관점으로 바라봐야한다.
        * 그래야 자식 클래스로 생성한 객체들이 서로 역할을 수행해가며 유연한 코드를 작성할 수 있게 된다.
        * 동일한 역할을 가지는 모든 객체는 동일한 메세지를 수신하기는 하지만 객체별로 그 메세지에 응답하는 방식이
        * 서로 다를 수 있다.
        * */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar firecar = new FireCar();
        firecar.soundHorn();
        firecar.run();
        firecar.soundHorn(); //override 후 바뀜
        firecar.stop();
        firecar.soundHorn();

        firecar.sprayWater();

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

    }
}
