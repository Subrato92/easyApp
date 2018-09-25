package com.easykolkata.models.centers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="institutes")
public class Institutes {
	
	@javax.persistence.Id
	@Column(name="Id", nullable=false)
	private String Id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="location", nullable=false)
	private String location;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
