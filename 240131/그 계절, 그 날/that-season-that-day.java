import java.util.Scanner;

public class Main {

    public static String isSeason(int y, int m, int d){
        boolean date = isExist(y,m,d);
        if (date == true){
            if (m >= 3 && m <= 5) {
                return "Spring";
            } 
            else if (m >= 6 && m <= 8) {
                return "Summer";
            } 
            else if (m >= 9 && m <= 11) {
                return "Fall";
            } 
            else{
                return "Winter";
            } 
        }
        else{
            return "-1";
        }
    }

    public static boolean isExist(int y, int m, int d){
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        String season = isSeason(y, m, d);
        System.out.println(season);
    }
}