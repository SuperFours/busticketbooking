package com.greenbus.entiry;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author akuthota.raghu
 *
 */

@Entity
@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Table(name="BUS_TICKET_BOOKING")
public class BusTicketBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String busName;
	private String busNumber;
	private String busType;
	private Integer sourceCityId;
	private Integer destCityId;
	private LocalDateTime busArrivalTime;
	private LocalDateTime busDepartureTime;
	
}
