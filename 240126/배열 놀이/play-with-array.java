import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arrN = new int[n];

        for (int i = 0; i < n; i++){
            arrN[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++){
            int type = sc.nextInt();
            int a = sc.nextInt();
            int b;
            int idx = 0;

            if (type == 1){
                System.out.println(arrN[a-1]);
            }

            else if (type == 2){
                for (int j = 0; j<n; j++){
                    if (arrN[j] == a){
                        idx = j + 1;
                        break;
                    }
                }
                System.out.println(idx);
            }

            else {
                b = sc.nextInt();
                for (int k = a-1; k<b; k++){
                    System.out.print(arrN[k] + " ");
                }
                System.out.println();
            }
    }
}
}