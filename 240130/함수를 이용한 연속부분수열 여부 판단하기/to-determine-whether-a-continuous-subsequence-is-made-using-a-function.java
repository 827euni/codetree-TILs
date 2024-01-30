import java.util.Scanner;

public class Main {
    public static boolean isSame(int[] arrA, int[] arrB){
        int j = 0;

        int n1 = arrA.length;
        int n2 = arrB.length;
        for (int i=0; i<n1 && j<n2; i++){
            if(arrA[i] == arrB[j]){
                j++;
            }
        }

        return j == n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];

        for (int i = 0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }
        for (int j = 0; j<n2; j++){
            arrB[j] = sc.nextInt();
        }

        boolean answer = isSame(arrA, arrB);

        if (answer==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}