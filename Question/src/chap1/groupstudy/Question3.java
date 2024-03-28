package chap1.groupstudy;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요");
        int r = sc.nextInt();

        double d1 = 2 * r * 3.14;
        double d2 = r * r * 3.14;

        System.out.println("원의 둘레 : " + d1);
        System.out.println("원의 면적 : " + d2);
    }
}
