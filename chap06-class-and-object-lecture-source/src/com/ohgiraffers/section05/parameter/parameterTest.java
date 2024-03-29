package com.ohgiraffers.section05.parameter;

public class parameterTest {

    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 = " + num);
    }
    public void testPrimaryTypeArray(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 = " + iarr);
        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]);
        }
        System.out.println();

        iarr[0]= 99;

        System.out.print("변경된 값 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]);
        }
        System.out.println();
    }
    public void testClassType(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : "+ rectAngle);
        System.out.println("========사각형 넒이와 둘레===========");
        rectAngle.calcArea();
        rectAngle.calcRound(); //우리는 클래스만 넘겨받았지 위에? 여기서 이제 매개변수를 넘겨주자
        //이렇게하면 결합도가 낮아서 변경할때 매우 쉽겟지?
        //
        //자 이제 주소값이 아닌 값으로 나오지

        rectAngle.setHeight(100);
        rectAngle.setHeight(100); //set값으로 변경!!

        System.out.println("=========변경후 사각형의 넓이와 둘레===========");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    //가변인자 내가 얼마나 매개변수의 크기를 만들지 모르니까 ...을 써줌!
    public void testVariableLengthArray(String name,String...hobby){
        System.out.println("이름 : " +name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        //배열 꺼내오기
        for (int i =0; i< hobby.length; i++){
            System.out.print(hobby[i]+" ");
        }
        System.out.println();
    }
    /*public void testVariableLengthArray(String...hobby){

        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        //배열 꺼내오기
        for (int i =0; i< hobby.length; i++){
            System.out.print(hobby[i]+" ");
        }
        System.out.println();
    }*/ //가변인자 오버로딩 하지 않는거 좋은 이유

}
