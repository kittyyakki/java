package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다.
        *
        *  매개변수(parameter)로 사용 가능한 자료형
        *  1. 기본자료형
        *  2. 기본자료형 배열
        *  3. 클래스 자료형
        *  4. 클래스자료형 배열
        *  5. 가변인자 //가변배열에서 보면 일정하게 갯수가 정해져있지 않는 인자를 말하는데 그것과 동일하다.
        * */

        /* 인스턴스 생성 */
        parameterTest pt = new parameterTest();

        /* 기본자료형으로 전달받는 메소드 확인 */
        int num = 10;
        pt.testPrimaryType(num); //[I@2c8d66b2

        /* 기본자료형 배열을 매개변수로 전달 받는 메소드 호출확인*/
        int[] iarr = new int[]{1,2,3,4,5};
        System.out.println("전달인자로 전달하는 값 = " + iarr); //[I@2c8d66b2
        pt.testPrimaryTypeArray(iarr); //주소값만 동일하게 복사해온 얕은복사 안에있는 값 변경확인!!
        //[I@2c8d66b2

        /*얕은 복사는 단순히 주소값만 복사하기 때문에 복사된 객체와 원본 객체가 동일한 객체를 참조합니다.
        따라서 하나의 객체를 변경하면 다른 객체도 변경됩니다.
        깊은 복사는 객체의 내용을 새로운 메모리 공간에 복사하기 때문에 복사된 객체는 원본 객체와는 완전히 독립적입니다.
        복사된 객체를 변경해도 원본 객체에는 영향을 주지 않습니다.*/

        System.out.print("변경된 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]);
        }
        System.out.println();

        /* 클래스 자료형 */
        RectAngle r1 = new RectAngle(12.5,22.5);
        System.out.println("인자로 전달하는 값 : " +r1);//RectAngle@3cb5cdba
        pt.testClassType(r1); //RectAngle@3cb5cdba
        //값이 둘다 주소값으로 나오는 이유는 클래스도 얕은 복사를 해주기 때문!!
        //우리는 클래스를 넘겨준거라 주소값을 전달해줌

        /* 클래스 자료형 배열은 뒤에 다룬다 */
        /* 가변인자 //꺼내써서 인자는 어떤것이든 가능하다*/
        //가변인자로 전달받은 method는 overloading하지 않는 것이 좋다 왜냐 hobby를 멀 써줄지 모르기 때문!!
        //pt.testVariableLengthArray();
        pt.testVariableLengthArray("라라랄");//가변인자는 전달하지 않아도 에러가안남!! hobby가 없너도!
        pt.testVariableLengthArray("볼링","라라랄");
        pt.testVariableLengthArray("순신이","서핑","게임","야구","농구");//여러개가능
        pt.testVariableLengthArray("메밀이",new String[]{"테니스","롤"}); //String가변인자로 초기화
    }
}
