import java.util.Scanner;

public class Main {

    public static int minSq(int n, int m){
        int max = Math.max(n, m);

        while(true){
            if(max % n == 0 && max % m == 0){
                return max;
            }
            else{
                max++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = minSq(n, m);
        System.out.println(answer);
    }
}