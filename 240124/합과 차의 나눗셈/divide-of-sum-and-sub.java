import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if (b==0) {
            System.out.println("1.00");
        }
        else{
        double result = (double) (a + b) / (a - b);
        System.out.println(Math.round(result * 100) / 100.0);
        }

    }
}