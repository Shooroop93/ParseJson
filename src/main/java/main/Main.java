package main;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static String city = "Санкт Петербург";

    public static void main(String[] args) throws Exception {

        final String url1 = "https://api.openweathermap.org/data/2.5/forecast?lat=59.931184&lon=30.3609&units=metric&lang=ru&appid=<<KEY>>";
        double average = 0;

        ParseJson.get(url1);

        GsonParse gsonParse = new GsonParse();
        Root root = gsonParse.parse();

        List<Double> max_temp = new ArrayList<>();
        List<String> time = new ArrayList<>();
        int count = 0;
        double maxTempInTheMorning;

        for (Value value : root.getList()) {
            if (value.getDt_txt().contains("03:00:00")) {
                count++;
                max_temp.add(value.getMain().getTemp_max());
                time.add(value.getDt_txt());

            } else if (value.getDt_txt().contains("06:00:00")) {
                count++;
                max_temp.add(value.getMain().getTemp_max());
                time.add(value.getDt_txt());

            } else if (value.getDt_txt().contains("09:00:00")) {
                count++;
                max_temp.add(value.getMain().getTemp_max());
                time.add(value.getDt_txt());

                maxTempInTheMorning = Collections.max(max_temp);

                System.out.println("Максимальная температура утром " + time.get(max_temp.indexOf(maxTempInTheMorning)) + " " + maxTempInTheMorning + " градусов, в городе " + city);

                average += value.getMain().getTemp();

                count = 0;
                max_temp.clear();
                time.clear();
            }
        }

        System.out.println("Средняя температура утром " + average / 5 + ", в городе " + city + " градусов");

    }

}
