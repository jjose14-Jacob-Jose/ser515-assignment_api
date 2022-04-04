package taigaAPI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaigaAPIConnectorTest {

    private TaigaAPIConnector taigaAPIConnector;

    @BeforeEach
    void setUp() {
        taigaAPIConnector = new TaigaAPIConnector();
    }

    @Test
    void getResponseStringFromURL() {
        assertNull(taigaAPIConnector.getResponseStringFromURL(Constants.URL_TAIGA, Constants.STR_CONNECTION_REQUEST_METHOD));
    }
}