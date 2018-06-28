package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="description")
	private String description;
	@Column(name="website")
	private String website;
	@Column(name="contact")
	private String contact;
	@Column(name="address")
	private String address;
	@Column(name="like_count")
	private String like_count;
	
	public Restaurant() {
		super();
	}

	public Restaurant(Long id, String name, String city, String description, String website, String contact,
			String address, String like_count) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.description = description;
		this.website = website;
		this.contact = contact;
		this.address = address;
		this.like_count = like_count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLike_count() {
		return like_count;
	}

	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}
	
}

