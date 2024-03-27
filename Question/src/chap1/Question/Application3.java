package chap1.Question;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 :");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 :");
        int num2 = sc.nextInt();

        if(num1 >=10 || num2 >= 10){
            System.out.println("입력한 정수 중에 10이상인 수가 있습니다");
        }else {
            System.out.println("입력한 정수 중에 10이상인 수가 없습니다");
        }

    }
}
