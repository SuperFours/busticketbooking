package com.greenbus.dto;

import java.time.LocalDateTime;

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
@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class BookingRequestDto {
	
	private String busName;
	private String busNumber;
	private String busType;
	private Integer sourceCityId;
	private Integer destCityId;
	private LocalDateTime busArrivalTime;
	private LocalDateTime busDepartureTime;
}
