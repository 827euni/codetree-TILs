import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hBefore = sc.nextInt();
        int mBefore = sc.nextInt();
        int hAfter = sc.nextInt();
        int mAfter = sc.nextInt();
        int result;

        result = hAfter * 60 + mAfter - (hBefore*60 + mBefore);
        System.out.println(result);
    }
}