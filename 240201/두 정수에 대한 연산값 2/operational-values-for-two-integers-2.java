import java.util.Scanner;

public class Main {
    public static void cacul(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        min += 10;
        max *= 2;

        System.out.print(min + " " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        cacul(a,b);

    }
}