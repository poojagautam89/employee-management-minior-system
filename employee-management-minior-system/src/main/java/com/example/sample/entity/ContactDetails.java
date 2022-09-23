package com.example.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactdetails")
public class ContactDetails {
	@Id
	private Long id;
	@Column(name = "Address", nullable = false)
	private String address;

	@Column(name = "City", nullable = true)
	private String city;

	@Column(name = "State", nullable = false)
	private String state;

	@Column(name = "PrimaryEmergencyContact", nullable = false)
	private String primaryContact;

	@Column(name = "PhoneNumber", nullable = false)
	private String phoneno;

	@Column(name = "Relationship", nullable = false)
	private String relationship;

	@Column(name = "SecondaryEmergencyContact", nullable = true)
	private String secondaryContact;
	@Column(name = "SPhoneNumber", nullable = true)
	private String sPhoneno;

	@Column(name = "SRelationship", nullable = true)
	private String sRelationship;

	@Override
	public String toString() {
		return "ContactDetails [id=" + id + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", primaryContact=" + primaryContact + ", phoneno=" + phoneno + ", relationship=" + relationship
				+ ", secondaryContact=" + secondaryContact + ", sPhoneno=" + sPhoneno + ", sRelationship="
				+ sRelationship + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getSecondaryContact() {
		return secondaryContact;
	}

	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
	}

	public String getsPhoneno() {
		return sPhoneno;
	}

	public void setsPhoneno(String sPhoneno) {
		this.sPhoneno = sPhoneno;
	}

	public String getsRelationship() {
		return sRelationship;
	}

	public void setsRelationship(String sRelationship) {
		this.sRelationship = sRelationship;
	}

	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactDetails(Long id, String address, String city, String state, String primaryContact, String phoneno,
			String relationship, String secondaryContact, String sPhoneno, String sRelationship) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.primaryContact = primaryContact;
		this.phoneno = phoneno;
		this.relationship = relationship;
		this.secondaryContact = secondaryContact;
		this.sPhoneno = sPhoneno;
		this.sRelationship = sRelationship;
	}

}
