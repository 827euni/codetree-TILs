import java.util.Scanner;

public class Main {
    static class Weather {
        String date;
        String day;
        String weat;

        public Weather(String date, String day, String weat){
            this.date = date;
            this.day = day;
            this.weat = weat;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weather = new Weather[n];

        for (int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weat = sc.next();

            weather[i] = new Weather(date, day, weat);
        }

        for (int j = 0; j < n; j++){
            if(weather[j].weat.equals("Rain")){
                System.out.println(weather[j].date+" "+weather[j].day+" "+ weather[j].weat);
                break;
            }
        }
        
        
    }
}