package com.demo.entityWithAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name = "acc_id")
	int accId;
	
	@Column(name="acc_name")
	String custName;
	
	@Column(name="cust_Add")
	String custAdd;
	
	@Column(name="cust_email")
	String email;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAdd() {
		return custAdd;
	}
	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custName=" + custName + ", custAdd=" + custAdd + ", email=" + email + "]";
	}
	
	

}
