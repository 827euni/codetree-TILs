import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        double p = a+b;
        double m = a-b;

        double result = (double)p/m;

        System.out.println(Math.round(result*100)/100.0);

        
    }
}