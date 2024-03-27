package chap1.groupstudy;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 두 정수가 모두 짝수인지 검사하여 출력
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("두 정수 모두 짝수입니다.");
        } else if (num1 % 2 != 0 || num2 % 2 != 0) {
            System.out.println("하나 이상의 정수가 홀수입니다.");
        } else {
            System.out.println("모두 홀수입니다.");
        }

    }
}

