package com.gaurav.service.impl;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Hotel;

import com.gaurav.repository.HotelRepo;
import com.gaurav.service.HotelService;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepo hotelRepository;

	@Override
	public Hotel saveHotel(Hotel s) {
		// TODO Auto-generated method stub
		return hotelRepository.save(s);
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotels(int id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).get();
	}

	
	

}
