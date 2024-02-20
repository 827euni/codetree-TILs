import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int idx = 0;

        for (int i = 0; i < b.length(); i++) {
            int d = Character.getNumericValue(b.charAt(i));
            idx = idx *2 + d;
        }
        System.out.println(idx);
    }
}