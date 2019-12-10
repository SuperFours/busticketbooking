package com.greenbus.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.greenbus.repository.BookingRepository;
/**
 * 
 * @author akuthota.raghu
 *
 */
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepository;

}
