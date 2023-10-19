package com.edu.grooming.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceid;
	private String servicename;
	private String servicdesc;
	private double serviceprice;
	
	@ManyToOne
	@JoinColumn(name = "salonid")
	private Salon salon;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String servicename, String servicdesc, double serviceprice) {
		super();
		this.servicename = servicename;
		this.servicdesc = servicdesc;
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
		return servicdesc;
	}

	public void setServicdesc(String servicdesc) {
		this.servicdesc = servicdesc;
	}

	public double getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(double serviceprice) {
		this.serviceprice = serviceprice;
	}

	@Override
	public String toString() {
		return "Service [serviceid=" + serviceid + ", servicename=" + servicename + ", servicdesc=" + servicdesc
				+ ", serviceprice=" + serviceprice + "]";
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	
	

	
}
