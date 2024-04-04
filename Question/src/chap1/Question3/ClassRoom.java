package chap1.Question3;

abstract class ClassRoom {  //먼저 추상클래스를 생성 앞에 abstract
    String name;
    int age;

    public ClassRoom(){} //생성자
    public ClassRoom(String name, int age) {
        this.name = name;
        this.age = age;
    } //매개변수 생성자

    // 추상 메서드
    abstract void study();

    // 추상 메서드
    abstract void introduce();
}