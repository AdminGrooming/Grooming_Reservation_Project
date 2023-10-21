package com.edu.grooming.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Stylist {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer stylistid;
	
	@NotBlank(message="Stylist name Should not be null")
	@Pattern(message = "Invalid First Name", regexp = "^[A-Za-z]+$")
	@Column(name="First Name",length=30)
	private String firstname;
	
	@NotBlank(message="Stylist name Should not be null")
	@Pattern(message = "Invalid Last Name", regexp = "^[A-Za-z]+$")
	@Column(name="Last Name",length=30,nullable=false)
	private String lastname;
	
	@NotBlank(message="Stylist phone Number Should not be null")
	@Pattern(message = "Invalid Phone Number", regexp = "^[6-9]\\d{9}$")
	@Column(unique = true,name="Mobile number",length=10)
	private String stylistphonenum;
	
	@NotBlank(message="Stylist Email Should not be null")
	@Email(message = "Invalid Email", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	@Column(unique = true,name="Email id",length=30)
	private String stylistemail;
	
	@NotBlank(message="Stylist specialization Should not be null")
	@Column(name="Stylist Specialization", nullable=false)
	private String stylistspecialization;
	
	@NotBlank(message="Stylist Rating Should not be null")
	@Column(name="Stylist Rating", length=5, nullable=false)
	private Integer stylistrating;
	
	@ManyToOne
	@JoinColumn(name="salonid")
	private Salon salon; 
	
	
	public Stylist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stylist(String firstname, String lastname, String stylistphonenum,
			String stylistemail, String stylistspecialization, Integer stylistrating) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.stylistphonenum = stylistphonenum;
		this.stylistemail = stylistemail;
		this.stylistspecialization = stylistspecialization;
		this.stylistrating = stylistrating;
	}

	public Integer getStylistid() {
		return stylistid;
	}

	public void setStylistid(Integer stylistid) {
		this.stylistid = stylistid;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStylistphonenum() {
		return stylistphonenum;
	}

	public void setStylistphonenum(String stylistphonenum) {
		this.stylistphonenum = stylistphonenum;
	}

	public String getStylistemail() {
		return stylistemail;
	}

	public void setStylistemail(String stylistemail) {
		this.stylistemail = stylistemail;
	}

	public String getStylistspecialization() {
		return stylistspecialization;
	}

	public void setStylistspecialization(String stylistspecialization) {
		this.stylistspecialization = stylistspecialization;
	}

	public Integer getStylistrating() {
		return stylistrating;
	}

	public void setStylistrating(Integer stylistrating) {
		this.stylistrating = stylistrating;
	}

	@Override
	public String toString() {
		return "Stylist [stylistid=" + stylistid  + ", firstname=" + firstname + ", lastname="
				+ lastname + ", stylistphonenum=" + stylistphonenum + ", stylistemail=" + stylistemail
				+ ", stylistspecialization=" + stylistspecialization + ", stylistrating=" + stylistrating + "]";
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}


	public void updateStylistSalon(Salon salon2) {
		this.salon = salon2;
	}


}
