import java.util.*;

public class StudentClassCreating {

    static class Student {
        String name;
        int mark;

        Student(String name, int mark) { // Fixed constructor syntax
            this.name = name;
            this.mark = mark;
        }

        public void addExtraMarks(int extra) {
            this.mark += extra; 
            mark=mark>100?100:mark;// Fixed assignment operator
        }

        public String toString() {
            return name + ":" + mark; // Fixed return format
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // Fixed variable declaration
        List<Student> students = new ArrayList<>();

        for (int ctr = 0; ctr < N; ctr++) { // Fixed loop condition
            String studentDetails[] = sc.nextLine().trim().split("\\s+");
            students.add(new Student(studentDetails[0], Integer.parseInt(studentDetails[1]))); // Fixed array indexing
        }

        for (Student stud : students) {
            stud.addExtraMarks(sc.nextInt());
            System.out.println(stud);
        }

        sc.close(); // Close the scanner
    }
}
