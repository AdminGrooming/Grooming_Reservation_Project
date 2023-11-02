package com.edu.grooming.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceid;

	@NotBlank(message = "Service Name Should not be null")
	@Column(name = "servicename", length = 100, nullable = false)
	private String servicename;

	@Column(name = "servicedescription", length = 255)
	private String servicedescription;

	@Min(500)
	@Max(200000)
	@Column(nullable = false, name = "serviceprice")
	private double serviceprice;

	@ManyToOne
	@JoinColumn(name = "salonid")
	private Salon salon;

	@JsonIgnore
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
	private List<Appointment> appointment;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String servicename, String servicedescription, double serviceprice) {
		super();
		this.servicename = servicename;
		this.servicedescription = servicedescription;
		this.serviceprice = serviceprice;
	}

	public Integer getServiceid() {
		return serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getServicdesc() {
		return servicedescription;
	}

	public void setServicdesc(String servicedescription) {
		this.servicedescription = servicedescription;
	}

	public double getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(double serviceprice) {
		this.serviceprice = serviceprice;
	}

	@Override
	public String toString() {
		return "Service [serviceid=" + serviceid + ", servicename=" + servicename + ", servicdesc=" + servicedescription
				+ ", serviceprice=" + serviceprice + "]";
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public void updateServiceSalon(Salon salon2) {
		this.salon = salon2;
	}

	public void serviceAssignSalon(Salon salon2) {
		// TODO Auto-generated method stub
		this.salon = salon2;

	}

}
