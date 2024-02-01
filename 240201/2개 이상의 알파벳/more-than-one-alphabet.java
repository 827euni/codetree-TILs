import java.util.Scanner;

public class Main {
    public static boolean isTwo(String s){
        int n = s.length();
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                if(s.charAt(i) != s.charAt(j)){
                    return true;
                    
                }
                }
        }
        return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean type = isTwo(s);
        if (type){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}