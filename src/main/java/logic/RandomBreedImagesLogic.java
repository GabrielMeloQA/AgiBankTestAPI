package logic;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RandomBreedImagesLogic {
    private Response response;

    public Response chamadaRandomImagesBreeds(String url) {

        response = given()
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response;
    }

}
