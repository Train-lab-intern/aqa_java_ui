package com.trainlab.api.model;

import com.trainlab.api.Client;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class UserClient extends Client {

    private static final String PATH_REGISTER = "/api/v1/users/register";
    private static final String PATH_COMPLETE_REGISTER = "/api/v1/users/complete-registration";

    public static ValidatableResponse registrationUser(User user) {

        return given()
                .spec(getSpec())
                .body(user)
                .when()
                .post(PATH_REGISTER)
                .then();

    }

    public static ValidatableResponse completeRegistrationUser(String email) {
        return given()
                .spec(getSpec())
                .get(String.format(PATH_COMPLETE_REGISTER + "?userEmail=%s", email))
                .then().statusCode(SC_OK);

    }
}