package com.greenbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbus.dto.CityDto;
import com.greenbus.service.CityService;

@RestController
@RequestMapping("/cities")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping
	public ResponseEntity<List<CityDto>> getCities() {
		List<CityDto> cityList = cityService.getAllCities();
		return new ResponseEntity<>(cityList, HttpStatus.OK);

	}

}
