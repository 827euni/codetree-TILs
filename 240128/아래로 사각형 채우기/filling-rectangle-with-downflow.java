import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 1; i<=n; i++){
            for (int j = i; j<=n*n; j+=n){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}