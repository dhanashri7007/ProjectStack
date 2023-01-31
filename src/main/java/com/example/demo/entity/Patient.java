package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="patient")
@Entity
public class Patient {
	@Column(name="p_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	@Column(name="p_name")
	private String p_name;
	@Column(name="address")
	private String address;
	@Column(name="contact_no")
	private String contact_no;
	@Column(name="age")
	private Integer age;
	@Column(name="gender")
	private String gender;
	@Column(name="blood_group")
	private String blood_group;
	@Column(name="birth_date")
	private Date birth_date;
	public Patient() {
		
	}
	public Patient(int p_id, String p_name, String address, String contact_no, Integer age, String gender,
			String blood_group, Date birth_date) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.address = address;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		this.blood_group = blood_group;
		this.birth_date = birth_date;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	

}
