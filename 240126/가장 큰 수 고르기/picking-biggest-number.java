import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int MAX = Integer.MIN_VALUE;

        for (int i = 0; i<10;i++){
            arr[i] = sc.nextInt();

            if (arr[i]>MAX){
                MAX = arr[i];
            }
        }
        System.out.println(MAX);

    }
}