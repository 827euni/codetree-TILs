import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        int aMath = Integer.parseInt(arr1[0]);
        int aEng = Integer.parseInt(arr1[1]);

        int bMath = Integer.parseInt(arr2[0]);
        int bEng = Integer.parseInt(arr2[1]);

        if (aMath > bMath) {
            System.out.println("A");
        }
        
        else if (aMath == bMath && aEng > bEng) {
            System.out.println("A");
        }

        else { 
            System.out.println("B");
        }
    }
}