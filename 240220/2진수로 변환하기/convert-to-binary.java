import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int idx = 0;

        while(true){
            if (n<2){
                arr[idx++] = n;
                break;
            }
            arr[idx++] = n%2;
            n /= 2;
        }

        for(int i = idx - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }

    }