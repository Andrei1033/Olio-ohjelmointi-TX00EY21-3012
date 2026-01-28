import java.net.*;

public class Task_1_Read_a_network_CSV {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        }
        catch (MalformedURLException e) {
            System.err.println("Malformed URL" + e.getMessage());
        }
    }
}
