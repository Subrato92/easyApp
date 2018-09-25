package com.easykolkata.models.temple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="facilitators")
public class Facilitators {
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="contact", nullable=false)
	private String contact;
	
	@Column(name="emailId", nullable=false)
	private String emailId;
	
	@Column(name="joiningYear", nullable=false)
	private int joiningYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	// For Csv deserializer
	public void setJoiningYear(String joiningYear) {
		this.joiningYear = Integer.parseInt(joiningYear);
	}
}
