package chap1.Question1;

public class University {
    private Student[] students;
    private Professor[] professors;

    public University(){}

    public University(Student[] students, Professor[] professors) {
        this.students = students;
        this.professors = professors;
    }

    public void showStudent(){
        System.out.println("학생목록 : ");
        for (Student student : students){
            System.out.println("이름" + student.getName()+ ", 아이디 " + student.getAge());
        }
    }
    public void showProfessors(){
        System.out.println("교수님 목록 : ");
        for (Professor professor : professors){
            System.out.println("이름" + professor.getName()+ ", 전공 " + professor.getMajor());
        }
    }
}
