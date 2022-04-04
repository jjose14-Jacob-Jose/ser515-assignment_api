package taigaAPI;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.http.HttpClient;
import java.text.ParseException;

public class TaigaConnector {

    public static JSONObject getResponseFromUrlAsJson (String urlString, String requestMethodType, String requestMessageString) {

        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(requestMethodType);

            httpURLConnection.setRequestProperty("Content-Type", "application/json; UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);

            try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
                byte[] messageBodyInBytes = requestMessageString.getBytes("utf-8");
                outputStream.write(messageBodyInBytes, 0, messageBodyInBytes.length);
            }

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = bufferedReader.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                JSONObject jsonObject = new JSONObject(response.toString());
                return jsonObject;
            }
        } catch (Exception exception) {
            exception.printStackTrace();

        }

        return null;
    }



    public static void main (String [] args) throws IOException {
//        URL url = new URL ("https://reqres.in/api/users");
//
//        HttpURLConnection con = (HttpURLConnection)url.openConnection();
//        con.setRequestMethod("POST");
//        con.setRequestProperty("Content-Type", "application/json; utf-8");
//        con.setRequestProperty("Accept", "application/json");
//        con.setDoOutput(true);
//        String jsonInputString = "{\"name\" \"Upendra\", \"job\": \"Programmer\"}";
//
//        try(OutputStream os = con.getOutputStream()) {
//            byte[] input = jsonInputString.getBytes("utf-8");
//            os.write(input, 0, input.length);
//        }
//
//        try(BufferedReader br = new BufferedReader(
//                new InputStreamReader(con.getInputStream(), "utf-8"))) {
//            StringBuilder response = new StringBuilder();
//            String responseLine = null;
//            while ((responseLine = br.readLine()) != null) {
//                response.append(responseLine.trim());
//            }
//            System.out.println(response.toString());
//            JSONObject jsonObject = new JSONObject(response.toString());
//            System.out.printf(jsonObject.toString());
//        }

        String url = "https://reqres.in/api/users";
        String requestType = "POST";
        String messageBody = "{\"name\" \"Upendra\", \"job\": \"Programmer\"}";

        url = Constants.URL_TAIGA;
        requestType = "POST";
        messageBody = "{\"username\": \"jacobjose123\", \"password\": \"Kochi.345.\", \"type\": \"normal\"}";

    TaigaConnector.getResponseFromUrlAsJson(url,requestType,messageBody);

    }
}
