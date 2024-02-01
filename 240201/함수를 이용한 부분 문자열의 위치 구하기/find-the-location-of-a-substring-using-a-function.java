import java.util.Scanner;

public class Main {

    public static int isSeq(String n, String m){
        if (n.contains(m)){
            return n.indexOf(m);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();

        System.out.println(isSeq(n, m));
    }
}