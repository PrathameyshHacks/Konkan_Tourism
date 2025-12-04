package MyPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TxtMes {
    public static void main(String[] args) {
        try {
            String apiKey = "sVFjezr3KGlIMgZNhcokib6tJWARL2v0U7mq85nPadYQCXODSyiIzaLcRq3Nubx0nWTYmsO5BZghjk8G";
            String senderId = "FASTSMS"; // Your sender ID
            String message = "5561";
            String language = "english";
            String route = "p"; // Promotional route
            String numbers = "9373927243"; // Comma-separated mobile numbers

            String url = "https://www.fast2sms.com/dev/bulk?authorization=" + apiKey +
                         "&sender_id=" + senderId +
                         "&message=" + message +
                         "&language=" + language +
                         "&route=" + route +
                         "&numbers=" + numbers;

            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Response: " + response.toString());
            // Handle the response as needed (e.g., check for success status).

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
