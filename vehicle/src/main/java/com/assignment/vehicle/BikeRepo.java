package com.assignment.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepo extends JpaRepository<BikeEntity,Integer>{
@Query(value="SELECT * from bike b JOIN car c ON b.nooftyres=c.nooftyres;",nativeQuery=true)
	
	public List<BikeEntity> getjoinbike();
}
