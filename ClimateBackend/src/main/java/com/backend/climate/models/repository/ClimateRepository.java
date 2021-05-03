package com.backend.climate.models.repository;

import java.io.Serializable;

import com.backend.climate.models.Climate;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ClimateRepository extends MongoRepository<Climate, String> {
    
}
