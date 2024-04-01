package com.ohgiraffers.section01.uses;

public class MemberFinder {

    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers(); //member null아니면 다 보여줘라했던거 호출
    }
}
