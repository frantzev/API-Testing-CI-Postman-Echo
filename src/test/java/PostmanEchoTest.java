import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnPostRequest() {
        //Подход Given-When-Then
        //Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello world")
                //Выполняемые действия
                .when()
                .post("/post")
                //Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello world"));

    }
}
