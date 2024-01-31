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
        boolean feb = isFeb(y);
        
        if (y>3000){
            return false;
        }
        
        if (m>12 || m<=0){
            return false;
        }

        if (((m == 4 || m == 6 || m == 9 || m == 11) && (d < 1 || d > 30)) || ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d < 1 || d > 31))) {
            return false;
        }


        if (m == 2) {
            if (isFeb(y) && d > 29) {
                return false;
            } else if (!isFeb(y) && d > 28) {
                return false;
            }
        }

        return true;
    }

    public static boolean isFeb(int y){
        if (y%4==0){
            return true;
        }

        if (y%4==0 && y%100==0){
            return false;
        }
        if (y%4 ==0 && y%100 ==0 && y%400 == 0){
            return true;
        }

        return false;
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