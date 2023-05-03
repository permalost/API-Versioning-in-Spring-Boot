package com.na.versiondemo.functional.router;

import com.na.versiondemo.functional.handler.TeacherHandler;
import com.na.versiondemo.functional.handler.TeacherV2Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TeacherRouter {

  @Bean
  public RouterFunction<ServerResponse> routes(TeacherHandler handler, TeacherV2Handler v2Handler) {
    return route()
        .nest(path("/teacher"), builder ->
            builder
                .GET("/{id}", handler::getTeacherById)
        )
        .nest(path("/v1/teacher"), builder ->
            builder
                .GET("/{id}", handler::getTeacherById)
        )
        .nest(path("/v2/teacher"), builder ->
            builder
                .GET("/{id}", v2Handler::getTeacherById)
        )
        .build();
  }
}
