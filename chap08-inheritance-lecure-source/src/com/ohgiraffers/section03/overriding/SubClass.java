package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{
     /* 1. 메소드 이름을 변경하면 에러 발생*/

   /* @Override
    public void method2(int num) {

    }*/ //이름 에러발생

    /*@Override
    public int method(int num) {
        return 0;
    }*/ //리턴타입 변경 에러발생


    /*@Override
    public void method(String num) {

    }*/  //매개변수 갯수나 타입이 변경되면 에러발생

    /* 4. 메소드이름, 리턴타입, 매개변수의 갯수, 타입, 순서가 일치할 경우 오버라이딩 성립.*/
    @Override
    public void method(int num) {

    }
    /*@Override
    private void privateMethod(){}*/
    /* 5. private 메소드는 오버라이딩 불가 !!*/

    /*@Override
    public final void finalMethod(){}*/
    //final 키워드는 안된다.
    /*@Override
    void protectedMethod(){}*/ //좁은 범위라서 불가능!!!
   /* @Override
    protected void protectedMethod(){}*///같은범위 protected

    @Override
    public void protectedMethod(){} // 더 넓은 범위라서 가능하다

     /* 참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드이다.(클래스 확장 불가)안된다는말*/
}
