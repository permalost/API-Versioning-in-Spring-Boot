package com.na.versiondemo.functional.handler;

import com.na.versiondemo.model.Name;
import com.na.versiondemo.model.TeacherV2;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TeacherV2Handler {

  public Mono<ServerResponse> getTeacherById(ServerRequest request) {
    var id = request.pathVariable("id");
    var teacher = new TeacherV2(new Name("Mr.", "Smith" + id));
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(teacher);
  }

}
