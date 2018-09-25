package com.easykolkata.models.devotees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DevoteeDonationCommitment")
public class DevoteeDonationCommitment {
	
	@Id
	@Column(name="devotee_Id", nullable=false)
	private String devoteeId;
	@Column(name="upper_limit", nullable=false)
	private float upperLimit;
	@Column(name="amount", nullable=false)
	private float amount;
	@Column(name="updatedOn", nullable=false)
	private String updatedOn;
	
	public String getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(String devotee_id) {
		this.devoteeId = devotee_id;
	}
	public float getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(float upperLimit) {
		this.upperLimit = upperLimit;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
