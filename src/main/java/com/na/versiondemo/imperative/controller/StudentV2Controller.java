package com.na.versiondemo.imperative.controller;

import com.na.versiondemo.imperative.service.StudentService;
import com.na.versiondemo.model.StudentV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class StudentV2Controller {

  private final StudentService<StudentV2> service;

  @GetMapping(value = {"/v2/student/{id}", "/student/{id}"}, headers = "X-API-VERSION=2")
  public Mono<StudentV2> getStudent(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

  @GetMapping(value = {"/v2/student/{id}", "/student/{id}"}, produces = "application/vnd.na.app-v2.json")
  public Mono<StudentV2> getStudent2(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

  @GetMapping("/v2/student/{id}")
  public Mono<StudentV2> getStudent3(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

}
