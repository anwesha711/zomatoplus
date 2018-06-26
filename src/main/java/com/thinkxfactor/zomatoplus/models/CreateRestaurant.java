package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Restaurant")
public class CreateRestaurant implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private Long restaurantId;
	@Column(name="Name")
	private String Name;
	@Column(name="Type")
	private String Type;
	@Column(name="Cuisine")
	private String Cuisine;
	@Column(name="Address")
	private String Address;
	@Column(name="Website")
	private String Website;
	@Column(name="Phone")
	private String Phone;
	@Column(name="Regno")
	private String Regno;
	
	public CreateRestaurant() {
		super();
	}

	public CreateRestaurant(Long restaurant_id, String name, String type, String cuisine, String address, String website, String phone,
			String regno) {
		super();
		restaurantId=restaurant_id;
		Name = name;
		Type = type;
		Cuisine = cuisine;
		Address = address;
		Website = website;
		Phone = phone;
		Regno = regno;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getCuisine() {
		return Cuisine;
	}

	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getRegno() {
		return Regno;
	}

	public void setRegno(String regno) {
		Regno = regno;
	}
	
}
