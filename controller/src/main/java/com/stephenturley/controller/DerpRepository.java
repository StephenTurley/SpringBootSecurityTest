package com.stephenturley.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DerpRepository extends MongoRepository<Derp, String>{
}
