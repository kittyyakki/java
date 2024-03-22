package chap1.Question;

public class Application1 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;

        System.out.println("num1과 num2의 더하기 결과 : "+ (num1 + num2));
        System.out.println("num1과 num2의 빼기 결과 : "+ (num1 - num2));
        System.out.println("num1과 num2의 곱하기 결과 : "+ (num1 * num2));
        System.out.println("num1과 num2의 나누기 결과 : "+ (num1 / num2));
        System.out.println("num1과 num2의 나누기한 나머지 결과 : "+ (num1 % num2));

        double num3 = 12.5;
        double num4 = 36.4;

        System.out.println("면적 : " + (num3*num4));
        System.out.println("둘레 : " + (num3+num4)*2);
    }


}
