import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int[] arr = new int[100];

        int num = 0;
        for (int i = 0; i<b.length(); i++){
            num = num * 2 + (b.charAt(i)-'0');
        }

        int n = num*17;
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