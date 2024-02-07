import java.util.Scanner;

public class Main {

    static class Secret {
        String code;
        String loca;
        int time;

        public Secret(String code, String loca, int time){
            this.code = code;
            this.loca = loca;
            this.time = time;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String l = sc.next();
        int i = sc.nextInt();
        Secret secret = new Secret(c, l, i);

        System.out.println("secret code : " + secret.code);
        System.out.println("meeting point : " + secret.loca);
        System.out.println("time : " + secret.time);
    }
}