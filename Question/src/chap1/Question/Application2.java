package chap1.Question;

public class Application2 {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		 >>앞이 true이기 때문에 뒤엔 볼 필요가 없음.
		System.out.println(y += 10 - x++);
		 >>15 -2 = 13 ()으로 묶어 주지 않았기때문에 +1연산이 안됨
		System.out.println(x+=2);
		 >>4
		System.out.println( !('A' <= c && c <='Z') );
		 >>false 'A'와 같거나 크다인데 앞에 !(not)이 들어갔으니 부정문으로 false
		System.out.println('C'-c);
		 >>'C'의 아스키코드는 67 - 65 : 2
		System.out.println('5'-'0');
		 >>5 ''는 숫자로 변환되기 때문에 바로 5-0 : 5
		System.out.println(c+1);
		 >>65+1 : 66
		System.out.println(++c);
		 >>66 +1 앞에서 증가
		System.out.println(c++);
		 >>66 +1 뒤에서 증가
		System.out.println(c);
		 >> 65

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
    }
}
