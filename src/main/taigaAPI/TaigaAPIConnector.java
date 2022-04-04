package taigaAPI;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaigaAPIConnector {
    private URL url;
    String testURL = "http://jsonplaceholder.typicode.com/albums";

    HttpURLConnection conn;


    public String getJSONRespone(String urlString) throws IOException {
//        url = new URL(testURL);
//
//        Map<String, String> params = new LinkedHashMap<String, String>();
//        params.put("username","u_name");
//        params.put("password","p_word");
//
//        StringBuilder postData = new StringBuilder();
//        for(Map.Entry<String, String> param: params.entrySet()) {
//            if(postData.length() != 0) {
//                postData.append('&');
//            }
//            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
//            postData.append("=");
//            postData.append(URLEncoder.encode(param.getValue(), "UTF-8"));
//        }
//        byte [] postDataBytes = postData.toString().getBytes("UTF-8");
//
//        conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
//        conn.setDoOutput(true);
//        conn.getOutputStream().write(postDataBytes);
//        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//        StringBuilder sb = new StringBuilder();
//        for (int c; (c = in.read()) >= 0;)
//            sb.append((char)c);
//        String response = sb.toString();

        String urly = testURL;
            URL obj = new URL(urly);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection(Proxy.NO_PROXY);

            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type","application/json");

            String dataStrng = "hello";

            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(dataStrng);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            BufferedReader iny = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String output;
            StringBuffer response = new StringBuffer();

            while ((output = iny.readLine()) != null) {
                response.append(output);
            }
            iny.close();

            //printing result from response
            System.out.println(response.toString());


        return "";
    }

    public static void main (String [] args) {
        TaigaAPIConnector taigaAPIConnector = new TaigaAPIConnector();
        try {
            System.out.printf(taigaAPIConnector.getJSONRespone("Hello"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}