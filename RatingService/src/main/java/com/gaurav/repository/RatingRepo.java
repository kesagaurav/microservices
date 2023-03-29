package com.gaurav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.Rating;


@Repository
public interface RatingRepo extends JpaRepository<Rating, Integer> {

	List<Rating> findByUserid(int userid);
	List<Rating> findByHotelid(int hotelid);
	
}
