package com.kpi.microservice.currencyexchangeexampleservice.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValueEntity,Integer>{
ExchangeValueEntity findByFromAndTo(String from,String to);
}
