package com.cg.Evehicle.service;

import com.cg.Evehicle.model.Vehicle;

public interface VehicleService {

		Iterable<Vehicle> getVehicle();
		
		
		 Vehicle findVehicleById(Integer vehicleId);

		Iterable<Vehicle> findVehicleByCategory(String category);


		//Vehicle findPrice(Integer vehicleId);


		

		

		
}
