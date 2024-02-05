import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b / gcd(a, b);
    }

    public static int reLcm(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        else{
            return lcm(arr[n-1], reLcm(arr, n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = reLcm(arr, n);

        System.out.println(result);
    }
}