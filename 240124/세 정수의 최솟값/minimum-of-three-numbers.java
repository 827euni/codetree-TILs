import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if (a>b) {
            if (b>c) {
                System.out.println(c);
            }
            else {
                System.out.println(b);
            }
        }

        else {
            if (a>c){
                System.out.println(c);
            }
            else {
                System.out.println(a);
            }
        }


    }

}