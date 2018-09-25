package com.easykolkata.models.temple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="templeDetails")
public class Temple {
	
	@Id
	@Column(name="Id", length=15)
	private String Id;
	
	@Column(name="name", nullable=false)
	private String Name;
	
	@Column(name="emailId", nullable=false)
	private String emailId;
	
	@Column(name="contact", length=10, nullable=false)
	private String contact;
	
	@Column(name="address")
	private String address;

	public String getId() {
		return Id;
	}

	public void setId(String iD) {
		Id = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
