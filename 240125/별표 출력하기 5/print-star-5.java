import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) { //세로축 
            for (int j = 0; j < (n - i); j++) { //가로축
                for (int k = 0; k < (n-i); k++){ //별 찍기 반복
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(); 
        }
}

}