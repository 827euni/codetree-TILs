import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int[] count = new int[10];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i<n; i++){
            count[arr[i]]++;
        }

        for (int i = 1; i<=9; i++){
            System.out.println(count[i]);
        }
    }
}