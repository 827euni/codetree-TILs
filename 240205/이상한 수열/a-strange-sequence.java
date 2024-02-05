import java.util.Scanner;
public class Main {
    public static int lastInt(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return lastInt(n-1) + lastInt(n/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = lastInt(n);
        System.out.println(result);
    }
}