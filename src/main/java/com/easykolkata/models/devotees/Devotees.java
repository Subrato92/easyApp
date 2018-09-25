package com.easykolkata.models.devotees;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="devotees")
public class Devotees {

	@Id
	@Column(name="id", nullable=false)
	private String Id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="pan_no", nullable=false)
	private String panNo;
	
	@Column(name="aadhar_no", nullable=false)
	private String aadharNo;
	
	@Column(name="dob", nullable=false)
	private Date dob;
	
	@Column(name="btgLang", nullable=false)
	private String btgLang;
	
	@Column(name="center_id", nullable=false)
	private String centerId;
	
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
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBtgLang() {
		return btgLang;
	}
	public void setBtgLang(String btgLang) {
		this.btgLang = btgLang;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	
	//For Csv Deserializer
	public void setDob(String dob) {
		try {
			this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
