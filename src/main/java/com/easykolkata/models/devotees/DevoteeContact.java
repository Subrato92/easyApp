package com.easykolkata.models.devotees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="devotee_contact")
public class DevoteeContact {
	
	@Column(name="devotee_id", nullable=false)
	private String devotee_id;	
	@Column(name="type", nullable=false)
	private String type;	
	@Column(name="contact", nullable=false)
	private String contact;	
	
	public String getDevotee_id() {
		return devotee_id;
	}
	public void setDevotee_id(String devotee_id) {
		this.devotee_id = devotee_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
