import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        System.out.println(a+b+c);
        System.out.println((a+b+c)/3);

        if (((a+b+c)/3)>=(a+b+c)){
            System.out.println(((a+b+c)/3)-(a+b+c));
        }

        else{
            System.out.println(((a+b+c)-(a+b+c)/3));
        };
    }
}