package chap1.DTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO("dkdk",30,'여',true);
        System.out.println(member.toString());
    }
}