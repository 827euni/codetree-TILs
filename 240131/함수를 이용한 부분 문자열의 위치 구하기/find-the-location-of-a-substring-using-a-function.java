import java.util.Scanner;

public class Main {

    public static int isSeq(String n, String m){

        
        for (int i = 0; i<n && j<m; i++){
            n.charAt(i) == m.charAt(j);
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();

        System.out.println(isSeq(n, m))
    }
}