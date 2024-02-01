import java.util.Scanner;

public class Main {

    public static void evenNum(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n; i++){
            if (arr[i] % 2 == 0){
                arr[i] /= 2;
            }
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        evenNum(arr);

    }
}