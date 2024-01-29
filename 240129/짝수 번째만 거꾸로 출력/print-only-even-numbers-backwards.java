import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        if (s.length() % 2 == 0){
            for (int i = s.length()-1; i>=0; i-=2){
                System.out.print(s.charAt(i));
            }
        }
        else { 
            for (int i = s.length()-2; i>=0; i-=2){
                System.out.print(s.charAt(i));
            }
        }
    }
}