import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();

            if (arr[i]<min){
                min = arr[i];
            }
        }

        for (int j = 0; j<n;j++){
            if (arr[j] == min){
                count++;
            }
        }
        System.out.println(min + " " + count);

    }
}