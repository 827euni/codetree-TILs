import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int result;
        int m2Month = 0;
        int m1Month = 0;
        
        for (int i = 0; i<m2; i++){
            m2Month += num_of_days[i];
        }

        for (int j = 0; j<m1; j++){
            m1Month += num_of_days[j];
        }
        result = m2Month + d2 - (m1Month + d1) + 1;
        System.out.println(result);
    }
}