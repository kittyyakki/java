package chap1.groupstudy;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");

        int num1 = sc.nextInt();
        System.out.println("학년을 입력하세요");
        int num2 = sc.nextInt();

        if (num1>=60){
            System.out.println("합격입니다");
        }else if (num2 == 4 && num1 >=70){

        }else{

        }

    }
}
