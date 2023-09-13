package com.trainlab.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static com.trainlab.app.AppConfig.TEST_BASE_URL;

public class Client {

    protected static RequestSpecification getSpec() {

        RestAssured.filters(new ResponseLoggingFilter());

        return new RequestSpecBuilder()
                .setBaseUri(TEST_BASE_URL)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
}
