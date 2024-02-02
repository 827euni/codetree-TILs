import java.util.Scanner;

public class Main {

    public static int toOne(int n, int count){
        if(n==1){
            return count;
        }

        if (n%2 == 0){
            count++;
            return toOne(n/2, count);
        }
        else {
            count++;
            return toOne(n/3, count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int cnt = toOne(n, count);

        System.out.println(cnt);
    }
}