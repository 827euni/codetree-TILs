import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] arr1 = s1.split(" ");
        String s2 = sc.nextLine();
        String[] arr2 = s2.split(" ");
        String s3 = sc.nextLine();
        String[] arr3 = s3.split(" ");

        String aName = arr1[0];
        String bName = arr2[0];
        String cName = arr3[0];

        int aTem = Integer.parseInt(arr1[1]);
        int bTem = Integer.parseInt(arr2[1]);
        int cTem = Integer.parseInt(arr3[1]);

        String aResult;
        String bResult;
        String cResult;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        if (aName.equals("Y")){
            if (aTem >= 37){
                aResult = "A";
                countA++;
            }
            else {
                aResult = "C";
                countC++;
            }
        }

        else {
            if (aTem >= 37){
                aResult = "B";
                countB++;
            }
            else {
                aResult = "D";
                countD++;
            }
        }

        if (bName.equals("Y")){
            if (bTem >= 37){
                bResult = "A";
                countA++;
            }
            else {
                bResult = "C";
                countC++;
            }
        }

        else {
            if (bTem >= 37){
                bResult = "B";
                countB++;
            }
            else {
                bResult = "D";
                countD++;
            }
        }       

        if (cName.equals("Y")){
            if (cTem >= 37){
                cResult = "A";
                countA++;
            }
            else {
                cResult = "C";
                countC++;
            }
        }

        else {
            if (cTem >= 37){
                cResult = "B";
                countB++;
            }
            else {
                cResult = "D";
                countD++;
            }
        }

        System.out.print(countA + " " + countB + " " +countC + " " +countD + " ");

        if (countA >= 2){
            System.out.println("E");
        }
    }   
}