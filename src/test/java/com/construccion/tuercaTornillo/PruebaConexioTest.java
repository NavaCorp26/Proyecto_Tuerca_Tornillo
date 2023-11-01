/*import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.Test;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PruebaConexionTest {

    @LocalServerPort
    private int port;

    private TestRestTemplate restTemplate = new TestRestTemplate(TestRestTemplate.HttpClientOption.ENABLE_COOKIES);

    @Test
    public void probarConexionBD() {
        String url = "http://localhost:" + port + "/"; // Cambia esto según la ruta de tu aplicación
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        // Puedes verificar el statusCode o cualquier otra cosa para asegurarte de que la conexión a la BD funcione
    }
}*/