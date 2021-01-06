package com.telusko.demorestapi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Alien {
//	private int Id;
//	private String name;
//	private int points;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPoints() {
//		return points;
//	}
//	public void setPoints(int points) {
//		this.points = points;
//	}
//
//	public int getId() {
//		return Id;
//	}
//	
//	public void setId(int Id) {
//		this.Id = Id;
//	}
//	
//	@Override
//	public String toString() {
//		return "Alien [name=" + name + ", points=" + points + ", Id=" + Id + "]";
//	}
	
private String code;
private String name;
private String gender;
private float annualsalary;
private String dateOfBirth;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public float getAnnualsalary() {
	return annualsalary;
}
public void setAnnualsalary(float annualsalary) {
	this.annualsalary = annualsalary;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
@Override
public String toString() {
	return "Alien [code=" + code + ", name=" + name + ", gender=" + gender + ", annualsalary=" + annualsalary
			+ ", dateOfBirth=" + dateOfBirth + "]";
}



}
