package com.swagger;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;
import io.swagger.v3.oas.annotations.Hidden;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Hidden
@Controller("/api")
@Validated
public class SwaggerController {

    @Inject
    SwaggerConfig config;

    @View("swagger/index")
    @Get
    public SwaggerConfig index() {
        LoggerFactory.getLogger(SwaggerController.class).info("Trying to render swagger-view");
        return config;
    }

}