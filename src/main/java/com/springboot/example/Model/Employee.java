package com.springboot.example.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @NotEmpty(message ="Name Should Not be empty")
  @Min(value = 4)
  @Column(updatable = false,insertable = false)
  private String firstname;
  @NotEmpty(message ="Name Should Not be empty")
  @Min(value = 4)
  @Column(updatable = false,insertable = false)
  private String lastname;
  @NotEmpty(message ="ID is mandatory")
  private String Employ_ID;
  @NotNull
  @Past
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  @Column(name = "Emp_Start_Date")
  private Date startDate;
  @NotNull
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  @Column(name = "Emp_End_Date")
  private Date enddate;
  @NotNull
  @Past(message = "Give the proper date born date ")
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  @Column(name = "Emp_Birth_Date",nullable = false)
  private Date DOB;
  @NotNull
  @Column(updatable = false,insertable = false)
  private Gender gender;
 @Embedded
  private Address address;
  private String bloodGroup;
  private String status;
  @NotEmpty
  private String reporting_manager;
  private String department;
  @Embedded
  private Dependents dependents;
  @Embedded
  private Education education;
  
  public Employee() {
	// TODO Auto-generated constructor stub
	  
	  System.out.println("in Employee Constructor"); 
	  
}

public Employee(Long id, String firstname, String lastname, String employ_ID, Date startDate, Date enddate, Date dOB,
		Gender gender, Address address, String bloodGroup, String status, String reporting_manager,
		Dependents dependents, Education education) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	Employ_ID = employ_ID;
	this.startDate = startDate;
	this.enddate = enddate;
	DOB = dOB;
	this.gender = gender;
	this.address = address;
	this.bloodGroup = bloodGroup;
	this.status = status;
	this.reporting_manager = reporting_manager;
	this.dependents = dependents;
	this.education = education;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public String getEmploy_ID() {
	return Employ_ID;
}

public void setEmploy_ID(String employ_ID) {
	Employ_ID = employ_ID;
}

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Date getEnddate() {
	return enddate;
}

public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

public Date getDOB() {
	return DOB;
}

public void setDOB(Date dOB) {
	DOB = dOB;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public String getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getReporting_manager() {
	return reporting_manager;
}

public void setReporting_manager(String reporting_manager) {
	this.reporting_manager = reporting_manager;
}

public Dependents getDependents() {
	return dependents;
}

public void setDependents(Dependents dependents) {
	this.dependents = dependents;
}

public Education getEducation() {
	return education;
}

public void setEducation(Education education) {
	this.education = education;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Employ_ID=" + Employ_ID
			+ ", startDate=" + startDate + ", enddate=" + enddate + ", DOB=" + DOB + ", gender=" + gender + ", address="
			+ address + ", bloodGroup=" + bloodGroup + ", status=" + status + ", reporting_manager=" + reporting_manager
			+ ", dependents=" + dependents + ", education=" + education + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
	result = prime * result + ((Employ_ID == null) ? 0 : Employ_ID.hashCode());
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
	result = prime * result + ((dependents == null) ? 0 : dependents.hashCode());
	result = prime * result + ((education == null) ? 0 : education.hashCode());
	result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((reporting_manager == null) ? 0 : reporting_manager.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
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
	Employee other = (Employee) obj;
	if (DOB == null) {
		if (other.DOB != null)
			return false;
	} else if (!DOB.equals(other.DOB))
		return false;
	if (Employ_ID == null) {
		if (other.Employ_ID != null)
			return false;
	} else if (!Employ_ID.equals(other.Employ_ID))
		return false;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (bloodGroup == null) {
		if (other.bloodGroup != null)
			return false;
	} else if (!bloodGroup.equals(other.bloodGroup))
		return false;
	if (dependents == null) {
		if (other.dependents != null)
			return false;
	} else if (!dependents.equals(other.dependents))
		return false;
	if (education == null) {
		if (other.education != null)
			return false;
	} else if (!education.equals(other.education))
		return false;
	if (enddate == null) {
		if (other.enddate != null)
			return false;
	} else if (!enddate.equals(other.enddate))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (gender != other.gender)
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	if (reporting_manager == null) {
		if (other.reporting_manager != null)
			return false;
	} else if (!reporting_manager.equals(other.reporting_manager))
		return false;
	if (startDate == null) {
		if (other.startDate != null)
			return false;
	} else if (!startDate.equals(other.startDate))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
  
  
  
  
  
  
  
  
}
