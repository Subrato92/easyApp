package com.easykolkata.models.devotees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="devotee_bank")
public class DevoteeBank {

	@Column(name="devotee_id", nullable=false)
	private String devoteeId;
	@Column(name="bank", nullable=false)
	private String Bank;
	@Column(name="ifsc", nullable=false)
	private String ifsc;
	@Column(name="acc_no", nullable=false)
	private String accNo;
	@Column(name="acc_holder_name", nullable=false)
	private String accountHolderName;
	
	public String getDevoteeId() {
		return devoteeId;
	}
	public void setDevoteeId(String devoteeId) {
		this.devoteeId = devoteeId;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String acNo) {
		this.accNo = acNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
}
