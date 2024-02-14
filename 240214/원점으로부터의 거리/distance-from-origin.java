import java.util.Arrays;
import java.util.Scanner;

class Point{
    int id;
    int x;
    int y;
    int dic;

    public Point(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
        this.dic = Math.abs(x) + Math.abs(y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] point = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            point[i] = new Point(i+1,x,y);
        }

        Arrays.sort(point, (a,b)-> {
            if(a.dic!=b.dic){
                return a.dic-b.dic;
            }
            else{
                return a.id - b.id;
            }
            });

        for (Point p : point){
            System.out.println(p.id);
        }
    }
}