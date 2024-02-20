import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String n = sc.nextLine();
        int[] arr = new int[100];
        int idx = 0;

        int num = 0;
        for (int i=0; i<n.length(); i++){
            num = num * a + (n.charAt(i)-'0');
        }

        while(true){
            if(num<b){
                arr[idx++] = num;
                break;
            }
            arr[idx++] = num%b;
            num/=b;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

    }
}