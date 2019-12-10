package com.greenbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbus.service.BookingService;
/**
 * 
 * @author akuthota.raghu
 *
 */
@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;

}
