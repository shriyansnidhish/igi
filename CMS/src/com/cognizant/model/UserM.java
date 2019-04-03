package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="CMS_Member")
@Table(name="CMS_Member")
public class UserM {
	 @Id
	  @Column(name="memberId")
	 private  int memberId;
	  private String firstName;
	  private String lastName;
	  private int age;
	  private String gender;
	  private String dob;
	  private int contact;
	  private int altContact;
	  private String emailId;
	  private String password;
	  private String planCode;
	  private String coverageStartDate;
	  private String coverageEndDate;
	  private String addressLine1;
	  private String addressLine2;
	  private String city;
	  private String state;
	  private int zipCode;
	  
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAltContact() {
		return altContact;
	}
	public void setAltContact(int altContact) {
		this.altContact = altContact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getCoverageStartDate() {
		return coverageStartDate;
	}
	public void setCoverageStartDate(String coverageStartDate) {
		this.coverageStartDate = coverageStartDate;
	}
	public String getCoverageEndDate() {
		return coverageEndDate;
	}
	public void setCoverageEndDate(String coverageEndDate) {
		this.coverageEndDate = coverageEndDate;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
		public UserM() {
			// TODO Auto-generated constructor stub
		}

}














