package com.ecom.eCommerceWebsite.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="CATEGORY")
public class Category {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
}
