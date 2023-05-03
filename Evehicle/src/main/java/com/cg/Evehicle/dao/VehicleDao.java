package com.cg.Evehicle.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.Evehicle.model.Vehicle;



	@Repository
	public interface VehicleDao extends JpaRepository<Vehicle,Integer>{
		@Query("select v from Vehicle v where v.category=:category")
		
		Iterable<Vehicle> findByCategory(String category);
		
//		@Query("select x from Vehicle x where x.Vehicle_Id=: vehicleId")
//		Vehicle findByPrice(Integer vehicleId);
		//Optional<Vehicle> findVehicleByPrice(Integer price);

		

		
	}


