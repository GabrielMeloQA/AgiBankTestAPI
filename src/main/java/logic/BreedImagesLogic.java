package logic;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BreedImagesLogic {
    private Response response;

    public Response chamadaGetImagesByBreed(String url) {

        response = given()
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response;
    }

}
