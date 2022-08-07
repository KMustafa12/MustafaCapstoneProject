package ILOVENYPIZZA.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class APIRequests {

    public Response GETRequest() {
        Response response =
                RestAssured.given()
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .get();

        return response;
    }

    public Response POSTRequest(String body, String param) {
        Response response =
                RestAssured.given()
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .body(body)
                        .post(param);
        return response;
    }


    public Response POSTRequestsWithHeader(String body, String param, Response responseToken) {
        Response response =
                RestAssured.given()
                        .header("Authorization", responseToken)
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .body(body)
                        .post(param);
        return response;
    }


    public Response PUTRequestsWithHeader(String body, String param, Response responseToken) {
        Response response =
                RestAssured.given()
                        .header("Authorization", responseToken)
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .body(body)
                        .post(param);
        return response;
    }

    public Response PUTRequest(String body, String param) {
        Response response =
                RestAssured.given()
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .body(body)
                        .put(param);
        return response;
    }

    public Response DELETERequest(String param) {
        Response response =
                RestAssured.given()
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .delete(param);
        return response;
    }

    public Response DELETERequestWithHeader(String param, Response responseToken) {
        Response response =
                RestAssured.given()
                        .header("Authorization", responseToken)
                        .accept(ContentType.JSON)
                        .when()
                        .contentType(ContentType.JSON)
                        .delete(param);
        return response;
    }
}