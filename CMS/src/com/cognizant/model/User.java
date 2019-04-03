package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;

@Entity(name="CMS_Admin")
@Table(name="CMS_Admin")
public class User {
	@NotBlank(message="Admin id can't be empty")
	@Id
	@Column(name="adminId")
	  private  int adminId;
	
	@Column(name="firstName")
	  private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	  
	@Column(name="age")
	  private int age;
	
	@Column(name="gender")
	  private String gender;

	@Column(name="dob")
	private String dob;
	
	@Column(name="contact")
	  private long contact;
	
	@Column(name="altContact")
	  private long altContact;
	
	@Column(name="emailId")
	  private String emailId;
	
	@Column(name="password")
	  private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public long getAltContact() {
		return altContact;
	}
	public void setAltContact(long altContact) {
		this.altContact = altContact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	 
	 	}

