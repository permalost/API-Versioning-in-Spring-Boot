package com.na.versiondemo.functional.handler;

import com.na.versiondemo.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TeacherHandler {

  public Mono<ServerResponse> getTeacherById(ServerRequest request) {
    var id = request.pathVariable("id");
    var teacher = new Teacher("Mr. Smith" + id);
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(teacher);
  }

}
