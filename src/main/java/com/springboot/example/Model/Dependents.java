package com.springboot.example.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class Dependents 
{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long dep_Id;
	@NotEmpty(message = "Give the name")
  private String firstname;
	@NotEmpty(message = "Give the complete name")
  private String lastname;
	@NotEmpty(message = "Important to give Gender")
	private Gender gender;
	@NotNull
	@Past
	 @DateTimeFormat(pattern = "dd/MM/yyyy")
	 @Column(name = "Dep_Birth_Date")
  private Date dDOB;
	@NotEmpty(message = "Give the realtionship details")
  private String relationShip;
  
  
  public Dependents() {
	// TODO Auto-generated constructor stub
	  System.out.println("in dependants Constructor");
}


public Dependents(String firstname, String lastname, Gender gender, Date dOB, String relationShip) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
	dDOB = dOB;
	this.relationShip = relationShip;
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


public Gender getGender() {
	return gender;
}


public void setGender(Gender gender) {
	this.gender = gender;
}


public Date getDOB() {
	return dDOB;
}


public void setDOB(Date ddOB) {
	dDOB = ddOB;
}


public String getRelationShip() {
	return relationShip;
}


public void setRelationShip(String relationShip) {
	this.relationShip = relationShip;
}


@Override
public String toString() {
	return "Dependents [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", DOB=" + dDOB
			+ ", relationShip=" + relationShip + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dDOB == null) ? 0 : dDOB.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((relationShip == null) ? 0 : relationShip.hashCode());
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
	Dependents other = (Dependents) obj;
	if (dDOB == null) {
		if (other.dDOB != null)
			return false;
	} else if (!dDOB.equals(other.dDOB))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (gender != other.gender)
		return false;
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	if (relationShip == null) {
		if (other.relationShip != null)
			return false;
	} else if (!relationShip.equals(other.relationShip))
		return false;
	return true;
}
  
}
