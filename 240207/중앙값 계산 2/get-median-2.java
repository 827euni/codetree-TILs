import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (i % 2 == 0){
                int[] subArr = Arrays.copyOfRange(arr, 0, i+1);
                Arrays.sort(subArr);
                int m = subArr[i/2];
                System.out.print(m + " ");
            }
        }

    }
}