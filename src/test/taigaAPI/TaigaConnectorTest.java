package taigaAPI;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaigaConnectorTest {

    private TaigaConnector taigaConnector;
    private String urlString;
    private String requestType;
    private String messageBody;



    @BeforeEach
    void setUp() {
        taigaConnector = new TaigaConnector();

        urlString = Constants.URL_TAIGA_AUTHENTICATION;
        requestType = Constants.STR_CONNECTION_REQUEST_METHOD_TYPE;
        messageBody = Constants.JSON_TEST_CREDENTIALS;
    }

    @Test
    void getResponseFromUrlAsJson() {

        JSONObject jsonObjectConnectionResponse = TaigaConnector.getResponseFromUrlAsJson(urlString, requestType, messageBody);
        Assert.assertEquals(Constants.JSON_TEST_PARAMETER_KEY_EXPECTED_VALUE, jsonObjectConnectionResponse.getInt(Constants.JSON_TEST_PARAMETER_KEY));
    }
}