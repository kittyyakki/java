package chap1.DTO;

public class MemberDTO {

    private String name;

    private int age;
    private char gender;
    private boolean isTrue;

    public MemberDTO(){}

    public MemberDTO(String name, int age, char gender, boolean isTrue) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isTrue = isTrue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isTrue() {
        return isTrue;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isTrue=" + isTrue +
                '}';
    }
}
