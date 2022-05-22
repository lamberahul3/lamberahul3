package com.crm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class contact {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstname", length=45, nullable= false)
	private String firstname;
	
	@Column(name="lastname", length=45, nullable=false)
	private String lastname;
	
	@Column(name ="email", length=128, nullable=false, unique= true )
	private String email; 
	
	@Column(name= "leadsource", length=45, nullable= false)
	private String leadsource;
	
	@Column(name="mobile", length=10, nullable=false, unique=true)
	private String mobile;
	
	public contact(){
		
	}
	
	public contact(String firstname, String lastname, String email, String leadsource, String mobile) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.leadsource = leadsource;
		this.mobile = mobile;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLeadsource() {
		return leadsource;
	}
	public void setLeadsource(String leadsource) {
		this.leadsource = leadsource;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
