package com.edu.OnlineGroceryDelivery.entity;

import java.util.function.IntPredicate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="addressTbl")
public class Address {

	@Id
	@GeneratedValue(generator="seq1", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq1", initialValue=101)
	private long id;
	private String city;
	private String streetName;
	private long postalCode;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name= "custId")
	@JsonIgnoreProperties("address")
	private Customer customer;
	
	public Address(long id, String city, String streetName, long postalCode) {
		super();
		this.id = id;
		this.city = city;
		this.streetName = streetName;
		this.postalCode = postalCode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", streetName=" + streetName + ", postalCode=" + postalCode
				+ "]";
	}
	 
	 
	
	
}
	
