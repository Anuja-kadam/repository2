package com.edu.OnlineGroceryDelivery.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name ="customerTbl" )
public class Customer {
	

	@Id
	@GeneratedValue(generator="seq2", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq2", initialValue=201)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private long contactNo;
	
	@OneToMany(mappedBy="customer",cascade= CascadeType.ALL, fetch= FetchType.LAZY)
	@JsonIgnoreProperties("customer")
	private List<Address> address;
	
	@OneToMany(mappedBy= "customer",cascade= CascadeType.ALL, fetch= FetchType.LAZY)
	@JsonIgnoreProperties("customer")
	private List<Order> order;	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Customer(long id, String firstName, String lastName, String email, long contactNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contactNo=" + contactNo + "]";
	}
	
	
	

	
}
