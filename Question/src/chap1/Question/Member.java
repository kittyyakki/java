package chap1.Question;

public class Member {
    private String id;
    private int pass;
    private String name;
    private int age;
    private char gender;

    public Member(){} //생성자

    public Member(String id, int pass, String name, int age, char gender) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.age = age;
        this.gender = gender;
    } //매개변수 있는 생성자 호출

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
