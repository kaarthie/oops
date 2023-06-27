package Encapsulation;

public class EncapsulationStudent {
    private String name;
    private int age;
    private String department;
    public EncapsulationStudent(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Main2 {
    public static void main(String[] args) {
        EncapsulationStudent stu = new EncapsulationStudent("Karthi",21,"CSE");

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Department: " + stu.getDepartment());

        stu.setDepartment("Electrical Engineering");
        System.out.println("Updated Department: " + stu.getDepartment());
    }
}
