package Question;

import static Question.TestMethod.TestRandom;

public class Application1 {
    public static void main(String[] args) {

        TestMethod tm = new TestMethod();
        tm.Calculator(2, 5);

        System.out.println("=================");

        double circle = tm.CircleArea();
        System.out.println("원의 넓이는 " + circle + "입니다.");

        System.out.println("=================");

        String str = TestRandom();
        System.out.println(str);

    }
}
