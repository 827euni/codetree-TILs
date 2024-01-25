import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[10];

        while(true){
            int n = sc.nextInt();

            if (n==0){
                break;
            }

            else {
                count[(int)Math.floor(n/10)]++;
            }
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + count[i]);
    }
}}