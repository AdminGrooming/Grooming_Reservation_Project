package com.edu.grooming.dao;

<<<<<<< Updated upstream
=======
import java.util.Set;

import javax.persistence.CascadeType;
>>>>>>> Stashed changes
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< Updated upstream
=======
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

//Comment
>>>>>>> Stashed changes

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
<<<<<<< Updated upstream
	private String  userfirstname;
	private String  userlastname;
	private String  useremail;
	private String  userphonenumber;
	private String  userpassword;
	
=======
	private String userfirstname;
	private String userlastname;
	private String useremail;
	private String userphonenumber;
	private String userpassword;

	@JsonIgnore
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Address> address;

>>>>>>> Stashed changes
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userfirstname, String userlastname, String useremail, String userphonenumber,
			String userpassword) {
		super();
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.useremail = useremail;
		this.userphonenumber = userphonenumber;
		this.userpassword = userpassword;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserfirstname() {
		return userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	public String getUserlastname() {
		return userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphonenumber() {
		return userphonenumber;
	}

	public void setUserphonenumber(String userphonenumber) {
		this.userphonenumber = userphonenumber;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
<<<<<<< Updated upstream
=======

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}
>>>>>>> Stashed changes

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userfirstname=" + userfirstname + ", userlastname=" + userlastname
				+ ", useremail=" + useremail + ", userphonenumber=" + userphonenumber + ", userpassword=" + userpassword
				+ "]";
	}
	
	
	
	
	
}
