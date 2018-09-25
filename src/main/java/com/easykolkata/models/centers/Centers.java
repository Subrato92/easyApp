package com.easykolkata.models.centers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="center")
public class Centers {
	
	@javax.persistence.Id
	@Column(name="Id", nullable=false)
	private String Id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="address", nullable=false)
	private String address;	
	
	/*//Fkey
	@Column(name="college", nullable=false)
	private String college;*/	
	
	/*//Fkey
	@Column(name="inCharge", nullable=false)
	private String inCharge;*/
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
