package com.example.sample.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "EmployeeFullName", nullable = false)
	private String fullname;
	@Column(name = "JobTitle", nullable = false)
	private String jobtitle;
	@Column(name = "PhoneNumber", nullable = false)
	private String phonenumber;
	@Column(name = "Email", nullable = false)
	private String email;
	@OneToMany(targetEntity = ContactDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_ids", referencedColumnName = "id")
	private List<ContactDetails> contactDetails;

	public Employees1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ContactDetails> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Employees1(Long id, String fullname, String jobtitle, String phonenumber, String email,
			List<ContactDetails> contactDetails) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.jobtitle = jobtitle;
		this.phonenumber = phonenumber;
		this.email = email;
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Employees1 [id=" + id + ", fullname=" + fullname + ", jobtitle=" + jobtitle + ", phonenumber="
				+ phonenumber + ", email=" + email + ", contactDetails=" + contactDetails + "]";
	}

}
