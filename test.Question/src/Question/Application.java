package Question;

public class Application {
    public static void main(String[] args) {
      boolean isTrue = true;
      byte bnum = 10;
      short snum = 20;
      int inum = 30;
      long lnum = 40L;
      float fnum = 50.5f;
      double dnum = 60;
      char cha = 'A';

      int sum = inum + (int)lnum;

      String result = (sum>0) ? "양수입니다" : "음수입니다";

    }
}
