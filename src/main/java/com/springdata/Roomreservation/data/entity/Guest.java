package com.springdata.Roomreservation.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GUEST")
public class Guest {
	
	@Id
	@Column(name="GUEST_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long GuestId;
	@Column(name="FIRST_NAME")
	private String fn;
	@Column(name="LAST_NAME")
	private String ln;
	@Column(name="EMAIL_ADDRESS")
	private String email;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="COUNTRY")
	private String country ;
	@Column(name="STATE")
	private String state;
	@Column(name="PHONE_NUMBER")
	private String phonenumber;
	public long getGuestId() {
		return GuestId;
	}
	public void setGuestId(long guestId) {
		GuestId = guestId;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}
