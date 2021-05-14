package com.backend.climate.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.climate.models.Result;


@Repository
public interface ResultRepository extends MongoRepository<Result,String> {
	
	@Query("{ 'address' : ?0, 'days.datetime': ?1}")
	Result findByProvinceAndDay(String province, String day);
	
	@Query("{ 'address' : ?0}")
	Result findByProvince(String province);

}
