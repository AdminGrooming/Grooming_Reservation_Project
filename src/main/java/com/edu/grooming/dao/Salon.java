package com.edu.grooming.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer salonid;
	private String  salonname;
	private String  salonaddress;
	private String  saloncity;
	private String  salonpincode;
	private String  salonstate;
	private String  salonphone;
	private String  salonemailid;
	private String  salonopeninghours;
	private String  salondescription;
	private String  salonrating;
	private String  salonpassword;
	
	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salon(String salonname, String salonaddress, String saloncity, String salonpincode, String salonstate,
			String salonphone, String salonemailid, String salonopeninghours, String salondescription,
			String salonrating, String salonpassword) {
		super();
		this.salonname = salonname;
		this.salonaddress = salonaddress;
		this.saloncity = saloncity;
		this.salonpincode = salonpincode;
		this.salonstate = salonstate;
		this.salonphone = salonphone;
		this.salonemailid = salonemailid;
		this.salonopeninghours = salonopeninghours;
		this.salondescription = salondescription;
		this.salonrating = salonrating;
		this.salonpassword = salonpassword;
	}

	public Integer getSalonid() {
		return salonid;
	}

	public void setSalonid(Integer salonid) {
		this.salonid = salonid;
	}

	public String getSalonname() {
		return salonname;
	}

	public void setSalonname(String salonname) {
		this.salonname = salonname;
	}

	public String getSalonaddress() {
		return salonaddress;
	}

	public void setSalonaddress(String salonaddress) {
		this.salonaddress = salonaddress;
	}

	public String getSaloncity() {
		return saloncity;
	}

	public void setSaloncity(String saloncity) {
		this.saloncity = saloncity;
	}

	public String getSalonpincode() {
		return salonpincode;
	}

	public void setSalonpincode(String salonpincode) {
		this.salonpincode = salonpincode;
	}

	public String getSalonstate() {
		return salonstate;
	}

	public void setSalonstate(String salonstate) {
		this.salonstate = salonstate;
	}

	public String getSalonphone() {
		return salonphone;
	}

	public void setSalonphone(String salonPhone) {
		this.salonphone = salonPhone;
	}

	public String getSalonemailid() {
		return salonemailid;
	}

	public void setSalonemailid(String salonemailid) {
		this.salonemailid = salonemailid;
	}

	public String getSalonopeninghours() {
		return salonopeninghours;
	}

	public void setSalonopeninghours(String salonopeninghours) {
		this.salonopeninghours = salonopeninghours;
	}

	public String getSalondescription() {
		return salondescription;
	}

	public void setSalondescription(String salondescription) {
		this.salondescription = salondescription;
	}

	public String getSalonrating() {
		return salonrating;
	}

	public void setSalonrating(String salonrating) {
		this.salonrating = salonrating;
	}

	public String getSalonpassword() {
		return salonpassword;
	}

	public void setSalonpassword(String salonpassword) {
		this.salonpassword = salonpassword;
	}

	@Override
	public String toString() {
		return "Salon [salonid=" + salonid + ", salonname=" + salonname + ", salonaddress=" + salonaddress
				+ ", saloncity=" + saloncity + ", salonpincode=" + salonpincode + ", salonstate=" + salonstate
				+ ", salonPhone=" + salonphone + ", salonemailid=" + salonemailid + ", salonopeninghours="
				+ salonopeninghours + ", salondescription=" + salondescription + ", salonrating=" + salonrating
				+ ", salonpassword=" + salonpassword + "]";
	}
	
	
	
	

}
