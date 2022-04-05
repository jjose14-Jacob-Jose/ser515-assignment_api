package taigaAPI;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONObject;
import taigaAPI.utility.Constants;
import taigaAPI.utility.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connector {

    public static JsonArray getResponseFromUrlAsJsonArrayGET(String urlString) {

        try {

            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(Constants.TYPE_CONNECTION_REQUEST_GET);

            httpURLConnection.setRequestProperty("Content-Type", "application/json; UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), Constants.TYPE_STR_ENCODING_FORMAT_UTF_EIGHT))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = bufferedReader.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                JsonArray jsonArray = JsonParser.parseString(response.toString()).getAsJsonArray();

                return jsonArray;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static JsonObject getResponseFromUrlAsJsonGET(String urlString) {

        try {

            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(Constants.TYPE_CONNECTION_REQUEST_GET);

            httpURLConnection.setRequestProperty("Content-Type", "application/json; UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), Constants.TYPE_STR_ENCODING_FORMAT_UTF_EIGHT))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = bufferedReader.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();

                return jsonObject;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static JSONObject getResponseFromUrlAsJsonGET(String urlString, String requestMessageString) {

        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(Constants.TYPE_CONNECTION_REQUEST_POST);

            httpURLConnection.setRequestProperty("Content-Type", "application/json; UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);

            try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
                byte[] messageBodyInBytes = requestMessageString.getBytes(Constants.TYPE_STR_ENCODING_FORMAT_UTF_EIGHT);
                outputStream.write(messageBodyInBytes, 0, messageBodyInBytes.length);
            }

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), Constants.TYPE_STR_ENCODING_FORMAT_UTF_EIGHT))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = bufferedReader.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                JSONObject jsonObject = new JSONObject(response.toString());
                InputOutput.displayOnConsole(jsonObject.toString());
                return jsonObject;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }



    public static void main (String [] args) throws IOException {
        Menu menu = new Menu();
        menu.showMainMenu();

    }
}
