package com.ohgiraffers.section06.finalKeyword;

public class FinalFieldTest {
    /* final 키워드에 대해 이해할 수 있다.
    *
    * final
    * :final은 종단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다.
    *  1. 지역변수 : 초기화 이후 값 변경 불가
    *  2. 매개변수 : 호출시 전달한 인자 변경 불가
    *  3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    *  4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    *  5. non-static 메소드 : 메소드 재작성 불가
    *  6. static 메소드 : 메소드 재작성 불가
    *  7. 클래스 : 상속 불가
    * */

    /* 1. non-static field에 final사용
    *
    * final은 변경 불가의 의미를 가진다
    * 따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언을 하면서 바로 초기화를 해주어야 한다.
    * 그렇지 않으면 compile error가 발생한다.
    * */

    /*선언과 동시에 초기화를 해주어야 한다.*/
    //private final int NON_STATIC_NUM; 선언만 해주면 에러남

    /*1번째방법*/

    private final int NON_STATIC_NUM  = 1;

    /* 생성자를 이용해서 초기화 함*/
    /*2번째방법*/
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    } //private으로 캡슐화 해줬고, non-static이기 때문에 지역변수가 전역번수보다 우위이니
    // this로 한번더 선언을 해줘서 나 여기 이거 쓸거야!!라고 해주는것임.

    /* 2. static field에 final 사용
    *
    * static에서도 자바에서 지정한 기본값이 대입되기 때문에 final키워드 사용시 초기화를 하지 않으면 에러가 발생한다
    * */
    //private static final int STATIC_NUM; // 에러발생 0 으로 초기화 되기 때문에 이후 값 변경불가
    private static final int STATIC_NUM = 1;

    private static final Double STATIC_DOUBLE;

   /* public FinalFieldTest(int STATIC_NUM) {
        this.STATIC_NUM = STATIC_NUM;
    }*/ //static 에서는 안되지?

    /* 생성자를 이용한 초기화 불가능
    *  생성자는 인스턴스가 생성되는 시점에서 호출이 되기 때문에 그 전에는 초기화가 이루어지지 못한다.
    *  하지만 static 은 프로그램이 start 될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
    *  기본값으로 초기화된 후에 값을 변경하지 못하기 때문에 에러가 발생한다.
    * */

    /* 초기화 블럭으로는 가능하다. */
    static {
        STATIC_DOUBLE = 0.5;
    } //이렇게 하면 된다~~~
}
