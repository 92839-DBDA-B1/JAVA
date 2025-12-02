import java.util.*;

class Student {
    private int rollno;
    private String name;
    private double marks;

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() { return rollno; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks;
    }
}

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n----- Student Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    students.add(new Student(roll, name, marks));
                    break;

                case 2:
                    Iterator<Student> itr = students.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int r = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRollno() == r) {
                            System.out.println("Found: " + s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;

                case 4:
                    students.sort(Comparator.comparingInt(Student::getRollno));
                    System.out.println("Sorted by Roll No.");
                    break;

                case 5:
                    students.sort(Comparator.comparing(Student::getName));
                    System.out.println("Sorted by Name.");
                    break;

                case 6:
                    students.sort(Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Sorted by Marks.");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
