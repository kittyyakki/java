package Question;

public class Application {
    public static void main(String[] args) {
        boolean isTrue = true;
        char cha = 'a';
        byte bnum = 1;
        short snum = 2;
        int inum = 14;
        long lnum = 322444L;
        float fnum = 2.3f;
        double dnum = 34.32;

        int sum = inum + (int) lnum;

        String str = (sum > 0) ? "양수입니다." : "음수입니다.";
    }
}
