package page_objects;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;


public class ApiWeather {
    private static Response response;
    private static ValidatableResponse json;
    private static RequestSpecification request;


    private static String ENDPOINT = "http://api.openweathermap.org/data/2.5/weather";
    private static String API_KEY = "e3b6412a251b21dce388ea59d0b69762";
    //.log().all();
    //.log().everything();

    public static void callByCityName(String city) {
        request = given().param("q", city).param("APPID", API_KEY);
        response = request.when().get(ENDPOINT);
    }

    public static void getStatusResponseCode(Integer statusCode) {
        response.then().statusCode(statusCode).log().everything();
    }

    public static void getContentType() {
        response.then().contentType(ContentType.JSON);
    }

    public static void getBodyName(String city) {
        response.then().body("name", equalTo(city));
    }

    public static void getBodyID(Integer id) {
        response.then().body("id", equalTo(id));
    }

    public static void callByCityID(Integer id) {
        request = given().param("id", id).param("APPID", API_KEY);
        response = request.when().get(ENDPOINT);
    }
}
