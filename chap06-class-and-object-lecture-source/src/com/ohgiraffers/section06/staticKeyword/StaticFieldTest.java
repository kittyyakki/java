package com.ohgiraffers.section06.staticKeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;



    public StaticFieldTest(){}

    public int getNonStaticCount() {
        return this.nonStaticCount;
    } //private이라서 끌어다 쓰기위한 this

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }//private이라서 끌어다 쓰기위한 method명을 써주는게 this보다 관례임.(static에서)

    public void increaseNonStaticCount(){this.nonStaticCount++;}
    //캡슐화가 되있기 때문에 this로 들어감 근데 non-static이기때문에 접근이 불가하니 써주는거야.
    public void increaseStaticCount(){StaticFieldTest.staticCount++;}
    //static이기 때문에 접근 가능하지 ?그래서 우리는 써줄때 클래스명.필드명 이렇게 써줘야함!!
}
