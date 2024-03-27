package Question;
import java.util.Scanner;

public class TestMethod {
    public void Calculator(int num1, int num2) {
        System.out.println("두 수를 더한 값은 " + (num1 += num2) + "입니다.");
        System.out.println("두 수를 뺸 값은 " + (num1 -= num2) + "입니다.");
        System.out.println("두 수를 곱한 값은 " + (num1 *= num2) + "입니다.");
        System.out.println("두 수를 나눈 몫은 " + (num1 /= num2) + "입니다.");
        System.out.println("두 수를 나눈 나머지는  " + (num1 %= num2) + "입니다.");
    }

    public double CircleArea() {
        final double pie = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하세요 : ");
        int r = sc.nextInt();

        double result = pie * r * r;
        return result;
    }

    public static String TestRandom() {
        int randomNumber = (int) (Math.random() * 10) + 1;
        String result = "생성한 난수는 " + randomNumber + "입니다.";
        return result;
    }
}