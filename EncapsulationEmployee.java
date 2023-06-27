package Encapsulation;

public class EncapsulationEmployee {
    private String name;
    private int age;
    private double salary;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Main {
    public static void main(String[] args) {
        EncapsulationEmployee employee = new EncapsulationEmployee();
        employee.setName("Karthi");
        employee.setAge(21);
        employee.setSalary(20000);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
