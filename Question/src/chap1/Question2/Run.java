package chap1.Question2;

public class Run {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[1] = new Employee(20,"dd",20,'여',"앙","아");
        employees[2] = new Employee(20,"d","아","오",20,'여',3000);

        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);


    }
}
