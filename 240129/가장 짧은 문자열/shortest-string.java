import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int maxNum = Math.max(a.length(), Math.max(b.length(), c.length()));
        int minNum = Math.min(a.length(), Math.min(b.length(), c.length()));

        System.out.println(maxNum-minNum);
    }
}