package chap1.Question3;

class Student extends ClassRoom { //학생을 교실로 상속받는 구문
    String grade;



    // 추상 메서드의 구현
    @Override
    void study() {
        System.out.println(name +  grade);
    } //추상메소드의 후손은 override해서 메소드를 가져와야한다!!

    // 추상 메서드의 구현
    @Override
    void introduce() {
        System.out.println(name + age +  grade);
    } //grade추가
}



