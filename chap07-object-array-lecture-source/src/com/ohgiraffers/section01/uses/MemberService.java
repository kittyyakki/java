package com.ohgiraffers.section01.uses;

public class MemberService {

    public void signUpMember(){
        Member[] members = new Member[5];//메소드 안에 객체배열 생성
        members[0] = new Member(1,"user01","pass01","선덕여왕",20,'여');
        members[1] = new Member(2,"user02","pass02","유관순",30,'여');
        members[2] = new Member(3,"user03","pass03","이순신",35,'남');
        members[3] = new Member(4,"user04","pass04","측천무후",40,'여');
        members[4] = new Member(5,"user05","pass05","세종대왕",60,'남');

        MemberResister memberResister = new MemberResister();
        memberResister.resgist(members);

    }
    public void showAllMember(){
        MemberFinder finder = new MemberFinder(); //finder 객체생성
        for (Member member : finder.findAllMembers()){
            if(member!=null){
                System.out.println(member.getInformation());
            } //만약 member가 null이 아니면!! 다 보여줘라
        }
        System.out.println("=====================================");
    }
}
