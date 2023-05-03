package com.na.versiondemo.imperative.controller;

import com.na.versiondemo.imperative.service.StudentService;
import com.na.versiondemo.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/student/{id}", "/v1/student/{id}"})
public class StudentController {

  private final StudentService<Student> service;

  @GetMapping
  public Mono<Student> getStudent(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

  @GetMapping(headers = "X-API-VERSION=1")
  public Mono<Student> getStudent2(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

  @GetMapping(produces = "application/vnd.na.app-v1.json")
  public Mono<Student> getStudent3(@PathVariable("id") String id) {
    return service.getStudent(id);
  }

}
