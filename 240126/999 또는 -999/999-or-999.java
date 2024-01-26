import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[10]; // 최대 10개의 숫자를 저장할 배열
        int n;

        while (true) {
            if (!sc.hasNextInt()) {
                break;
            }

            n = sc.nextInt();

            if (n == 999 || n == -999) {
                break;
            }

            if (n > max && n != 999) {
                max = n;
            }

            if (n < min && n != -999) {
                min = n;
            }
        }

        System.out.println(max + " " + min);
    }
}