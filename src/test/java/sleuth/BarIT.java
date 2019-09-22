package sleuth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DirtiesContext
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
class BarIT {

    @Autowired
    protected TestRestTemplate restTemplate;

    @Test
    void shouldSupportSrsRequestsForLists() throws Exception {
        String response = restTemplate.getForObject("/hello", String.class);

        assertEquals("ok", response);
    }
}
