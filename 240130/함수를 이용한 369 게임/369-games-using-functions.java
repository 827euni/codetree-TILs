import java.util.Scanner;

public class Main {
    public static void game(int a, int b){
        int count = 0;
        for (int i = a; i<=b; i++){
            if (i%3==0 || num(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean num(int i){
        while (i > 0){
            int k = i%10;
            if (k==3 || k==6|| k==9){
                return true;
            }
            i = i/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        game(a, b);
    }
}