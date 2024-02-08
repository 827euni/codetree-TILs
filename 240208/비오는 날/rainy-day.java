import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    static class Weather {
        LocalDate date;
        String day;
        String weat;

        public Weather(LocalDate date, String day, String weat){
            this.date = date;
            this.day = day;
            this.weat = weat;
        }
    }

    public static Weather getNearRain (Weather[] weather){
        LocalDate currentDate = LocalDate.now();
        Weather nearRain = null;
        long min = Long.MAX_VALUE;

        for (int j = 0; j < weather.length; j++){
            if(weather[j].weat.equals("Rain")){
                long diff = ChronoUnit.DAYS.between(currentDate, weather[j].date);
                if (diff < min) {
                    min = diff;
                    nearRain = weather[j];
                }
            }
        }
        return nearRain;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weather = new Weather[n];

        for (int i = 0; i < n; i++){
            String dateStr = sc.next();
            String day = sc.next();
            String weat = sc.next();

            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            weather[i] = new Weather(date, day, weat);
        }

        Weather near = getNearRain(weather);
        System.out.println(near.date.toString() + " " + near.day + " " + near.weat);
        
        
    }
}