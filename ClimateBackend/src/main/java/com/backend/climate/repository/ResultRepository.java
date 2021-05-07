package com.backend.climate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.climate.models.Result;

@Repository
public interface ResultRepository extends MongoRepository<Result,String> {

}
