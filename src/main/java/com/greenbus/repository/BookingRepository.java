package com.greenbus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenbus.entiry.BusTicketBooking;
/**
 * 
 * @author akuthota.raghu
 *
 */
@Repository
public interface BookingRepository extends JpaRepository<BusTicketBooking, Integer> {

}
