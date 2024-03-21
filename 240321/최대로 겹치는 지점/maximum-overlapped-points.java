import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];
        int count = 0;

        for (int i=0; i<=100; i++){
            arr[i] = 0;
        }

        for (int i = 0; i<n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for (int j = x1; j<x2; j++){
                arr[j]+=1;
            }
        }
        for (int i = 0; i <= 200; i++) {
            count = Math.max(count, arr[i]);
        }
        System.out.println(count+1);
    }
}