import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                for (int k = 0; k < (n-i); k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(); 
        }
}

}