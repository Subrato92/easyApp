package com.easykolkata.models.devotees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="devotee_address")
public class DevoteeAddress {
	
	@Column(name="devotee_id", nullable=false)
	private String devoteeId;
	
	@Column(name="address", nullable=false)
	private String address;
	
	public String getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(String devotee_id) {
		this.devoteeId = devotee_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
