package com.gaurav.service;

import java.util.List;
import java.util.Optional;

import com.gaurav.model.Hotel;



public interface HotelService {
public Hotel saveHotel(Hotel s);
public List<Hotel> getAllHotels();
public Hotel getHotels(int id);


}
