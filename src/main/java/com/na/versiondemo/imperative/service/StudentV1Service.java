package com.na.versiondemo.imperative.service;

import com.na.versiondemo.model.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudentV1Service implements StudentService<Student> {

  @Override
  public Mono<Student> getStudent(String id) {
    return Mono.just(new Student("John Doe" + id));
  }
}
