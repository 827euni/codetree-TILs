import java.util.Scanner;

public class Main {
    static int[] arr = new int[100];
    public static void sum(Scanner sc, int n, int m){
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int k = 0; k<m; k++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int sum = 0;
            for (int j = a1-1; j<=a2-1; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sum(sc, n, m);

    }
}