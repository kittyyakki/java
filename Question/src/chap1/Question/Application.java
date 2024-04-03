package chap1.Question;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Member[] members = new Member[5];
        Scanner sc = new Scanner(System.in);

        members[0] = new Member("nada9303",2658,"김알지",30,'여');

        System.out.println("id를 입력해주세요");
        String inputId = sc.nextLine();
        boolean isTrue = false;
        for (Member member : members){
            if(member != null && member.getId().equals(inputId)){
                isTrue = true;
                System.out.println("비밀번호를 입력하세요");
                int inputPass = sc.nextInt();
                if(member.getPass() == inputPass){
                    System.out.println("로그인 하셨습니다.");
                }else {
                    System.out.println("비밀번호를 다시 입력해주세요");
                    inputPass = sc.nextInt();
                    if(member.getPass() == inputPass){
                        System.out.println("로그인 하셨습니다");
                    }else {
                        System.out.println("비밀번호가 틀렸습니다.");
                    }
                }
                break;
            }
        }
        if(!isTrue){
            System.out.println("해당 아이디가 존재하지 않습니다.");
        }



    }
}
