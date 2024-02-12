package com.ecom.eCommerceWebsite.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name="CUSTOMER")
@Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(unique = true)
	private String username;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String address;
}
