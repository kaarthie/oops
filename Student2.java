import java.util.Scanner;

class Student2 {
    private String name;
    private int rollNo;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student2[] students = new Student2[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student2();
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            students[i].setName(scanner.nextLine());

            System.out.print("Roll No: ");
            students[i].setRollNo(scanner.nextInt());

            System.out.print("Marks: ");
            students[i].setMarks(scanner.nextDouble());

            scanner.nextLine(); // Consume newline
        }

        System.out.println("\nStudent details:");
    }
}

