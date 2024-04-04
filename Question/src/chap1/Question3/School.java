package chap1.Question3;

public class School {
    public static void main(String[] args) {
        // Student 객체 생성
        Student student1 = new Student("김나라",30,);
        Student student2 = new Student();

        // 추상 메서드 호출
        student1.study();
        student2.study();
        // 추상 메서드 호출
        student1.introduce();
        student2.introduce();

    }
}
