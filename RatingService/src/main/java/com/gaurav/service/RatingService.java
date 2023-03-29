package com.gaurav.service;

import java.util.List;
import java.util.Optional;

import com.gaurav.model.Rating;



public interface RatingService {
public Rating saveRating(Rating s);
public List<Rating> getAllRatings();
public Rating getRatings(int id);
public List<Rating> getRatingByUserId(int userid);
public List<Rating> getRatingByHotelId(int hotelid);


}
