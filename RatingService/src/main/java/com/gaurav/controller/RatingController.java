package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Rating;

import com.gaurav.service.RatingService;

@RestController
public class RatingController {
	@Autowired
	private RatingService service;

	@PostMapping("/rating")
	public Rating saveHotel(@RequestBody Rating s) {
		// TODO Auto-generated method stub
		return service.saveRating(s);
	}

	@GetMapping("/ratings")
	public List<Rating> getAllUsers() {
		// TODO Auto-generated method stub
		return service.getAllRatings();
	}

	@GetMapping("/rating/{id}")
	public Rating getHotels(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getRatings(id);
	}

	@GetMapping("/users/{userid}")
	public List<Rating> getRatingByUserId(@PathVariable int userid) {
		// TODO Auto-generated method stub
		return service.getRatingByUserId(userid);
	}

	@GetMapping("/hotels/{hotelid}")
	public List<Rating> getRatingByHotelId(@PathVariable int hotelid) {
		// TODO Auto-generated method stub
		return service.getRatingByHotelId(hotelid);
	}

}
