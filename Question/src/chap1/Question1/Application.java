package chap1.Question1;

public class Application {
    public static void main(String[] args) {
        Student[] students = {
                new Student("김나라",30),
                new Student("오나라",20),
                new Student("한나라",10)
        };
        Professor[] professors = {
                new Professor("다나라","역사"),
                new Professor("바나라","영어"),
                new Professor("사나라","국어")
        };

        University university = new University(students,professors);

        university.showStudent();
        university.showProfessors();
    }
}
