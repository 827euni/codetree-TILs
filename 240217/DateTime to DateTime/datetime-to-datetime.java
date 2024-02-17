import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

        result = (a-11) * 24 * 60 + (b-11) * 60 + (c-11);
        if (result>0){ 
            System.out.println(result);
        }
        else{
            System.out.println(-1);
        }
    }
}