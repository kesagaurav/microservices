package com.gaurav.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Rating;

import com.gaurav.repository.RatingRepo;
import com.gaurav.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	private RatingRepo ratingRepository;

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating getRatings(int id) {
		// TODO Auto-generated method stub
		return ratingRepository.findById(id).get();
	}

	@Override
	public List<Rating> getRatingByUserId(int userid) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserid(userid);
	}

	

	@Override
	public List<Rating> getRatingByHotelId(int hotelid) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelid(hotelid);
	}
	
	
	
	@Override
	public Rating saveRating(Rating s) {
		// TODO Auto-generated method stub
		return ratingRepository.save(s);
	}

}
