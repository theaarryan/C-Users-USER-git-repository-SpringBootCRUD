package com.springboot.example.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
  @Column(updatable = false,insertable = false)
  private String houseNum;
  @Column(updatable = false,insertable = false)
  private String street;
  @Column(updatable = false,insertable = false)
  private String city;
  @Column(updatable = false,insertable = false)
  private String pincode;
  @Column(updatable = false,insertable = false)
  private String state;
  
  public Address() {
	// TODO Auto-generated constructor stub
	  System.out.println(" in the addres constr");
}

public Address(String houseNum, String street, String city, String pincode, String state) {
	super();
	this.houseNum = houseNum;
	this.street = street;
	this.city = city;
	this.pincode = pincode;
	this.state = state;
}

public String getHouseNum() {
	return houseNum;
}

public void setHouseNum(String houseNum) {
	this.houseNum = houseNum;
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

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Address [houseNum=" + houseNum + ", street=" + street + ", city=" + city + ", pincode=" + pincode
			+ ", state=" + state + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((houseNum == null) ? 0 : houseNum.hashCode());
	result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((street == null) ? 0 : street.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (houseNum == null) {
		if (other.houseNum != null)
			return false;
	} else if (!houseNum.equals(other.houseNum))
		return false;
	if (pincode == null) {
		if (other.pincode != null)
			return false;
	} else if (!pincode.equals(other.pincode))
		return false;
	if (state == null) {
		if (other.state != null)
			return false;
	} else if (!state.equals(other.state))
		return false;
	if (street == null) {
		if (other.street != null)
			return false;
	} else if (!street.equals(other.street))
		return false;
	return true;
}
  
}
