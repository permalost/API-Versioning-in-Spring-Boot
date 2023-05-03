package com.na.versiondemo.imperative.service;

import com.na.versiondemo.model.Name;
import com.na.versiondemo.model.StudentV2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudentV2Service implements StudentService<StudentV2> {

  @Override
  public Mono<StudentV2> getStudent(String id) {
    return Mono.just(new StudentV2(new Name("John", "Doe" + id)));
  }
}
