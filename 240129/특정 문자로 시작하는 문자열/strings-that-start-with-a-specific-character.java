import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;
    
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        String alp = sc.next();

        for (int j = 0; j < n; j++){
            if(alp.charAt(0) == arr[j].charAt(0)){
                count++;
                total += arr[j].length();
            }
        }

        float avg = (float) total / count;
        System.out.printf("%d %.2f", count, avg);
    }
}