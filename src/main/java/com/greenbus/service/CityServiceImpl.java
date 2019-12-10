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

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	@Override
	public List<CityDto> getAllCities() {
		List<CityDto> cities = new ArrayList<>();
		List<City> cityList = cityRepository.findAll();
		cities = cityList.stream().map(this::convertEntityToDto).collect(Collectors.toList());
		return cities;
	}
	
	private CityDto convertEntityToDto(City city) {
		CityDto cityDto = new CityDto();
		BeanUtils.copyProperties(city, cityDto);
		return cityDto;
	}

}
