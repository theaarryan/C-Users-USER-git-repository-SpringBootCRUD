package com.springboot.example.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class Education 
{  
//	@Id
//	@GeneratedValue( strategy = GenerationType.AUTO)
//	private Long edu_ID;
	
 @NotEmpty(message = " Need to be given which education background")
 private String Type;
 @NotNull
 @Past
 @DateTimeFormat(pattern = "dd/MM/yyyy")
 @Column(name = "Edu_Start_Date")
 private Date startDate;
 @NotNull
 @DateTimeFormat(pattern = "dd/MM/yyyy")
 @Column(name = "Edu_end_Date")
 private Date endDate;
 @NotEmpty
 private String Institution;
 @Embedded
 private Address Eaddresss ;
 @NotEmpty(message = " % or CGPA Must be given ")
 private double Percentage;
 
 public Education() {
	// TODO Auto-generated constructor stub
	 System.out.println(" in The education details");
}

public Education(String type, Date startDate, Date endDate, String institution, Address addresss, double percentage) {
	super();
	Type = type;
	this.startDate = startDate;
	this.endDate = endDate;
	Institution = institution;
	this.Eaddresss = addresss;
	Percentage = percentage;
}

public String getType() {
	return Type;
}

public void setType(String type) {
	Type = type;
}

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Date getEndDate() {
	return endDate;
}

public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

public String getInstitution() {
	return Institution;
}

public void setInstitution(String institution) {
	Institution = institution;
}

public Address getAddresss() {
	return Eaddresss;
}

public void setAddresss(Address addresss) {
	this.Eaddresss = addresss;
}

public double getPercentage() {
	return Percentage;
}

public void setPercentage(double percentage) {
	Percentage = percentage;
}

@Override
public String toString() {
	return "Education [Type=" + Type + ", startDate=" + startDate + ", endDate=" + endDate + ", Institution="
			+ Institution + ", addresss=" + Eaddresss + ", Percentage=" + Percentage + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Institution == null) ? 0 : Institution.hashCode());
	long temp;
	temp = Double.doubleToLongBits(Percentage);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((Type == null) ? 0 : Type.hashCode());
	result = prime * result + ((Eaddresss == null) ? 0 : Eaddresss.hashCode());
	result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
	Education other = (Education) obj;
	if (Institution == null) {
		if (other.Institution != null)
			return false;
	} else if (!Institution.equals(other.Institution))
		return false;
	if (Double.doubleToLongBits(Percentage) != Double.doubleToLongBits(other.Percentage))
		return false;
	if (Type == null) {
		if (other.Type != null)
			return false;
	} else if (!Type.equals(other.Type))
		return false;
	if (Eaddresss == null) {
		if (other.Eaddresss != null)
			return false;
	} else if (!Eaddresss.equals(other.Eaddresss))
		return false;
	if (endDate == null) {
		if (other.endDate != null)
			return false;
	} else if (!endDate.equals(other.endDate))
		return false;
	if (startDate == null) {
		if (other.startDate != null)
			return false;
	} else if (!startDate.equals(other.startDate))
		return false;
	return true;
}
 
}
