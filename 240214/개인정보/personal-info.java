import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int height;
    float weight;

    public Student(String name, int height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            float weight = sc.nextFloat();
            

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight);
        }
        System.out.println();
        Arrays.sort(students, (a, b) -> b.height - a.height);
        System.out.println("height");
        for (int i = 0; i < 5; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight);
        }

    }
}