package com.ohgiraffers.section01.uses;

public class MemberResister {

    public void resgist(Member[] members){
        System.out.println("회원을 등록합니다.");
        for(int i=0; i< members.length;i++){
            System.out.println(members[i].getName() + "님이 회원 등록에 성공했습니다.");
        } //getInformation에서 name으로 받아줌!!

        if(MemberRepository.store(members)){
            System.out.println("총" + members.length+"명의 회원 등록에 성공했습니다.");
        }

    }
}