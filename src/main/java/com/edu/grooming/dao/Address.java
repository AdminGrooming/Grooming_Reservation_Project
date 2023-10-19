package com.edu.grooming.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer addressId;
	
	@Column(name="HouseNumber", length=5, nullable=false)
	private String houseNo;
	
	@Column(name="Street", length=100, nullable=false)
	private String street;
	
	@Column(name="City", length=30, nullable=false)
	private String city;
	
	@Column(name="State", length=20, nullable=false)
	private String state;
	
	@Column(name="Zipcode", length=10, nullable=false)
	private String zipcode;
	
	@Column(name="Country", length=30, nullable=false)
	private String country;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(Integer addressId, String houseNo, String street, String city, String state, String zipcode,
			String country) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}


	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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

	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", country=" + country + "]";
	}
}
