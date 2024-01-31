import java.util.Scanner;

public class Main {

    public static boolean isExist(int m, int d){

        
        if (m>12 || m<=0){
            return false;
        }

        if (((m == 4 || m == 6 || m == 9 || m == 11) && (d < 1 || d > 30)) || ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d < 1 || d > 31))) {
            return false;
        }


        if (m==2 && d > 28) {
                return false;
            }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        boolean exist = isExist(m, d);
        if (exist){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}