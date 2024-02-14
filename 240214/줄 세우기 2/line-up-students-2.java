import java.util.Arrays;
import java.util.Scanner;

class Student {
    int index;
    int h;
    int w;

    public Student(int index, int h, int w) {
        this.index = index;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(i+1, h, w); 
        }

        Arrays.sort(students, (a, b) -> {
            if (a.h != b.h) {
                return a.h - b.h;
            } 
            else {
                return b.w - a.w;
            }
        });

        for (Student student : students) { 
            System.out.print(student.h + " " + student.w + " " + student.index);
            System.out.println();
        }
    }
}