package com.easykolkata.repositories.devotees;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.easykolkata.models.devotees.DevoteeAddress;

public interface DevoteeAddressRepo extends CrudRepository<DevoteeAddress, Integer>{

	@Query("select * from devotee_address dA WHERE dA.devotee_id=:id")
	public List<DevoteeAddress> findByDevoteeId(@Param("devotee_id") String id);
	
}
