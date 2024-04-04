package chap1.Question2;

public class Employee {
    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    public Employee(){}

    public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;


    }

    public int getEmpNo() {
        return 5000;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return "김말숙";
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return "몰라영";
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return "백수";
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return 50;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return '여';
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return 5000;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonusPoint() {
        return 50.56;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getPhone() {
        return "101-15610215";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return "하늘나라";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonusPoint=" + bonusPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
