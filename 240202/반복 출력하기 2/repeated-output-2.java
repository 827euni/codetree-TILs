import java.util.Scanner;

public class Main {

    public static void printSen(int N){
        if (N==0){
            return;
        }
        printSen(N-1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printSen(N);
    }
}