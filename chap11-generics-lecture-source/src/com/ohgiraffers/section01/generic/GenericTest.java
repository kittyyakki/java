package com.ohgiraffers.section01.generic;

public class GenericTest<T> { //미리 컴파일러한테 나 이거 할거다!!타입을 지정해주는거임~라고 하는건데 그안에 이제 멀 넣어줘야겟지??
    //타입변수인데 가상으로 존재하는 타입변수라고 할수 잇음 ===컴파일시점에서 타입이 결정되는거임
    //기본자료형이 아니고 객체타입으로 지정된것만 넣어줄수 있어서 Wrapper클래스라고 함.
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    } //얘도 타입이기때문에 리턴값을 가져야함

}
