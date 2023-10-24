package com.edu.grooming.dao;


import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;



//Comment

@Entity
public class User {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer userid;
<<<<<<< Updated upstream
	private String  userfirstname;
=======
	
	@NotBlank(message="First name Should not be null")
	@Pattern(message = "Invalid First Name", regexp = "^[A-Za-z]+$")
	@Column(name="userfirstname", length=50, nullable=false)
	private String  userfirstname;
	
	
	@NotBlank(message="Last name Should not be null")
	@Pattern(message = "Invalid Last Name", regexp = "^[A-Za-z]+$")
	@Column(name="userlastname",length=50)
>>>>>>> Stashed changes
	private String  userlastname;
	private String  useremail;
<<<<<<< Updated upstream
=======
	
	@NotBlank(message="Phone Number Should not be empty")
	@Pattern(message = "Invalid Phone Number", regexp = "^[6-9]\\d{9}$")
	@Column(name = "userphonenumber", unique = true,nullable = false)
>>>>>>> Stashed changes
	private String  userphonenumber;
	private String  userpassword;
	

	
	@JsonIgnore
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Set<Address> address;

	
	public User() {
		super();
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
	
	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	


	@Override
	public String toString() {
		return "User [userid=" + userid + ", userfirstname=" + userfirstname + ", userlastname=" + userlastname
				+ ", useremail=" + useremail + ", userphonenumber=" + userphonenumber + ", userpassword=" + userpassword
				+ "]";
	}

}
