package com.ohgiraffers.section01.uses;

public class MemberRepository {
    private final static Member[] member; //final 은 초기화!!해줘야함
    public static Member[] findAllMembers;
    private static int count;

    static {
        member = new Member[10];
    }//static 으로 초기화해줬음!!

    public static boolean store(Member[] members){
        for(int i = 0; i< members.length; i++){
            member[count++] =  members[i]; //members 가 더 작기때문에 members 로 방정해줌.member10까지만 돌리겠다!!count
        }
        return true; //while true로 넣어야 돌아가기때문
    }

    public static Member[] findAllMembers(){
        return member;
    }
}
