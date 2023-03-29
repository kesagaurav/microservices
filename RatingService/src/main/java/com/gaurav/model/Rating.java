package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int hotelid;
	private int userid;
	private int rating;
	private String feedback;
	
}
