import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = Integer.parseInt(s);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}