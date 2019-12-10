package com.greenbus.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenbus.dto.CityDto;
import com.greenbus.entity.City;
import com.greenbus.repository.CityRepository;

import lombok.extern.slf4j.Slf4j;
/**
 * CityServiceImpl-city Service Implementation is responsible for the methods under the city entity
 * @author Janani.V
 * @since 12-10-2019
 *
 */
@Service
@Slf4j
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	
	/**
	 * getAllCities- In this method ,we will get all the cities from database.
	 * @return List of the cities using CityDto 
	 * CityRepository is used to get the findall method from the jpa repository 
	 */
	@Override
	public List<CityDto> getAllCities() {
		List<CityDto> cities = new ArrayList<>();
		List<City> cityList = cityRepository.findAll();
		log.info(" getting city details");
		cities = cityList.stream().map(this::convertEntityToDto).collect(Collectors.toList());
		return cities;
	}
	
	/**
	 * Here, convertEntityToDto is used to convert city entity into cityDto
	 * Beanutils is used for copy the properties of source to target
	 */
	private CityDto convertEntityToDto(City city) {
		CityDto cityDto = new CityDto();
		BeanUtils.copyProperties(city, cityDto);
		log.info("converting entity into Dto");
		return cityDto;
	}

}
