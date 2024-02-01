import java.util.Scanner;

public class Main {
    
    public static void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;

        System.out.print(m+ " " + n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        swap(m, n);

    }
}