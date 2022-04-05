package taigaAPI;

import org.json.JSONObject;
import taigaAPI.utility.Constants;
import taigaAPI.utility.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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
                byte[] messageBodyInBytes = requestMessageString.getBytes(Constants.STR_ENCODING_FORMAT_UTF_EIGHT);
                outputStream.write(messageBodyInBytes, 0, messageBodyInBytes.length);
            }

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), Constants.STR_ENCODING_FORMAT_UTF_EIGHT))) {
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
        }

        return null;
    }

    public static JSONObject getResponseFromUrlAsJsonPOST (String urlString, String requestMessageString) {

        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(Constants.STR_CONNECTION_REQUEST_METHOD_TYPE_POST);

            httpURLConnection.setRequestProperty("Content-Type", "application/json; UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);

            try (OutputStream outputStream = httpURLConnection.getOutputStream()) {
                byte[] messageBodyInBytes = requestMessageString.getBytes(Constants.STR_ENCODING_FORMAT_UTF_EIGHT);
                outputStream.write(messageBodyInBytes, 0, messageBodyInBytes.length);
            }

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(httpURLConnection.getInputStream(), Constants.STR_ENCODING_FORMAT_UTF_EIGHT))) {
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
        }

        return null;
    }

    public static String getValueOfKeyFromJSON (JSONObject jsonObject, String key) {
        try{
            String valueCorrespondingToKey = jsonObject.getString(key).toString();
            return valueCorrespondingToKey;

        }
        catch (Exception e) {
            return null;
        }
    }


    public static void main (String [] args) throws IOException {

    }
}
