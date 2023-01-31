package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="doctor")
@Entity
public class Doctor {
	@Column(name="d_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int d_id;
	@Column(name="d_name")
	private String d_name;
	@Column(name="email")
	private String email;
	@Column(name="contact_no")
	private String contact_no;
	@Column(name="qualifications")
	private String qualifications;
	@Column(name="gender")
	private String gender;
	@Column(name="blood_group")
	private String blood_group;
	@Column(name="date_of_join")
	private Date date_of_join;
	@Column(name="address")
	private String address;
	@Column(name="speciality")
	private String speciality;
	
	public Doctor() {
		
	}

	public Doctor(int d_id, String d_name, String email, String contact_no, String qualifications, String gender,
			String blood_group, Date date_of_join, String address, String speciality) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.email = email;
		this.contact_no = contact_no;
		this.qualifications = qualifications;
		this.gender = gender;
		this.blood_group = blood_group;
		this.date_of_join = date_of_join;
		this.address = address;
		this.speciality = speciality;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
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

	public Date getDate_of_join() {
		return date_of_join;
	}

	public void setDate_of_join(Date date_of_join) {
		this.date_of_join = date_of_join;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	

}
