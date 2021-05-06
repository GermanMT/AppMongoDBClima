package com.backend.climate.models.repository;

import com.backend.climate.models.Climate;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClimateRepository extends MongoRepository<Climate, String> {
    
}
