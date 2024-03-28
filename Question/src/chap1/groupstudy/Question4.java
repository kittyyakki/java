package chap1.groupstudy;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("세 명의 학생의 키를 입력하세요");
        System.out.println("첫번째 학생의 키를 입력하세요");
        double n1 = sc.nextDouble();
        System.out.println("두번째 학생의 키를 입력하세요");
        double n2 = sc.nextDouble();
        System.out.println("세번째 학생의 키를 입력하세요");
        double n3 = sc.nextDouble();

        double avr = ( n1 + n2 + n3) / 3;

        int intAvr = (int)avr;
        System.out.println("세 명의 학생의 평균 키는 :"+ intAvr + "입니다.");


    }
}
