import java.util.Scanner;

public class Main {

    public static int isSeq(String n, String m){
        int i = 0;
        int j = 0;
        for (i = 0; i<n.length() && j<m.length(); i++){
            if(n.charAt(i) == m.charAt(j)){
                j++;
            }
        }

        return i-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();

        System.out.println(isSeq(n, m));
    }
}