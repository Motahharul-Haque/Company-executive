package com.salezshark.admin.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_details")
public class CompanyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long companyId;
	private String companyName;
	private String employeesRange;
	private String companyAddress;
	private String companyContact;
	private int industryId;
	private String industryName;
	private String website;
	private String facebook;
	private String instagram;
	private String twitter;
	private String linkedin;
	private String wiki;
	public CompanyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CompanyDetails(String companyName, String employeesRange, String companyAddress, String companyContact,
			int industryId, String industryName, String website, String facebook, String instagram, String twitter,
			String linkedin, String wiki) {
		super();
		this.companyName = companyName;
		this.employeesRange = employeesRange;
		this.companyAddress = companyAddress;
		this.companyContact = companyContact;
		this.industryId = industryId;
		this.industryName = industryName;
		this.website = website;
		this.facebook = facebook;
		this.instagram = instagram;
		this.twitter = twitter;
		this.linkedin = linkedin;
		this.wiki = wiki;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployeesRange() {
		return employeesRange;
	}
	public void setEmployeesRange(String employeesRange) {
		this.employeesRange = employeesRange;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyContact() {
		return companyContact;
	}
	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}
	public int getIndustryId() {
		return industryId;
	}
	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getWiki() {
		return wiki;
	}
	public void setWiki(String wiki) {
		this.wiki = wiki;
	}
	@Override
	public String toString() {
		return "CompanyDetails [companyId=" + companyId + ", companyName=" + companyName + ", employeesRange="
				+ employeesRange + ", companyAddress=" + companyAddress + ", companyContact=" + companyContact
				+ ", industryId=" + industryId + ", industryName=" + industryName + ", website=" + website
				+ ", facebook=" + facebook + ", instagram=" + instagram + ", twitter=" + twitter + ", linkedin="
				+ linkedin + ", wiki=" + wiki + "]";
	}
	
	
}
