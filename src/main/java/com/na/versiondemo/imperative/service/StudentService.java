package com.na.versiondemo.imperative.service;

import reactor.core.publisher.Mono;

public interface StudentService<T> {

  Mono<T> getStudent(String id);

}
