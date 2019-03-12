package web.steps;

import cucumber.api.java8.En;
import page_objects.ApiWeather;

public class apiWeatherSteps implements En {


    public apiWeatherSteps() {


        And("^(?:Call current weather data for one location by city name (.*)$)", (String word) -> {
            ApiWeather.callByCityName(word);
        });

        And("^(?:Call current weather data for one location by city id (.*)$)", (Integer id) -> {
            ApiWeather.callByCityID(id);
        });

        Then("^(?:the status response code is (.*)$)", (Integer code) -> {
            ApiWeather.getStatusResponseCode(code);
        });

        Then("^(?:the response content type is JSON$)", () -> {
            ApiWeather.getContentType();
        });

        And("^(?:the body name equals searched city name (.*)$)", (String word) -> {
            ApiWeather.getBodyName(word);
        });

        And("^(?:the body id equals searched city id (.*)$)", (Integer id) -> {
            ApiWeather.getBodyID(id);
        });

    }

}
