package com.easykolkata.models.temple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column(name="transaction_id", nullable=false)
	private String transactionId;
	@Column(name="devotee_id", nullable=false)
	private String devoteeId;
	@Column(name="center_id", nullable=false)
	private String centerId;
	@Column(name="date", nullable=false)
	private String date;
	@Column(name="phase", nullable=false)
	private int phase;
	@Column(name="amount", nullable=false)
	private float amount;
	@Column(name="comment", nullable=false)
	private String comment;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getDevotee_id() {
		return devoteeId;
	}
	public void setDevotee_id(String devotee_id) {
		this.devoteeId = devotee_id;
	}
	public String getCenter_id() {
		return centerId;
	}
	public void setCenter_id(String center_id) {
		this.centerId = center_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPhase() {
		return phase;
	}
	public void setPhase(int phase) {
		this.phase = phase;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	// For Csv deserializer
	public void setAmount(String amount) {
		this.amount = Float.parseFloat(amount);
	}
	public void setPhase(String phase) {
		this.phase = Integer.parseInt(phase);
	}
}
