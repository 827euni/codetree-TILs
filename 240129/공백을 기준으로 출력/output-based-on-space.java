import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String sum = a+b;
        String answer = sum.replaceAll(" ","");

        System.out.println(answer);
        
    }
}