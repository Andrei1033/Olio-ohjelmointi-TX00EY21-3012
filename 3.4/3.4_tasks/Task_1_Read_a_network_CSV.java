import java.net.*;
import java.io.*;

public class Task_1_Read_a_network_CSV {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");

            BufferedReader reader = new BufferedReader(new InputStreamReader(myUrl.openStream()));

            String header = reader.readLine();
            String [] columns = header.split(";");

            int ulkoTaloIndex = -1;
            for (int i = 1; i < columns.length; i++) {
                if (columns[i].equals("UlkoTalo")) {
                    ulkoTaloIndex = i;
                    break;
                }
            }

            int timeIndex = -1;
            for (int i = 0; i < columns.length; i++) {
                if (columns[i].equals("Aika")) {
                    timeIndex = i;
                    break;
                }
            }
            if (timeIndex == -1) {
                System.out.println("Aika-saraketta ei löytynyt!");
                return;
            }

            double summa = 0.0;
            int lkm = 0;
            String line;
            while ((line = reader.readLine()) != null){
                String[] values = line.split(";");

                String time = values[timeIndex];

                if (time.startsWith("01.01.2023")){
                    String temperatureStr = values[ulkoTaloIndex];
                    temperatureStr = temperatureStr.replace(",", ".");
                    double temperature = Double.parseDouble(temperatureStr);

                    summa += temperature;
                    lkm++;
                }
            }
            reader.close();

            if (lkm > 0){
                double average = summa / lkm;
                System.out.println("UlkoTalo average temperature 1.1.2023: " + average);
            }
            else {
                System.out.println("Ei mittauksia 1.1.2023");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
