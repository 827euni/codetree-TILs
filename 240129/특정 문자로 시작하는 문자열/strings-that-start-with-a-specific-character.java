import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // \n이 딸려오면 안됨. 그걸 소비해야함 
        int count = 0;
        int total = 0;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }

        String alp = sc.nextLine();

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