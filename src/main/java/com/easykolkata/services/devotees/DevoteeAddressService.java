package com.easykolkata.services.devotees;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easykolkata.models.devotees.DevoteeAddress;
import com.easykolkata.repositories.devotees.DevoteeAddressRepo;

@Service
public class DevoteeAddressService {
	
	@Autowired
	private DevoteeAddressRepo devAddRepo;
	private boolean status;
	private List<DevoteeAddress> addressLst;
	
	public boolean addNewAddress(DevoteeAddress devoteeAdd) {
		if( devAddRepo.save(devoteeAdd) != null )
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public List<DevoteeAddress> getAllArrdess(String devoteeId){
		
		addressLst = devAddRepo.findByDevoteeId(devoteeId);
		return addressLst;
		
	}
	
}
