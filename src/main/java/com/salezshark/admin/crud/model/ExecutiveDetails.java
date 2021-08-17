package com.salezshark.admin.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "executive_details")
public class ExecutiveDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long executiveId;
	private String  name;
	private String  designation;
	private String company;
	private String email;
	private String phone;
	public ExecutiveDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExecutiveDetails(long executiveId, String name, String designation, String company, String email,
			String phone) {
		super();
		this.executiveId = executiveId;
		this.name = name;
		this.designation = designation;
		this.company = company;
		this.email = email;
		this.phone = phone;
	}
	public long getExecutiveId() {
		return executiveId;
	}
	public void setExecutiveId(long executiveId) {
		this.executiveId = executiveId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ExecutiveDetails [executiveId=" + executiveId + ", name=" + name + ", designation=" + designation
				+ ", company=" + company + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
