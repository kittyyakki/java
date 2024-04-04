package chap1.Question1;

public class Student {
    private String name;
    private int age;

    public Student(){} //생성자

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    } //매개변수 있는 생성자 호출

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    } //getter만 가져와줌 가져오기만 할것이기 때문.
}
