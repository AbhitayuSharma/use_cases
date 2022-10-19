package com.assignment.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity,Integer>{
	@Query(value="SELECT * from truck t INNER JOIN car c ON t.truck_name=c.car_name;",nativeQuery=true)
	
	public List<TruckEntity> getjoin();
}
