package com.cg.Evehicle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Evehicle.model.Book;

@Repository
public interface DealerDao extends JpaRepository<Book,Integer> {

	//Iterable<Book> findByVId(Integer vehicleId);

	//Optional<Book> findById(Integer vehicleId);

	

	

}
