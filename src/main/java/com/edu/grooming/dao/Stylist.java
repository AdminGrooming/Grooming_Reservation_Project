package com.edu.grooming.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stylist {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer stylistid;
	
	private String firstname;
	private String lastname;
	private String stylistphonenum;
	private String stylistemail;
	private String stylistspecialization;
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

	
	

}
