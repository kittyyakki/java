package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.conditional.A_if;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample1();
        //a.testForExample2();
        //a.testForExample3();
        //a.printSimpleGugudan();
        A_nestedFor an = new A_nestedFor();
        //an.printGugudanFromTwoToNice();
        //an.printStarInputRowTimes();
        //an.printTriangleStars();

        B_while b = new B_while();
        //b.testSimpleWhileStatement();
        //b.testWhileExample2();

        C_doWhile c = new C_doWhile();
        //c.testSimpleDoWhileStatement();
        c.testSimpleDoWhileStatement1();
    }
}
