package com.easykolkata.models.devotees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="devotee_amount")
public class DevoteeTemporaryCommitments {
	
	@Column(name="devotee_id", nullable=false)
	private String devotee_id;
	@Column(name="fromDt", nullable=false)
	private String fromDt;
	@Column(name="toDt", nullable=false)
	private String toDt;
	@Column(name="amount", nullable=false)
	private float amount;
	@Column(name="comment", nullable=false)
	private String comment; //???
	
	public String getDevotee_id() {
		return devotee_id;
	}
	public void setDevotee_id(String devotee_id) {
		this.devotee_id = devotee_id;
	}
	public String getFromDt() {
		return fromDt;
	}
	public void setFromDt(String fromDt) {
		this.fromDt = fromDt;
	}
	public String getToDt() {
		return toDt;
	}
	public void setToDt(String toDt) {
		this.toDt = toDt;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return comment;
	}
	public void setCategory(String comment) {
		this.comment = comment;
	}
	
}
