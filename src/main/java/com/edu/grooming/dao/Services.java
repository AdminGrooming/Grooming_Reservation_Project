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
public class Services {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer servicesid;

	@NotBlank(message = "services Name Should not be null")
	@Column(name = "servicesname", length = 100, nullable = false)
	private String servicesname;

	@Column(name = "servicesdescription", length = 255)
	private String servicesdescription;

	@Min(500)
	@Max(200000)
	@Column(nullable = false, name = "servicesprice")
	private double servicesprice;

	@ManyToOne
	@JoinColumn(name = "salonid")
	private Salon salon;

	@JsonIgnore
	@OneToMany(mappedBy = "services", cascade = CascadeType.ALL)
	private List<Appointment> appointment;

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(String servicesname, String servicesdescription, double servicessprice) {
		super();
		this.servicesname = servicesname;
		this.servicesdescription = servicesdescription;
		this.servicesprice = servicesprice;
	}

	public Integer getservicesid() {
		return servicesid;
	}

	public void setservicesid(Integer servicesid) {
		this.servicesid = servicesid;
	}

	public String getservicesname() {
		return servicesname;
	}

	public void setservicesname(String servicesname) {
		this.servicesname = servicesname;
	}

	public String getServicdesc() {
		return servicesdescription;
	}

	public void setServicdesc(String servicesdescription) {
		this.servicesdescription = servicesdescription;
	}

	public double getservicesprice() {
		return servicesprice;
	}

	public void setservicesprice(double servicesprice) {
		this.servicesprice = servicesprice;
	}

	@Override
	public String toString() {
		return "services [servicesid=" + servicesid + ", servicesname=" + servicesname + ", servicdesc=" + servicesdescription
				+ ", servicesprice=" + servicesprice + "]";
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public void updateservicesSalon(Salon salon2) {
		this.salon = salon2;
	}

	public void servicesAssignSalon(Salon salon2) {
		// TODO Auto-generated method stub
		this.salon = salon2;

	}

}
