package com.assignment.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CarRepo extends JpaRepository<CarEntity,Integer>{
	@Query(value="SELECT * from car INNER JOIN truck ON car.nooftyres=truck.nooftyres;",nativeQuery=true)
	public List<CarEntity> getjoin2();
}
