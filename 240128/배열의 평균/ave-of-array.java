import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int sum = 0;

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<2; i++) {
            int widthSum = 0;
            for (int j = 0; j<4; j++) {
                widthSum += arr[i][j];
            }
            float widthAvg = (float) widthSum / 4;
            System.out.printf("%.1f ", widthAvg);
        }
        System.out.println();

        for (int j = 0; j<4; j++) {
            int heightSum = 0;
            for (int i = 0; i<2; i++) {
                heightSum += arr[i][j];
            }
            float heightAvg = (float) heightSum / 2;
            System.out.printf("%.1f ", heightAvg);
        }
        System.out.println();

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<4; j++) {
                sum += arr[i][j];
            }
        
        }
        float avg = (float) sum / 8;
        System.out.printf("%.1f ", avg);
        
    }
}