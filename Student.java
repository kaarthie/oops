import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new Student();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            students[i].setName(name);

            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            students[i].setRollNo(rollNo);
        }

        System.out.println("\nStudent details:");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Roll No: " + students[i].getRollNo());
            System.out.println();
        }
    }
}
