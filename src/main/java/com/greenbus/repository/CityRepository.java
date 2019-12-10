package com.greenbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenbus.entity.City;
/**
 * Here,CityRepository 
 * @author Janani.V
 * @since 12-10-2019
 *
 */
@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
