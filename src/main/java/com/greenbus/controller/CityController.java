package com.greenbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenbus.dto.CityDto;
import com.greenbus.service.CityService;

import lombok.extern.slf4j.Slf4j;
/**
 * CityController- controlling city entities and it has some methods under the city entity
 * @author Janani.v
 * @since 12-10-2019
 * @version V1
 *
 */
@RestController
@RequestMapping("/cities")
@Slf4j
public class CityController {

	@Autowired
	CityService cityService;

	/**
	 * GetCities method - implements the getAllCities method 
	 * Response Entity is used 
	 * @return list of cities 
	 */
	@GetMapping
	public ResponseEntity<List<CityDto>> getCities() {
		List<CityDto> cityList = cityService.getAllCities();
		log.info("get all cities");
		return new ResponseEntity<>(cityList, HttpStatus.OK);

	}

}
