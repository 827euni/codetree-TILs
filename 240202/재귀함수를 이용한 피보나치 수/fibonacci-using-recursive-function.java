import java.util.Scanner;

public class Main {

    public static int Fibo(int n){

        if (n==1){
            return 1;
        }

        else if (n==2){
            return 1;
        }

        return Fibo(n-2) + Fibo(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Fibo(n));

    }
}