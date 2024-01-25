import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] count = new int[7];

        for (int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<10; i++){
            count[arr[i]]++;
        }

        for (int i = 1; i<7; i++){
            System.out.print(i + " - " + count[i]);
            System.out.println();
        }
        

    }
}