package taigaAPI;

import com.fasterxml.jackson.core.*;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TaigaAPIConnector {
    private HttpClient httpClient;
    private HttpPost httpPost;

    private URL url;
    private HttpURLConnection httpURLConnection;

    public String getResponseStringFromURL(String urlOfAPI, String connectionRequestType) {
        try {
            url = new URL(null, urlOfAPI);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(connectionRequestType);
            httpURLConnection.connect();

            int codeResponseHttpURLConnection = httpURLConnection.getResponseCode();

            if(codeResponseHttpURLConnection != Constants.CODE_RESPONSE_SUCCESSFUL_HTTP_CONNECTION) {
                return Constants.MSG_ERROR_CONNECTION_FAILED;
            } else {

                StringBuilder stringBuilderResponse = new StringBuilder();
                Scanner scannerResponse = new Scanner(url.openStream());

                while(scannerResponse.hasNext()) {
                    stringBuilderResponse.append(scannerResponse.nextLine());
                }

                scannerResponse.close();
                return stringBuilderResponse.toString();

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
            InputOutput.displayOnConsole(Constants.MSG_ERROR_CONNECTION_FAILED);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hhh";

    }

    private JSONObject convertStringToJSONObject (String stringToBeConvertedToJSON) {
        try {
            JsonParser jsonParser = new JsonFactory().createParser(stringToBeConvertedToJSON);
//            JSONArray jsonArray = (JSONArray) jsonParser.getParsingContext();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }


}
