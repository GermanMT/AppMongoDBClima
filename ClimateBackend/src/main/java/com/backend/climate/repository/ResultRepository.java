package com.backend.climate.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.climate.models.Result;

@Repository
public interface ResultRepository extends MongoRepository<Result, String> {

	@Query("{ 'address' : ?0, 'days.datetime': ?1}")
	Result findByProvinceAndDay(String province, String day);

	@Query("{ 'address' : ?0}")
	Result findByProvince(String province);

	@Query("{ 'days.tempmax' : { $lt: ?0} }")
	List<Result> findByMaxTemp(Double maxTemp);

	@Query("{ 'days.tempmin' : { $gt: ?0} }")
	List<Result> findByMinTemp(Double minTemp);

	@Query("{ 'days.tempmax' : { $lt: ?0}, 'days.tempmin' : { $gt: ?1} }")
	List<Result> findBetweenMinTempAndMaxTemp(Double maxTemp, Double minTemp);

	@Query("{ 'days.precipprob' : { $lt: ?0} }")
	List<Result> findByLessThanPrecipProb(Double maxPrecipProb);

	@Query("{ 'days.precipprob' : { $gt: ?0} }")
	List<Result> findByGreaterThanPrecipProb(Double minPrecipProb);

	@Query("{ 'days.precipprob' : { $lt: ?0}, 'days.precipprob' : { $gt: ?1} }")
	List<Result> findBetweenMinPrecipProbAndMaxPrecipProb(Double maxPrecipProb, Double minPrecipProb);

	@Query("{ 'days.preciptype' : ?0}")
	List<Result> findByPrecipTypeIsRain(String precipType);
	
	@Query("{ 'days.humidity' : { $lt: ?0} }")
	List<Result> findByLessThanHumidity(Double humidity);
	
	@Query("{ 'days.cloudcover' : { $lt: ?0} }")
	List<Result> findByLessThanCloudCover(Double cloudCover);

}
