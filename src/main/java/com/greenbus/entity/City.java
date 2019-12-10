package com.greenbus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * Here, City entity has 2 fields,it responsible for city classes
 * @author Janani.V
 * @since 12-10-2019
 * 
 */
@Entity
@Getter
@Setter
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

}
