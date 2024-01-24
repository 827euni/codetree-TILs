import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int m = Integer.parseInt(arr[0]);
        double real_m = (double)m/100;
        int kg = Integer.parseInt(arr[1]);

        double bmi = kg / (real_m * real_m);

        int bbmi = (int) Math.floor(bmi);
        System.out.println(bbmi);

        if (bbmi>=25) {
            System.out.println("Obesity");
        }
    }
}