package chap1.Question1;

public class Professor {
    private String name;
    private String major;

    public Professor(){} //생성자

    public Professor(String name, String major) {
        this.name = name;
        this.major = major;
    } //매개변수 생성자

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    } //마찬가지로 get만 가져와줌
}
