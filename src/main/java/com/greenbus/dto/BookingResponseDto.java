package com.greenbus.dto;

import java.util.List;

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
public class BookingResponseDto {
	
	private Integer statusCode;
	private String message;
	
	private List<BookingRequestDto> bookingDetails;

}
