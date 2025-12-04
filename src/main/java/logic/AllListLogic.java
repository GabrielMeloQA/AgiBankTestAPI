package logic;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AllListLogic {
    private Response response;

    public Response chamadaGetAllList(String url) {

        response = given()
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response;
    }

}
